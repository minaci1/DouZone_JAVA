package Chapter06_Class;

public class Earth {
	// ��� ���� �� �ʱ�ȭ
	// ����� �빮�ڷ� ���� ���� ����
	static final double EARTH_RADIUS = 6400;
	
	// ��� ����
	static final double EARTH_SURFACE_AREA;
	
	// ���� ��Ͽ��� ��� �ʱ�ȭ
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}
