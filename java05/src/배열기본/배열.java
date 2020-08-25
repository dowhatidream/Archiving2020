package 배열기본;

public class 배열 {

	public static void main(String[] args) {
		String[] name = { "이이경", "이시아", "정시호" };
		int[] age = { 24, 20, 33 };
		char[] gender = { 'f', 'f', 'm' };
		boolean[] hungry = { true, true, false };
		double[] weight = { 60.2, 6.7, 52.65 };

		for (int i = 0; i < name.length; i++) {
			System.out.print(i + "번째 이름: " + name[i] + " / ");
		}
		System.out.println();
		for (int i = 0; i < age.length; i++) {
			System.out.print(i + "번째 나이: " + age[i] + " / ");
		}
		System.out.println();
		for (int i = 0; i < gender.length; i++) {
			System.out.print(i + "번째 성별:  " + gender[i] + " / ");
		}
		System.out.println();
		for (int i = 0; i < hungry.length; i++) {
			System.out.print(i + "번째 상태: " + hungry[i] + " / ");
		}
		System.out.println();
		for (int i = 0; i < weight.length; i++) {
			System.out.print(i + "번째 무게: " + weight[i] + " / ");
		}
		System.out.println();
		System.out.println();

		// for-each: 배열의 첫위치값부터 하나씩 오른쪽으로 가면서 자동으로 꺼내주는 반복문
		// length보다 작을 때까지!
		// 단순히 꺼낼 때만 쓰고 배열에 값을 넣을 때는 사용 불가~
		for (double x : weight) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
		for (boolean b : hungry) {
			System.out.print(b + " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
		}
	}

}
