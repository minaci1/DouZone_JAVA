package Chapter06_Class;

public class Car3 {
	// �ʵ� ����
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������ ����
	// 1�� ������
	Car3() {}
	
	// 2�� ������
	Car3(String model) {
//		this.model = model;
		this(model, "����", 250);
		// this�� �ڱ� �ڽ��� ���Ѵ�.
		// ���� �����ڸ� ��ȣ���ϰ� �ȴ�.
	}
	
	// 3�� ������
	Car3(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
		// this�� �ڱ� �ڽ��� ���Ѵ�.
		// ���� �����ڸ� ��ȣ���ϰ� �ȴ�.
	}

	// 4�� ������
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
