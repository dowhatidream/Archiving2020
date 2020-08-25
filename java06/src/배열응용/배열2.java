package 배열응용;

public class 배열2 {

	public static void main(String[] args) {
		String[] team = { "이시아", "이승연", "정시호", "이온" };
		int[] age = { 10, 20, 30, 22 };
		int[] height = { 156, 150, 190, 170 };

		System.out.println("이름\t 나이\t키");
		for (int i = 0; i < height.length; i++) {
			System.out.println(team[i] + "\t" + age[i] + "세" + "\t" + height[i] + "cm" + "\t");
		}
	}
}
