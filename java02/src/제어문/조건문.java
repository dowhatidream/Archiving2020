	package 제어문;

public class 조건문 {

	public static void main(String[] args) {
		// 조건이 여러개 일 때
		// if~else, if~...~else
		// if, if, if,...
		
		int score = 89;
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}
		else if (score > 60) {
			System.out.println("D");			
		}
		else {
			System.out.println("F");
		}
	}

}
