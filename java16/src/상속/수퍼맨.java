package 상속;

public class 수퍼맨 extends 맨{
	// 멤버변수3, 멤버메서드2
	boolean fly;
	
	public 수퍼맨() {
		super();
	}

	public 수퍼맨(boolean fly, int power) {
		super(power);
		this.fly = fly;
	}

	public void space() {
		System.out.println("날다");
	}

	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}
