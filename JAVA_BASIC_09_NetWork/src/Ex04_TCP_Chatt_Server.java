import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_TCP_Chatt_Server {
	public static void main(String[] args) {
		ServerSocket serversocket = null;

		try {
			serversocket = new ServerSocket(9999);
			System.out.println("대기중");
			Socket socket = serversocket.accept();
			System.out.println("클라도착!~");

			// 기존코드
			// read
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			new ServerSend(socket).start();
			new ServerReceive(socket).start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				serversocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("메인종료!");
	}

}

//read 전용 Thread
class ServerSend extends Thread {
	Socket socket;

	public ServerSend(Socket socket) { // new ServerSend(socket).start(); 생성자를 통해서 받기
		this.socket = socket;
	}

	@Override
	public void run() { // Thread 의 main 역할
		// 기존코드
		// write
		// OutputStream out = socket.getOutputStream();
		// DataOutputStream dos = new DataOutputStream(out);

		BufferedReader br = null; // -> [[아웃풋스트림 대신 사용]]
		PrintWriter pw = null; // [[DataOutputStream 대신 사용]]

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				String data = br.readLine(); // sc.nextLine()
				if (data.equals("exit"))
					break;
				pw.print(data); // 접속한 클라이언트에게 메시지 보내기
								// dos.writeUTF(msg);
			}
			System.out.println("server send 작업 종료");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
				pw.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
}

//write 전용 Thread
class ServerReceive extends Thread {
	Socket socket = null;

	public ServerReceive(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println("client 받은 메시지 [ " + data + " ]");
			}
			System.out.println("ServerRead종료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}