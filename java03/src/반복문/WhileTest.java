package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		// 계속 반복하고자 하는 경우
		while (true) {
			System.out.println("전 돌았어요.");
			String choice = JOptionPane.showInputDialog("계속 하실래요?(계속-0, 멈춤-1)");
			if (choice.equals("1")) {
				System.out.println("하지만 이제 그만 돌래요..");
				System.exit(0); // 아예 프로그램 종료
//				break; // while 반복문을 종료. while 아래에 있는 것들을 계속 실행
			}
		}

		// 제한된 횟수로 반복하고자 하는 경우
//		int i = 0; // 시작값
//		while (i < 10) { // 조건식
//			System.out.println("전 조금 돌았어요. 한 " + i + "번 정도요."); // 실행내용
//			i++;
//		}
	}

}
