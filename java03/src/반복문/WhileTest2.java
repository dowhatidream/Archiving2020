package 반복문;

import javax.swing.JOptionPane;

public class WhileTest2 {

	public static void main(String[] args) {
		int yes = 0;
		int no = 0;
		int etc = 0;

		while (true) {
			String answer = JOptionPane.showInputDialog("당신의 생각은 어때요? (yes, no, etc, exit)");
			if (answer.equals("exit")) {
				System.out.println("긍정적: " + yes + " 부정적: " + no + " 기타: " + etc);
				System.exit(0);
			} else if (answer.equals("yes")) {
				System.out.println("그래요. 긍정적이군요.");
				yes++;
			} else if (answer.equals("no")) {
				System.out.println("흠. 부정적이군요.");
				no++;
			} else {
				System.out.println("잘 모르겠나요?");
				etc++;
			}

		}
	}

}
