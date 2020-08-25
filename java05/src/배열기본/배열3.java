package 배열기본;

import java.util.Random;

public class 배열3 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] data = new int[1000];
		int count = 0;

		for (int i = 0; i < 1000; i++) {
			data[i] = r.nextInt(100);
			if (data[i] > 98) {
				System.out.println(data[i]);
				count++;
			}
		}
		System.out.println("총 개수: " + count);
	}

}
