import java.util.ArrayList;
import java.util.List;

//함수적 인터페이스 
@FunctionalInterface
interface MyLamdaFuction {
	int max(int a, int b);
}

public class Lamda_01 {

	public static void main(String[] args) {
		
		//기존 방식 익명객체 만들어서 익명함수로 사용
		System.out.println(new MyLamdaFuction() {
			
			@Override
			public int max(int a, int b) {
				
				return a>b? a:b; // 구현
			}
		}.max(3,5));
		
		//람다식 (우리가 배우려는 것)
		MyLamdaFuction lamdaFuction = (int a,int b) -> a>b? a:b;
		System.out.println(lamdaFuction.max(0, 0));
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("c");
		list.add("react");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		list.stream().forEach((String str)->{System.out.println(str);}); // stream 단점 : 한번 사용하면 재사용 불가
		list.stream().forEach(str -> {System.out.println(str);});
		list.stream().forEach(System.out::println); //참조로 값 유추
		
	}

}
