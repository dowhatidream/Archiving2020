package ������;

public class Day {
	String doing;
	int time;
	String location;

//	public Day() {
//		super();
//	}

	// �޼��� �̸� �����ϰ� �� �� ����. �� �Է°�(�Ķ����)�� �޶�� ��
	// �ϳ��� �̸��� �޼��� �̸����� �ؼ� ������ ���� �� ����
	// �����ε�(overloading)
	// ������(�ϳ��� �̸����� �پ��� ������ �޼��带 ����)
	
	public Day(String doing, int time, String location) {
		super();
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
