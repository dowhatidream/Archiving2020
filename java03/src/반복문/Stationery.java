package 반복문;

import java.util.Scanner;

public class Stationery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // sc 객체 선언

		// 각종 변수 선언 및 초기화
		int sticker = 0;
		int stickerPrice = 0;
		int note = 0;
		int notePrice = 0;
		int totalPrice = 0;

		System.out.print("스티커 개수: ");
		sticker = sc.nextInt(); // 값 입력받아서 sticker에 대입
		System.out.print("스티커 가격: ");
		stickerPrice = sc.nextInt(); // 값 입력받아서 stickerPrice에 대입

		System.out.print("노트 개수: ");
		note = sc.nextInt(); // 값 입력받아서 note에 대입
		System.out.print("노트 가격: ");
		notePrice = sc.nextInt(); // 값 입력받아서 notePrice에 대입

		System.out.println("스티커 총 가격: " + (sticker * stickerPrice)); // 연산해서 출력
		System.out.println("노트 총 가격: " + (note * notePrice));

		totalPrice = sticker * stickerPrice + note * notePrice; // 연산

		if (totalPrice >= 25000) { // totalPrice가 25000 이상인가?
			totalPrice -= 3000; // true. 원래값에서 3000 빼고 재대입
		}

		System.out.println("----------------------");
		System.out.println("총 결제금액: " + totalPrice + "원");
	}
}
