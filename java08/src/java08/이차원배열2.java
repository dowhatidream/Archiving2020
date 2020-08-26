package java08;

import java.util.Scanner;

public class 이차원배열2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] seat = new int[3][10]; // i, j
		final int price = 10000;
		int rsv = 0;

		while (true) {
			System.out.println("------------------------");
			for (int i = 0; i < 1; i++) {
				System.out.print("  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(" " + (j + 1));
				}
			}
			System.out.println();
			System.out.println("------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "  ");
				for (int j = 0; j < seat[i].length; j++) {
					System.out.print(seat[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("==좌석 선택(종료는 아무거나 -1)==");
			System.out.print("행(1~3)>> ");
			int noR = sc.nextInt();
			System.out.print("열(1~10)>> ");
			int noC = sc.nextInt();	

			// 예매 종료 여부
			if (noR == -1 || noC == -1) {
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seat[i][j] == 1) {
							rsv++;
						}
					}
				}
				System.out.println("예매 종료. 총 " + rsv + "좌석, " + (rsv * price) + "원입니다.");
				break; // while문 종료
			}

			// 좌석번호 검증
			if (!(noC <= 10 && noC >= 1) || !(noR <= 3 && noR >= 1)) { // 입력한 좌석번호가 범위 내에 존재하지 않는가?
				System.out.println("존재하지 않는 좌석입니다. 다시 입력해주세요. "); // true. 안내문구 출력
			} else { // false. 존재함(유효한 좌석번호). 예매 진행
				if (seat[noR - 1][noC - 1] == 1) { // 기존에 예약된 자리인가?
					System.out.println("이미 예약된 자리입니다. 다시 입력해주세요. "); // true. 안내문구 출력
				} else { // false. 예매 진행
					seat[noR - 1][noC - 1] = 1; // 예매여부를 1로 바꿔주기 위해 1 대입
					System.out.println("예약되었습니다."); // 안내문구 출력
				}
			}
			System.out.println(); // 간격 조정을 위한 출력
		}
	}
}
