package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		int ok = 0;
		int no = 0;
		int etc = 0;

		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("어때요? 할래요?");
			if (data.equals("ok")) {
				System.out.println("난 동의했어.");
				ok++;
			} else if (data.equals("no")) {
				System.out.println("나는 비동의야.");
				no++;
			} else {
				System.out.println("그렇담 나는 중립을 지킬게.");
				etc++;
			}
		}
		System.out.println("ok: " + ok + " no: " + no + " etc: " + etc);

	}

}
