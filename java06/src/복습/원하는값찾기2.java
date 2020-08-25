package 복습;

import java.util.Random;

public class 원하는값찾기2 {

	public static void main(String[] args) {
		Random r = new Random(24);

		int[] num = new int[1000];

		int max = num[0];
		int maxCount = 0;

		int min = num[0];
		int minCount = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000) - 100; // 0~999 (최솟값을 조정하고 싶으면 빼주면 됨)
		} // 배열에 랜덤값 삽입

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		} // 배열에서 최댓값 찾아서 max에 대입(계속 반복하면서 점점 큰 값을 찾아나가~~)
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				maxCount++;
				System.out.println("최댓값 위치: " + i);
			}
		} // 찾은 최댓값의 위치와 개수 찾기

		System.out.println("최댓값: " + max); // 66661
		System.out.println("최댓값 개수: " + maxCount); // 2
		System.out.println();

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		} // 배열에서 최솟값 찾아서 min에 대입(계속 반복하면서 점점 작은 값을 찾아나가~~)
		for (int i = 0; i < num.length; i++) {
			if (num[i] == min) {
				minCount++;
				System.out.println("최솟값 위치: " + i);
			}
		} // 찾은 최솟값의 위치와 개수 찾기
		System.out.println("최솟값: " + min); // -1424
		System.out.println("최솟값 개수: " + minCount); // 1
	}

}
