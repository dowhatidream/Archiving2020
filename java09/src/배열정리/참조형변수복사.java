package 배열정리;

public class 참조형변수복사 {

	public static void main(String[] args) {
		// 참조형변수 복사는 얕은 복사! 같은 값을 가리기게 됨
		// 깊은 복사를 해야 내가 원하는대로 따로따로 조작할 수 있음~~
		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = x;
		
		for (int i : x) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		for (int i : y) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		System.out.println();
		
		x[0] = 9;
		
		for (int i : x) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		for (int i : y) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		 
		y[0] = 11;
		
		for (int i : x) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		for (int i : y) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();
		int[] z = x.clone();
		System.out.println(x);
		System.out.println(z);
		for (int i : z) {
			System.out.print(i);
		}
		
	}

}


























