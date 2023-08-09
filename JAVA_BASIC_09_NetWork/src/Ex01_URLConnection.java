import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

/*
 java api는 네트워크 작업을 지원하기 위해서...
 java.net ... 다양한 클래스 제공
 
 1. 크로스 도메인 오류 (java 코드 처리 : read) 
 2. 크롤링 (특정 페이지 원하는 정보 추출)
 샘플) https://qi-b.qoo10cdn.com/partner/goods_image/6/3/6/9/356766369s.jpg
 
 
 */

public class Ex01_URLConnection {

	public static void main(String[] args) throws Exception {
		String urlstr = "https://qi-b.qoo10cdn.com/partner/goods_image/6/3/6/9/356766369s.jpg";
		URL url = new URL(urlstr); // 연결 (인터상에 주소) 객체 얻기
		// stream 두가지 , 1.데이터 연결, 2.필터 역할
		BufferedInputStream bis = new BufferedInputStream(url.openStream()); // 버퍼는 독자적으로 사용 안되지만 추상으로 구현한 객체가 있어야 하는데,
																				// URL은 가지고 있다.
		// input은 읽어 오는것 
		URLConnection uc = url.openConnection();
		// URLConnection 연결된 주소에서 원하는 정보 추출하기
		int filesize = uc.getContentLength();
		System.out.println("파일 크기 : " + filesize);
		System.out.println("파일형식  : " + uc.getContentType());

		// read 복제...
		FileOutputStream fos = new FileOutputStream("copyimage.jpg");
		// 파일생성(빈) , 프로젝트 폴더 default 경로

		byte[] buffer = new byte[2048];
		int n = 0;
		int count = 0;
		while ((n = bis.read(buffer)) != -1) {
			fos.write(buffer, 0, n);
			fos.flush();
			System.out.println("n : " + n);
			count += 1; // while 반복 횟수

		}
		System.out.println("count : "+count);
		fos.close();
		bis.close();
	}

}
