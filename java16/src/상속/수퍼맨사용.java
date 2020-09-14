package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 s = new 수퍼맨();
		s.age = 100; // 사람
		s.name = "김수퍼"; // 사람
		s.power = 1000; // 맨
		s.fly = true; // 수퍼맨
		
		System.out.println(s);
		
		s.eat(); // 사람
		s.run(); // 맨
		s.space(); // 수퍼맨
	}

}
