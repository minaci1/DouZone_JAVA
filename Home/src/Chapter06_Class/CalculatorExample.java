package Chapter06_Class;

public class CalculatorExample {
	public static void main(String[] args) {
		// Calculator ��ü ����
		Calculator myCalc = new Calculator();
		
		// ���ϰ��� ���� powerOn() �޼ҵ� ȣ��
		myCalc.powerOn();
		
		// plus �޼ҵ� ȣ�� �� 5�� 6�� �Ű������� �����ϰ�
		// ���� ����� ���� �޾� result ������ ����
		int result = myCalc.plus(5, 6);
		System.out.println("result : " + result);
		
		int x = 10;
		int y = 4;
		
		// divide() �޼ҵ� ȣ�� �� ���� x�� y�� ���� �Ű������� �����ϰ�
		// ������ ����� ���� �޾� result2 ������ ����
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// ���ϰ��� ���� powerOff() �޼ҵ� ȣ��
		myCalc.powerOff();
		System.out.println();
		
		/////////////////////////////////////////////
		
		// ��ü ����
		Calculator myCalcu = new Calculator();
		
		// ���簢���� ����
		double result3 = myCalcu.areaRectangle(10);
		
		// ���簢���� ����
		double result4 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("���簢���� ���� : " + result3);
		System.out.println("���簢���� ���� : " + result4);
	}
}
