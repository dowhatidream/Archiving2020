package 반복문;

import javax.swing.JOptionPane;

public class Quiz1 {

	public static void main(String[] args) {
		int target = 88; // target 변수 선언 후 초기화

		while (true) {
			String x = JOptionPane.showInputDialog("숫자를 맞춰보세요"); // 변수 x 선언 후 창을 통해 값 입력받아 대입
			int no = Integer.parseInt(x); // String 타입의 x를 int형으로 변환해서 no 변수에 대입

			if (no == target) { // no는 target와 값이 같은가?
				System.out.println("정답입니다!"); // true
				System.exit(0);
			} else {
				System.out.println("오답입니다.."); // false
			}
		}
	}

}
