package 배열기본;

import java.util.Scanner;

public class 입력해서넣어보기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력을 받아서 저장공간에 넣어두기
		// 나중에 꺼내서 연산이나 출력을 하고자 하는 경우
		// 변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)을 결정
		String data = null; // 참조형은 null로 초기화 시키기
		for (int i = 0; i < 3; i++) {
			data = sc.next();
		}
		System.out.println(data);
	}

}
