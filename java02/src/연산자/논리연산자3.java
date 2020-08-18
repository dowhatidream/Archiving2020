package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		
		String loginId = JOptionPane.showInputDialog("아이디");
		String loginPw = JOptionPane.showInputDialog("비밀번호");
		// String은 부품(class)
		
		if (id.equals(loginId) && pw.equals(loginPw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

}
