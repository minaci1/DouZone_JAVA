package Chapter06_Class;

public class CarExample2 {
	public static void main(String[] args) {
		// ��ü ����
		Car6 myCar = new Car6();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}
