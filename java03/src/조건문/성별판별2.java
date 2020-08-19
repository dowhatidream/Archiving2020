package 조건문;

public class 성별판별2 {

	public static void main(String[] args) {
		String ssn = "990101-2000000";
		// 프로그램 언어로 문자를 char로 받을 수 있는 방법은 없음.
		// String으로 입력을 받아서, 원하는 char만 추출을 함.
		char gender = ssn.charAt(7);
		String s = ssn.substring(0,6); // 여러개 추출해서 가져옴
		
		
		// 위치를 가지고 특정한 문자 한개를 추출하면 됨.
		// 위치 = index, 인덱스
		// 인덱스는 0부터 시작
		
		switch (gender) {
		case '2':
		case '4':
			System.out.println("여성입니다.");
			break;
		default:
			System.out.println("제 3의 성입니다.");
			break;
		}
	}

}
