package 반복문;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc 객체 선언

		int in = 0; // 변수 선언 후 초기화
		int out = 0; // 변수 선언 후 초기화
		int balance = 0; // 변수 선언 후 초기화

		System.out.println("--------------");
		System.out.println(" 은행 입출금 시스템");
		System.out.println("--------------");

		while (true) { // while 무한루프 시작
			System.out.println("1)입금  2)출금  3)잔고  4)종료"); // 루프 시작시 고정멘트 출력
			System.out.print("선택>> ");
			int choice = sc.nextInt(); // 변수 choice 선언 후 sc를 통해 int 값을 입력받아 대입

			if (choice == 4) { // choice는 4와 같은가?
				System.out.println("시스템을 종료합니다."); // true
				System.exit(0);
			} else if (choice == 1) { // 그렇담 choice는 1과 같은가?
				System.out.print("입금액>> "); // true
				in = sc.nextInt();
				balance += in; // balance의 값에서 in을 더한 다음 balance에 재대입
			} else if (choice == 2) { // 그렇담 choice는 2와 같은가?
				System.out.print("출금액>> "); // true
				out = sc.nextInt(); // sc를 통해 int값을 입력받아 변수 out에 대입
				if (out > balance) { // out은 balance보다 큰가?
					System.out.println("날강도세요? 다시 입력하세요."); // true
				} else { // false
					balance -= out; // balance의 값에 out을 뺀 다음 balance에 재대입
				}
			} else if (choice == 3) { // 그렇담 choice는 3과 같은가?
				System.out.print("잔고는 " + balance); // true
				System.out.println();
			} else { // 위의 모든 조건에 일치하지 않으면
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); // 얘 출력
			}
			System.out.println(); // 그냥 간격 조절용으로 출력
		}
	}
}
