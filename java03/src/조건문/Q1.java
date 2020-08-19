package 조건문;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 사용을 위한 객체 선언
		double result = 0; // 결과가 실수일수도 있으니..

		System.out.print("첫번째 수>> ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 수>> ");
		int num2 = sc.nextInt();
		
		System.out.print("연산>> ");
		String operator = sc.next();
		char o = operator.charAt(0);

		switch (o) {
		case '+':
			result = (double) num1 + num2; // result는 double이니까 num1이나 num2 둘 중 하나는 double로 만들어 연산 후 대입
			break;
		case '-':
			result = (double) num1 - num2;
			break;
		case '*':
			result = (double) num1 * num2;
			break;
		case '/':
			result = (double) num1 / num2;
			break;
		default:
			System.out.println("뭐하세요?");
			break;
		}
		System.out.println("결과: " + result);
	}

}
