package 배열정리;

public class 이차원배열3 {

	public static void main(String[] args) {
		int[][] team = new int[4][];

		int[] kor = { 50, 60, 70, 80, 90 };
		int[] math = { 50, 60, 70 };
		int[] eng = { 50, 60, 70, 80, 90 };
		int[] sci = { 50 };

		team[0] = kor;
		team[1] = math;
		team[2] = eng;
		team[3] = sci;

		for (int i = 0; i < team.length; i++) {
			for (int j = 0; j < team[i].length; j++) {
				System.out.print(team[i][j] + " ");
			}
			System.out.println();
		}

	}

}
