/*
객체 한개만 가지고 놀때는
this : 객체 자신을 가르키는 this(this.emno, this.ename)
this : 생성자를 호출하는 this(this(100, "red"))

상속관계
부모, 자식

super(상속 관계에서 자식이 부모 자원에 접근하는 주소를 제공한다) : 상속 관계에서 부모에 접근하는 방법
1. 상속 관계에서 부모 자원에 접근
2. 상속 관계에서 부모의 생성자를 호출

Tip)
C# : base()
JAVA : super()
 */

class Base {
	String basename;
	Base() {
		System.out.println("부모 클래스 기본 생성자");
	}
	
	Base(String basename) {
		this.basename = basename;
		System.out.println("basename : " + this.basename);
	}
	
	void method() {
		System.out.println("부모 method");
	}
}

class Derived extends Base {
	String dname;
	Derived() { // 생성자
		System.out.println("자식 클래스 기본 생성자");
	}
	
	Derived(String dname) {
		// 부모 생성자 호출(super)
//		super(dname); // 부모 클래스를 메모리에 올릴 때 생성자를 쫓아간다
		
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}

	@Override
	void method() {
//		super.method();
		System.out.println("부모함수 재정의");
	}
	
	void pMethod() {
		// super에 .을 찍으면 부모의 자원들을 볼 수 있다
		// 부모 자원을 사용하고 싶으면 자식 객체의 함수 안에서 super를 사용
		super.method();

	}
}

public class Ex06_Inherit_super {
	public static void main(String[] args) {
//		Derived derived = new Derived();
		// 부모가 먼저 메모리에 올라가고 자식이 메모리에 올라간다
		
		Derived d = new Derived("홍길동");
		// *********************************************************
		// 자식 타입인 Derived를 new 했을 때 Derived 안에 super()가 있는지 확인
		// super()가 없다면 부모의 기본 생성자로 이동
		// super()가 있다면 부모의 오버로딩 생성자로 이동한다
		// *********************************************************
		
		d.method(); // 재정의가 되면 부모 자원에 접근이 불가
		
		// 부모가 그리울땐 super를 사용하면 된다
		d.pMethod();
	}
}
