package Chapter06_Class;

public class Singleton {
	// ���ø����̼� ��ü���� �� �� ���� ��ü�� �����ؼ� ����ϰ� �ʹٸ� �̱��� ������ ����
	// �����ڸ� private ���� �����Ͽ� �ܺο��� new �����ڷ� �����ڸ� ȣ������ ���ϰ� ���� ��
	
	// private ���� ������ ���� ���� �ʵ� ����� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	// private ���� ������ ���� ������ ����
	private Singleton() {}
	
	// public ���� ������ ���� ���� �޼ҵ� ����
	public static Singleton getInstance() {
		return singleton;
	}
}
