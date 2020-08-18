package 기본입출력;

import javax.swing.JOptionPane;

public class Test1 {

	public static void main(String[] args) {
		// 1. 2개의 숫자를 입력받아 사칙연산
		String num1 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
		String num2 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		int add = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		System.out.println("=================");

		// 2. 숫자 입력을 2개 받아서, 시작값 5 종료값 100이면 5~100까지 프린트
		String num3 = JOptionPane.showInputDialog("첫번째 숫자를 입력해주세요");
		String num4 = JOptionPane.showInputDialog("두번째 숫자를 입력해주세요");

		int n3 = Integer.parseInt(num3);
		int n4 = Integer.parseInt(num4);

		if (n3 < n4) {
			for (int i = n3; i <= n4; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = n4; i <= n3; i++) {
				System.out.println(i);
			}
		}
		
		System.out.println("=================");

		// 3. 숫자 1개를 입력받고 문자 1개를 입력받아서 입력한 숫자 개수만큼 문자를 프린트
		String num5 = JOptionPane.showInputDialog("숫자를 입력해주세요");
		String s = JOptionPane.showInputDialog("문자를 입력해주세요");
		
		int n5 = Integer.parseInt(num5);
		for (int i = 0; i < n5; i++) {
			System.out.print(s);
		}
	}
}
