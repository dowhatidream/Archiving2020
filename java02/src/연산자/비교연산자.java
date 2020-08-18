package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		int x = 200;
		int y = 100;
		System.out.println("일치? " + (x == y)); // f
		System.out.println("불일치? " + (x != y)); // t
		System.out.println("이상? " + (x >= y)); // t
		System.out.println("초과? " + (x > y)); // t
	}

}
