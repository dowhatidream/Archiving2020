package 연산자;

public class 연습 {

	public static void main(String[] args) {
		byte x = 100;
		int y = x; // 가능. x는 int 범위에 충분히 들어감(자동형변환)

		int a = 300;
//		byte b = a; // 불가능. a는 byte 범위 초과

		double i = 400;
		int j = (int) i; // 가능. i를 강제형변환해서 int 범위로 줄이면 됨

		int w = 400;
		double v = w; // 가능. w는 double 범위에 충분히 들어감(자동형변환)

		System.out.println("y: " + y);
		System.out.println("b: " + "불가능");
		System.out.println("j: " + j);
		System.out.println("v: " + v);
	}
}
