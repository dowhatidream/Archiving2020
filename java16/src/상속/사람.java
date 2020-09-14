package 상속;

public class 사람 extends Object { // Object은 기본상속. 안 써도 무방함!
	// 멤버변수, 멤버메서드
	String name;
	int age;

	public 사람() {
		super();
	}

	public 사람(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("먹다");
	}

	@Override
	public String toString() {
		return "상속 [name=" + name + ", age=" + age + "]";
	}
}
