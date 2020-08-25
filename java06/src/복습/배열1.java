package 복습;

import java.util.Scanner;

public class 배열1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc 객체 선언
		int[] list = new int[5]; // int형 list 배열 선언. 0으로 초기화돼있는 상태.
		int sum = 0; // 합계를 저장할 int형 변수 sum 선언 및 초기화

		for (int i = 0; i < list.length; i++) { // 배열의 길이만큼 for 반복
			System.out.print("성적 입력: "); // 안내문구 출력
			list[i] = sc.nextInt(); // sc를 통해 int값 입력받아서 배열의 i번째에 대입
			sum += list[i]; // sum = sum + list[i] --> 오른쪽부터 산술연산 한 뒤 sum에 대입
		}

		System.out.println("평균: " + (sum / list.length)); // 산술연산 뒤 출력
	}

}
