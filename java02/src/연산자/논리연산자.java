package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		int id = 1111;
		int pw = 2222;
		
		int loginId = 1111;
		int loginPw = 2000;
		
		if (id == loginId && pw == loginPw) {
			// and연산자. 여러 조건이 모두 true일때 전체 논리적인 판단을 true로 판단하는 경우? 
			// and연산자인 경우 앞에 false를 먼저 넣어야 cpu를 효율적으로 이용할 수 있음
			// or연산자인 경우 앞에 true를 먼저 넣어야 cpu를 효율적으로 이용할 수 있음
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}

}
