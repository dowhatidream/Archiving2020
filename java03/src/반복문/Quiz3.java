package 반복문;

import javax.swing.JOptionPane;

public class Quiz3 {

	public static void main(String[] args) {
		int target = 88; // 변수 선언 후 초기화
		int count = 0; // 변수 선언 후 초기화
		int wrong = 0; // 변수 선언 후 초기화

		while (true) {
			String x = JOptionPane.showInputDialog("숫자를 맞춰보세요"); // 변수 x 선언 후 창을 통해 값 입력받아 대입
			int no = Integer.parseInt(x); // String 타입의 x를 int형으로 변환해서 no 변수에 대입
			count++; // count의 값을 1씩 증가하여 재대입

			if (no == target) { // no는 target와 값이 같은가?
				System.out.println("정답입니다! " + count + "번만에 맞추셨어요.."); // true
				System.out.println("무려 " + wrong + "번이나 틀리셨거든요..");
				System.exit(0);
			} else { // false
				wrong++;// wrong의 값을 1씩 증가하여 재대입
				if (no > target) { // no이 target보다 큰가?
					System.out.println("좀 크네요"); // true
				} else {
					System.out.println("좀 작네요");// false
				}
			} // if
		} // while
	} // main end
} // class end
