package 배열기본;

import java.util.Random;

public class 배열4 {

	public static void main(String[] args) {
		Random r = new Random();

		int[] myA = new int[1000]; // 내가 푼 1000문제
		int[] a = new int[1000]; // 정답 1000개
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			myA[i] = r.nextInt(4); // 0~3까지 랜덤값 생성 후 대입(내 문제)
			a[i] = r.nextInt(4); // 0~3까지 랜덤값 생성 후 대입(정답)
			String s = "오답";

			if (myA[i] == a[i]) { // 같으면
				s = "정답";
				count++; // 카운트
			}
			System.out.println(i + "번     " + a[i] + "   " + myA[i] + "     " + s);
		}
		System.out.println();
		System.out.println("틀린 개수: " + (a.length - count) + "개");
		System.out.println("맞은 개수: " + count + "개");
		System.out.println("총 점수: " + count + "점(문항 당 1점)");
	}
}
