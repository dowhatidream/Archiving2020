package 배열응용;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		int[] list = {99, 23, 24, 11, 6, 4, 233, 540, 10, -5};
		int[] list2 = list.clone(); // 깊은 복사. 배열은 깊은 복사를 해야 한다.
		
		Arrays.sort(list2); // 파괴함수. RAM에 있는 원본을 변경함.
		
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i : list2) {
			System.out.print(i+" ");
		}
	}

}
