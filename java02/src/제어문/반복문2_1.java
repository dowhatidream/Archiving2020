package 제어문;

public class 반복문2_1 {

	public static void main(String[] args) {
		// 1. 100부터 1까지 프린트
		int start = 100; // 시작값
		int end = 0; // 끝값
//		int minus = 1; // 감소값

		while (start > end) { // start값이 end보다 크면 무한반복
			System.out.println(start); // 출력
//			start -= minus; // start에서 minus만큼 감소시킨 후 다시 start에 대입
			start--;
		}

		
		// 2. 5부터 10까지 프린트
		int start2 = 5; // 시작값
		int end2 = 10; // 끝값
//		int add2 = 1; // 증가값

		while (start2 <= end2) { // start2값이 end2보다 작거나 같으면 무한반복
			System.out.println(start2); // 출력
//			start2 += add2; // start2에다 add2만큼 증가시킨 후 다시 start2에 대입
			start2++;
		}

		
		// 3. 1부터 100까지 2씩 증가하면서 프린트(명시적으로 증가값 밝힘)
		int start3 = 1; // 시작값
		int end3 = 100; // 끝값
		int add3 = 2; // 증가값

		while (start3 <= end3) { // start3값이 end3보다 작거나 같으면 무한반복
			System.out.println(start3); // 출력
			start3 += add3; // start3에다 add3만큼 증가시킨 후 다시 start3에 대입
		}
	}
}
