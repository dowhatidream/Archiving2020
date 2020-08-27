package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] seat = new int[3][5];
		// 배열은 선언한 순간 공간이 할당됨
		// seat: 참조형 변수(주소)
		// int[3][5]: 기본형 변수(값)
		// 배열은 자동초기화. int는 -\0
		
		System.out.println(seat);
		// 0	1	2	3	4	
		// 0	0	0	0	0	
		seat[0][0] = 1;
		seat[2][4] = 3;
		seat[1][2] = 7;
		
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
