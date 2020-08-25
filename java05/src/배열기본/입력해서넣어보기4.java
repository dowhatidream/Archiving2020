package 배열기본;

import java.util.Random;
import java.util.Scanner;

public class 입력해서넣어보기4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 입력을 받아서 저장공간에 넣어두기
		// 나중에 꺼내서 연산이나 출력을 하고자 하는 경우
		// 변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)을 결정

		int[] data = new int[10000000];

		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(100)+1;
		}
		
		for (int s : data) {
			System.out.println(s);
		}
	}

}
