package 조건문;

public class Q2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) { // 행을 출력하기 위한 for문. 구구단이니까 1부터 시작..
			if (i % 2 == 1) { // i를 2로 나눈 나머지가 1인가?
				continue; // true. 이 밑으론 스킵하고 for 다시 처음부터 반복
			}
			for (int j = 1; j < 10; j++) { // 열을 출력하기 위한 for문. 구구단이니까 1부터 시작..
				int result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println();
		}
	}
}
