package Chapter06_Class;

class Calcul {
	public int add(int a, int b) {		
		return a + b;
	}
}

public class OOP_Method {
	public static void main(String[] args) {
		Calcul calculator = new Calcul();
		int result = calculator.add(10, 20);
		System.out.println(result);
		// add(10, 20) -> �޼ҵ�(�Ű���1, �Ű���2);
	}

}
