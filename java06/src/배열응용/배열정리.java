package 배열응용;

import java.util.Scanner;

public class 배열정리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = { 10, 20, 30, 40, 50 };
		System.out.println("1, 2번째 값 합계: " + (list[0] + list[1]));

		System.out.println();

		String[] list2 = new String[3];
		for (int i = 0; i < list2.length; i++) {
			System.out.print("문자 입력: ");
			list2[i] = sc.next();
		}
		System.out.println("**" + list2[0] + "보다는 " + list2[2] + "**");

		System.out.println();

		int[] list3 = { 11, 22, 33, 44 };
		for (int i = 0; i < list3.length; i++) {
			if (list3[i] == 33) {
				System.out.println("33은 " + i + "번째에 있어요.");
			}
		}

		System.out.println();

		int[] list4 = new int[5];
		for (int i = 0; i < list4.length; i++) {
			System.out.print("숫자 입력: ");
			list4[i] = sc.nextInt();
		}
		for (int i : list4) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();

		int[] list5 = { 66, 77, 88, 99 };
		int max = list5[0];

		for (int i = 0; i < list5.length; i++) {
			if (list5[i] > max) {
				max = list5[i];
			}
		}
		System.out.println("최댓값은 " + max);
		
		System.out.println();
		
//		int num = 0;
//		int index = 0;
//		int[] list6 = list5.clone();
//
//		for (int i = 0; i < list6.length; i++) {
//			if (list6[i] == 66) { // i번째에 66 값이 있으면
//				num = list6[i]; // num에 66을 저장하고
//				index = i;
//			}
//		}
//		list6[index] = 99;
//		for (int i = 0; i < list6.length; i++) {
//			if (list6[i] == 99) {
//				list6[i] = num;
//			}
//		}
//		
//		for (int i : list6) {
//			System.out.println(i);
//		}
		
		
		
		
		
		
		
		
		
		

	}

}
