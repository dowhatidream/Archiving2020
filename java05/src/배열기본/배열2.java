package 배열기본;

import java.util.Random;

public class 배열2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] data = new int[100];

		for (int i = 0; i < data.length; i++) {
			data[i] = r.nextInt(100);
		}
		for (int i : data) {
			System.out.println(i);
		}

		System.out.println("첫/끝값 합계: " + (data[0] + data[data.length - 1]));
	}
}
