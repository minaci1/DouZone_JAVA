package Chapter06_Class;

public class Car5 {
	// �ν��Ͻ� �ʵ� ����
	int speed;
	
	// �ν��Ͻ� �޼ҵ� ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�");
	}
	
	static void simulate() {
		// ��ü ����
		Car5 myCar = new Car5();
		
		// �ν��Ͻ� ��� ���
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		// ���� �޼ҵ� ȣ��
		simulate();
		
		// ��ü ����
		Car5 myCar = new Car5();
		
		// �ν��Ͻ� ��� ���
		myCar.speed = 60;
		myCar.run();
	}
}
