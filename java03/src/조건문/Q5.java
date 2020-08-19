package 조건문;

public class Q5 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (j==3) {
					System.out.print("*");
				}
				else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
	}

}
