package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		// 두 수를 입력받아서 int로 변환 후 더한 다음 결과값 출력
		String a = JOptionPane.showInputDialog("숫자1 입력");
		String b = JOptionPane.showInputDialog("숫자2 입력");

		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);

		int sum = num1 + num2;

		System.out.println("두 수의 합은 " + sum);
	}
}
