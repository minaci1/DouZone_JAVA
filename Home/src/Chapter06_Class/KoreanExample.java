package Chapter06_Class;

public class KoreanExample {
	public static void main(String[] args) {
		// Korean ��ü ����
		Korean k1 = new Korean("���ڹ�", "011225-1234567");
		
		// Korean ��ü ������ �б�
		System.out.println("k1.knation : " + k1.nation);
		System.out.println("k1.kname : " + k1.name);
		System.out.println("k1.kssn : " + k1.ssn);
		System.out.println();
		
		// �� �ٸ� Korean ��ü ����
		Korean k2 = new Korean("���ڹ�", "930525-0654321");
		
		// �� �ٸ� Korean ��ü ������ �б�
		System.out.println("k2.knation : " + k2.nation);
		System.out.println("k2.kname : " + k2.name);
		System.out.println("k2.kssn : " + k2.ssn);
	}
}
