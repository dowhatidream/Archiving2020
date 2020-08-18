package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		// 자바에서의 코딩 방식
		// 특정한 일을 처리하는 부품을 만들어 전담
		// 자바에서는 자주 사용되는 부품은
		// 미리 메모리에 가져다놓고 있음
		// 부품의 이름을 대문자로 시작해서 사용하면 됨
		String hour = JOptionPane.showInputDialog("지금 몇 시죠?");
//		JOptionPane.showMessageDialog(null, "오! 지금은 " + hour + "시입니다.");
		// 기능을 처리해주는 단위: function() 함수
		// int <- String
		// 부품을 써야 함.
		
		int h = Integer.parseInt(hour);
		if (h < 17) {
			JOptionPane.showMessageDialog(null, "집에 가려면 멀었네요....");
		} else {
			JOptionPane.showMessageDialog(null, "곧 집에 가네요!!!!!!!!!!!!!!!!!");
		}

	}

}
