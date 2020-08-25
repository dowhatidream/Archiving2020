package 복습;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] num = new int[1000];

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // 0~999
		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(i + "번: " + i);
//		}
		int target = 100;
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == target) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("개수는 " + count + "개");
	}

}
