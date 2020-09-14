package 상속;

public class 맨 extends 사람 {
	// 멤버변수2, 멤버메서드1 부모로부터 오버라이딩된 상태
	int power;

	public 맨() {
		super();
	}

	public 맨(int power) {
		super();
		this.power = power;
	}

	public void run() {
		eat(); // 상속받아서 내것이기 때문에 객체 생성하지 않고 바로 호출 가능! 부모거 내거
		System.out.println("달리다");
	}

	@Override
	public String toString() {
		return "맨 [power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}
