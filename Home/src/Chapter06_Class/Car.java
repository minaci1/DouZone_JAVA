package Chapter06_Class;

public class Car {
	// ���� ������
	// ������ �� ������ �ʴ� ��
	String company = "�����ڵ���";
	String model;	// null(�⺻��)
	String color = "����";
	int maxSpeed = 350;
	
	// ���� ������
	// ������ �� ���� �� �ִ� ��
	int speed;		// 0(�⺻��)
	int rpm;
	boolean start;	// false(�⺻��)
	
	// ��ǰ ������
	// ���� �������� �� �ɰ� �� �ִ� ��
	// ��ü�� ��, ���� ������ ���� �� �ִ�.
	Body body;
	// ������ �Ǹ���, �ǽ��� ������ ���� �� �ִ�.
	Engine engine;
	// Ÿ�̾�� ��Ʈ, Ʈ���� ������ ���� �� �ִ�.
	Tire tire;		// null(�⺻��)
}