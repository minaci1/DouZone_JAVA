package Chapter06_Class;

public class KoreanExample2 {
	public static void main(String[] args) {
		// ��ü ���� �� �ֹε�Ϲ�ȣ�� �̸� ����
		Korean2 k1 = new Korean2("123456-1234567", "���ڹ�");
		
		// �ʵ尪 �б�
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// final �ʵ�� ���� ������ �� ����
//		k1.nation = "USA"; // The final field Korean2.nation cannot be assigned
//		k1.ssn = "123-12-1234";
		
		// �� final �ʵ�� �� ���� ����
		k1.name = "���ڹ�";
	}
}
