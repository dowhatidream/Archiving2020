package 반복문;

import javax.swing.JOptionPane;

public class Quiz2 {

	public static void main(String[] args) {
		int target = 88; // target 변수 선언 후 초기화

		while (true) {
			String x = JOptionPane.showInputDialog("숫자를 맞춰보세요"); // 변수 x 선언 후 창을 통해 값 입력받아 대입
			int no = Integer.parseInt(x); // String 타입의 x를 int형으로 변환해서 no 변수에 대입

			if (no == target) { // no는 target와 값이 같은가?
				// true
				System.out.println("정답입니다!");
				System.exit(0);
			} else { // false
				if (no > target) { // no이 target보다 큰가?
					System.out.println("좀 크네요"); // true
				} else {
					System.out.println("좀 작네요"); // false
				}
			}
		}
	}

}
