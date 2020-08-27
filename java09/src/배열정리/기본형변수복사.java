package 배열정리;

public class 기본형변수복사 {

	public static void main(String[] args) {
		// 기본형 변수(정수, 실수, 문자, 논리)
		int x = 300;
		int y = x;
		
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
		x = 500;
		
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}

}
