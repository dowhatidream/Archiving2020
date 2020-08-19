package 조건문;

import java.util.Scanner;

public class 부서판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("사원번호 입력: ");
		String num = sc.next();
		String team = num.substring(0, 1);
//		char team = num.charAt(0);
		String teamName = "";
		String teamNum = num.substring(1, 4);

		if (team.equals("A") || team.equals("a")) {
			teamName = "기획부";
		} else if (team.equals("B") || team.equals("b")) {
			teamName = "총무부";
		} else if (team.equals("C") || team.equals("c")) {
			teamName = "개발부";
		} else {
			System.out.println("해당 부서 없음");
		}

		System.out.println("사원 부서는 " + teamName + "입니다.");
		System.out.println("사원 고유번호는 " + teamNum + "입니다.");
	}

}
