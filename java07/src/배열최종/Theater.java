package 배열최종;

import java.util.Scanner;

public class Theater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc 객체 생성
		int[] seat = new int[10]; // 10개의 좌석을 가진 배열 seat 생성(0으로 자동초기화 됐음)

		// 예매시스템 시작
		while (true) {
			int no = 0; // 입력받을 좌석번호 변수 선언 및 초기화

			// 좌석번호 출력
			System.out.println("-------------------------------");
			System.out.println("1  2  3  4  5  6  7  8  9  10");
			System.out.println("-------------------------------");

			// 예매현황 출력
			for (int i : seat) {
				System.out.print(i + "  ");
			}
			System.out.println();// 간격 조정을 위한 출력

			// 좌석번호 입력
			System.out.print("좌석 번호 입력(종료는 -1): ");
			no = sc.nextInt();

			// 예매 종료 여부
			if (no == -1) {
				int rsv = 0; // 예매한 좌석 수 넣을 변수 선언 및 초기화

				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						rsv++;
					}
				}
				System.out.println("예매 종료. 총 " + (rsv * 10000) + "원입니다.");
				break; // while문 종료
			}

			// 좌석번호 검증
			if (!(no <= 10 && no >= 1)) { // 입력한 좌석번호가 범위 내에 존재하지 않는가?
				System.out.println("존재하지 않는 좌석입니다. 다시 입력해주세요. "); // true. 안내문구 출력
			} else { // false. 존재함(유효한 좌석번호). 예매 진행
				if (seat[no - 1] == 1) { // 기존에 예약된 자리인가?
					System.out.println("이미 예약된 자리입니다. 다시 입력해주세요. "); // true. 안내문구 출력
				} else { // false. 예매 진행
					seat[no - 1] = 1; // 예매여부를 1로 바꿔주기 위해 1 대입
					System.out.println("예약되었습니다."); // 안내문구 출력
				}
			}
			System.out.println(); // 간격 조정을 위한 출력
		}
	}
}
