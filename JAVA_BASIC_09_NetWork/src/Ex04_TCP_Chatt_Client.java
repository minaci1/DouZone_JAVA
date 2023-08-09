import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//InnerClass (Outclass 자원 사용)
//InnerClass >> ClientSend
//InnerClass >> ClientReceive

public class Ex04_TCP_Chatt_Client {
	Socket socket;

	public Ex04_TCP_Chatt_Client() {
		try {
			socket = new Socket("192.168.0.32", 9999);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Chatt 서버와 연결되었습니다.");

		// ClientSendd Thread start
		// ClientReceive Thread start
		
		new ClientSend().start();
		new ClientReceive().start();
	}

	public static void main(String[] args) {
		Ex04_TCP_Chatt_Client client = new Ex04_TCP_Chatt_Client();
	}

	// Innerclass 작업
	class ClientSend extends Thread {
		@Override
		public void run()  { // Thread 의 main 역할

			// write 기존코드
			// OutputStream out = socket.getOutputStream();
			// DataOutputStream dos = new DataOutputStream(out); // 07 번 13번 확인

			BufferedReader br = null; // 서버 채팅창에 입력값 받기
			PrintWriter pw = null; // 클라이언트 전송...
			try {
				br = new BufferedReader(new InputStreamReader(System.in)); // 엔터를 기반으로 읽어 들일 수 있음 scanner 대체
				pw = new PrintWriter(socket.getOutputStream(), true);

				while (true) {
					String data = br.readLine(); // sc.nextLine()
					if (data.equals("exit"))
						break;
					pw.println(data); // 접속한 클라이언트에게 메시지 보내기
									// dos.writeUTF(msg);
				}
				System.out.println("server send 작업 종료");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					pw.close();
					br.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

		}
	}

	class ClientReceive extends Thread {
		@Override
		public void run() {
			BufferedReader br =null;
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String data = null;
				while((data=br.readLine()) != null) {
					System.out.println("Server에서 받은 메시지 "+" [ "+data+" ] ");
				}
				System.out.println("Client Read 종료");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
	 
}
