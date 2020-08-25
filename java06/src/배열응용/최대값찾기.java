package 배열응용;

public class 최대값찾기 {

	public static void main(String[] args) {
		int[] num = { 2424, 1929, 1, 2, 121212, 6060, 1, 24, -11111 };
		// 해당 인덱스까지의 최댁밧을 저장해두기로 함.

		int max = num[0];
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			// 이전까지의 최대값은 max에 들어있음
			// 배열의 인덱스의 값을 하나씩 꺼내서 최대값보다 큰지 비교
			// 해당 인덱스의 값이 이전까지의 최대값보다 더 크면 최대값 변수에 저장
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
