package Chapter06_Class;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
		// s1 ������ ���� ������ Student ��ü�� heap �޸𸮿� �ö󰡰� �ǰ�
		// s1 ������ heap �޸𸮿� �ö� Student ��ü�� �ּҰ��� ���� �ȴ�.
		
		Student s2 = new Student();
		System.out.println("s2 ������ �� �ٸ� Student ��ü�� �����մϴ�.");
		// s2 ������ ���� ������ Student ��ü�� heap �޸𸮿� �ö󰡰� �ǰ�
		// s2 ������ heap �޸𸮿� �ö� Student ��ü�� �ּҰ��� ���� �ȴ�.
		
		System.out.println(s1 == s2);
		// s1 ������ s2 ������ ���� heap �޸𸮿� �ö� �ٸ� Student ��ü�� �ּҰ��� ������ �ֱ� ������
		// s1 == s2�� false�� �ȴ�.
		
		Student s3 = s2;
		// s3 ������ heap �޸𸮿� �ö� s2�� Student ��ü �ּҸ� ���� �ȴ�.
		
		System.out.println(s2 == s3);
		// s2 ������ s3 ������ heap �޸𸮿� �ö� ���� Student ��ü�� �ּҰ��� ������ �ֱ� ������
		// s2 == s3�� true�� �ȴ�.
	}
}
