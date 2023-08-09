import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_TCP_Echo_Client {

	public static void main(String[] args) throws IOException  {
		Socket socket = new Socket("192.168.0.32",9999);
		System.out.println("서버와 연결되었습니다.");

		//read
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		//write
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("서버에 전송할 내용을 입력하세요 ");
			String msg =sc.nextLine();
			
			//서버 전송
			dos.writeUTF(msg);
			dos.flush(); // 버퍼를 비워지면 보내진다. 
			
			if(msg.equals("exit")) break;
			
			//서버로 전달 받은 메시지
			String servermsg = dis.readUTF();
			System.out.println("Echo 메시지 : "+ servermsg);
		}
		System.out.println("클라이언트 종료");
		
		dis.close();
		dos.close();
		socket.close();
		
	}

}
