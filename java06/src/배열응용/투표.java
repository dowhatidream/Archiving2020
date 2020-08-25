package 배열응용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class 투표 {

	public static void main(String[] args) {
		// 100명을 뽑는 투표 시스템을 만들어서 배열에 넣고 누가 1등인지 출력?
		Random r = new Random();

		String[] name = { "0김댕댕", "1이댕댕", "2박댕댕", "3최댕댕", "4유댕댕" }; // 후보 이름 저장
		int[] vote = new int[5];
		int[] count = new int[5]; // 투표 수 배열(당연히 이름 배열의 인덱스와 순서 같음)

		int first = count[0]; // 1등 득표 수
		int second = count[0]; // 2등 득표 수
		int index = 0; // 1등 득표 위치
		int index2 = 0; // 2등 득표 위치

		System.out.println("====투표 진행(vote)====");
		for (int i = 0; i < name.length; i++) {
			vote[i] = r.nextInt(5);
			System.out.println(i + "번째 투표: " + vote[i]);
			count[vote[i]]++; // 진짜 희한하다ㅋㅋ
		} // 투표(랜덤값)

		System.out.println();

		System.out.println("====개표(count)====");
		for (int i = 0; i < count.length; i++) {
			System.out.println(name[i] + ": " + count[i]);
		} // 득표 카운트

		System.out.println();

		for (int i = 0; i < count.length; i++) {
			if (count[i] > first) {
				first = count[i]; // 최대 득표수
				index = i; // 최대 득표수 위치
			} 
		} // 1등 추출
		for (int i = 0; i < count.length; i++) {
			if (count[i] < first && count[i] > second) {
				second = count[i];
				index2 = i;
			}
		} // 2등 추출
		
		System.out.println("====결과====");
		System.out.println("1등은 " + name[index] + "번, 득표수는 " + first);
		System.out.println("2등은 " + name[index2] + "번, 득표수는 " + second);
		
		
//		Arrays.sort(count);
//		
//		System.out.println("====결과====");
//		System.out.println("1등은 " + count[count.length-1] + "번");
//		System.out.println("2등은 " + count[count.length-2] + "번");
		

		
		
		
		
		
		
		
		
		
		
	}

}
