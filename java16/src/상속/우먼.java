package 상속;

public class 우먼 extends 사람 {
	String food;

	public 우먼() {
		super();
	}

	public 우먼(String food) {
		super();
		this.food = food;
	}

	public void killing() {
		System.out.println("원샷 원킬");
	}
}
