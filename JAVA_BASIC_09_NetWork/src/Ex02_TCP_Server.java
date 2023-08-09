import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
TCP 서버
현재 실행되고 있는 process(서버) 와 process(클라이언트) 연결


서버 : 192.168.0.195
포트 : 9999

 */
public class Ex02_TCP_Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(9999);
		System.out.println("접속 대기중 .. ");
		Socket socket = serversocket.accept();// 클라이언트 요청이 오면 (접속) // 소켓에 연결하면 한개 생성
		System.out.println("연결 완료"); // socket과 socket 연결
		// 연결 
		// 서버 : 클라이언트(read, write)
		// socket 과 socket TCP 통해서...
		// socket(input, output stream 내장)
	 
		//다시 확인 
		OutputStream out = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF("민아민아... 문자 데이터 Byte 통신입니다");
		
		System.out.println("서버 종료");
		
		dos.close();
		out.close();
		socket.close();
		serversocket.close(); 
	}

}
