package java08;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int me = 0; // 컴퓨터
		int meWin = 0;
		int you = 0; // 사람
		int youWinR = 0;
		int youWinS = 0;
		int youWinP = 0;
		int round = 0;

		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("가위바위보 게임(가위-1, 바위-2, 보-3, 종료-0)");
			System.out.println("--------------------------------------");

			// 사람 입력
			System.out.print("당신? ");
			you = sc.nextInt();

			// 게임 종료
			if (you == 0) { // 이것저것 출력 후 게임 종료
				System.out.println();
				System.out.println("게임을 종료합니다.");
				System.out.println();
				System.out.println("<결과>");
				System.out.println("전체 게임 횟수: " + round);
				System.out.println("제 승리 횟수: " + meWin);
				System.out.println("당신이 가위로 이긴 횟수: " + youWinS);
				System.out.println("당신이 가위로 이긴 횟수: " + youWinR);
				System.out.println("당신이 가위로 이긴 횟수: " + youWinP);
				break;
			}

			// 게임 진행
			if (!(you >= 1 && you <= 3)) {// 유효 범위 밖인가?
				System.out.println("잘못 입력하셨습니다."); // true. 안내 문구 출력
			}
			else { // 유효 범위 안
				me = r.nextInt(3) + 1; // 컴퓨터 랜덤값 생성 후 대입(1부터 시작하기 위해 +1)
				System.out.println("저: " + me);

				round++; // 게임 횟수 추가
				String result = null;

				if (you == me) { // 비겼는지 먼저 체크
					result = "비겼습니다.";
				}
				else if ((you == 1 && me == 3)) { // 사람이 '가위'로 이긴 라운드.
					result = "당신이 이겼습니다.";
					youWinS++; // 사람 가위 승리 1증가
				}
				else if ((you == 2 && me == 1)) { // 사람이 '바위'로 이긴 라운드.
					result = "당신이 이겼습니다.";
					youWinR++; // 사람 바위 승리 1증가
				}
				else if ((you == 3 && me == 2)) { // 사람이 '보'로 이긴 라운드.
					result = "당신이 이겼습니다.";
					youWinP++; // 사람 보 승리 1증가
				}
				else { // 컴이 이긴 라운드
					result = "제가 이겼습니다.";
					meWin++; // 컴승리 1증가
				}
				System.out.println(result); // 승패 결과 출력
			}
			System.out.println();
		}
	}
}
