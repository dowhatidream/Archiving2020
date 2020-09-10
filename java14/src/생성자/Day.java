package 생성자;

public class Day {
	String doing;
	int time;
	String location;

//	public Day() {
//		super();
//	}

	// 메서드 이름 동일하게 할 수 있음. 단 입력값(파라미터)이 달라야 함
	// 하나의 이름을 메서드 이름으로 해서 여러개 만들 수 있음
	// 오버로딩(overloading)
	// 다형성(하나의 이름으로 다양한 형태의 메서드를 구현)
	
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
