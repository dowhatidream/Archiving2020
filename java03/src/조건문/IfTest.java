package 조건문;

public class IfTest {

	public static void main(String[] args) {
		String data = "ok";
		if (data.equals("ok")) {
			System.out.println("난 동의했어.");
		} else if (data.equals("no")) {
			System.out.println("나는 비동의야.");
		} else {
			System.out.println("그렇담 나는 중립을 지킬게.");
		}
	}

}
