package Chapter06_Class;

public class Car4 {
	// �ʵ� ����
	int gas;
	
	// ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// ���ϰ��� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false��, 0�� �ƴϸ� true�� ����
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false; // false ���� �� �޼ҵ� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true; // true ���� �� �޼ҵ� ����
	}
	
	// ���ϰ��� ���� �޼ҵ�� gas �ʵ尪�� 0�̸� return ������ �޼ҵ� ����
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�.(gas�ܷ� : " + gas + ")");
				return; // �޼ҵ� ����
			}
		}
	}
}
