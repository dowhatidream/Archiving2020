package 연산자;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 큰 <- 작: 자동형변환
		int x = 100; // int는 -21억~21억, 4바이트
		byte y = 120; // byte는 -128~127, 1바이트
		x = y;
		System.out.println("x: " + x);

		// 작 <- 큰: 강제형변환. () 사용. () 안에는 자르고 싶은 데이터형
		int z = 127;
		byte w = (byte) z;
		System.out.println("w: " + w);

		int q = 1000;
//		byte t = (byte) q;
//		System.out.println("t: " + t); // 이건 불가..범위가 바뀌잖아!
		// 강제형변환은 강제로 변환하고자 하는 타입 범위에 값이 들어아야 가능함!! 아무때나ㄴㄴ
	}

}
