package 제어문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {

		String food = JOptionPane.showInputDialog("뭐 먹을래?");
		String result = "";
		
		if (food.equals("아이스크림")) {
			result = "뚜레주르 가자";
		} 
		else if (food.equals("아이스커피")) {
			result = "이디야 가자";
		} 
		else {
			result = "그냥 물 마셔라..";
		}
		System.out.println(result);
	}

}
