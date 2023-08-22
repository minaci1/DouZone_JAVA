import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
 Java는 객체지향 언어이기 때문에 기본적으로 함수형 프로그래밍이 불가능하다.
 
 JDK8 Stream API 제공 ... 람다식을 사용 
 
 함수형 인터페이스 등을 지원... java 이용해서 javascript 에서 사용했던 함수형을 API를 통해서 제공
 그 대표가 Stream API 는 데이터를 추상화하고 처리하는데 자주 사용하는 함수를 정의해 두었다.
 ex) select * from emp where sal > 2000 and ename = ' 길동' and ...
 위에서 쓰는 방식을 자바에서도 추상화된 함수를 구현할 수 있다. >> Stream API 구현 람다식 ....  
 => 쿼리에서는 전체 조회고 .  자바에서 where 쓰는게 가능함
 
 표준화 , 재사용성 높일 수 있다.
 => mybatis에서 걸러주기 때문에 쓸 이유가 없었다..... 어떤게 성능이 좋을까? 
 
 
 */
public class F_Program2 {

	public static void main(String[] args) {
		String[] namearr = {"Hulk","Captain","IronMan"};
		List<String>namelist = Arrays.asList(namearr);
		
		/*
		 아래 코드는 좋은 코드 입니다
		 만약에 더 간결하게 가독성 높게 ... 원본데이터 변형을 가하지 않고 ...
		 할 수 있는 방법이 있다면 더 좋은 코드...
		 
		 JAVA Stream API 원본의 데이터 변경이 없이 간결한 형태의 코드 작성 방법을 가지고 있다
		 
		 */
		/*
		Arrays.sort(namearr);
		Collections.sort(namelist);
		
		for(String str : namearr) {
			System.out.println(str);
		}
		for(String str : namelist) {
			System.out.println(str);
		}
		*/
		/*
		  JAVA Stream API 사용해서 리팩토링을 해보자
		 */
		
		//1. 원본 데이터가 아닌 별도 데이터 집합을 생성
		// Stream 은 Collection 보조하는 녀석 ...
		Stream<String> arraystream = Arrays.stream(namearr);
		Stream<String> namestream = namelist.stream(); // 모든 객체들은 내부적으로 stream 가지고 있다. 
		
		//복사된 데이터를 정렬해서 출력
		arraystream.sorted().forEach(System.out  :: println); // 참조 레퍼런스 ::
		namestream.sorted().forEach(System.out :: println);
		
		//Stream API 사용하면 코드의 라인수도 줄이고 ,,, 가독성도 높이고 ... 그런데 
		//쓰는건 나의 마음 .. 쓰지 않아도 잘먹고 잘 살 수 있으니까
		
	}

}
