package 데이터;

public class 문자열 {
	// 코드 자동 정리: ctrl + shift + f
	public static void main(String[] args) {
		// String: 기본데이터는 아니지만 사람들이 워낙 많이 쓰는 데이터의 형태이므로
		// 기본데이터처럼 쓰게 해놓은 것
		String name = "이시아";
		String company = "MS";
		System.out.println(name+"는 " + company + "소속일까?"); // +는 하나라도 String이면 모두 다 String으로..
		
		String sub; // 선언!하는 순간 메모리가 할당됨
		sub = "자바"; // 대입연산자 = 할당연산자
		System.out.println(sub+"는 참..재밌다");
		
		String day = "^_^..";
		System.out.println(day);
		// 대입없는 쓰레기값 상태인 경우, 연산도 안 되고, 출력도 안 됨.
	}

}
