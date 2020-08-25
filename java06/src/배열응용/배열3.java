package 배열응용;

public class 배열3 {

	public static void main(String[] args) {
		String[] name = {"국어", "수학", "과학", "컴퓨터", "영어"}; // 과목 이름 배열
		int[] list = {100, 99, 77, 87, 66}; // 1학기 성적 배열
		int[] list2 = list.clone(); // 2학기 성적 배열

		// 과학, 영어 점수 변경
		list2[2] = 44;
		list2[4] = 55;

		// 전체 점수 프린트(index 필요없으니까 for-each로 간단하게)
		for (String s : name) {
			System.out.print(s + "\t");
		}
		System.out.println();
		for (int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i : list2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println();

		// 점수가 변경된 과목의 수 및 과목명
		int count = 0; // 선언 후 0으로 초기화
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] != list2[i]) { // 점수가 다른가?
				count++; // true. count 1 증가
				System.out.println(name[i] + " 점수가 변경됨");
			}
		}
		System.out.println("변경된 과목의 수: " + count);
		System.out.println();

		// 학기 성적 평균 구하기
		int sum = 0; // 선언 후 0으로 초기화
		int sum2 = 0; // 선언 후 0으로 초기화

		for (int i = 0; i < list.length; i++) {
			sum += list[i]; // for문 돌면서 sum에 점수 대입*5. 결국 누적됨..
		}
		System.out.println("1학기 평균: " + (sum / list.length));

		for (int i = 0; i < list2.length; i++) {
			sum2 += list2[i]; // for문 돌면서 sum에 점수 대입*5. 결국 누적됨..
		}
		System.out.println("2학기 평균: " + (sum2 / list2.length));

		// 학기 성적 평균 비교
		String avg = null; // 선언 및 null로 초기화
		
		if (sum / list.length == sum2 / list2.length) { // 평균이 같은가?
			avg = "성적 평균이 같습니다."; // true면 출력
		} else if (sum / list.length > sum2 / list2.length) { // 그렇다면 1학기가 더 큰가?
			avg = "1학기 성적이 더 높습니다."; // true면 출력
		} else { // 위 조건들에 해당하지 않으면 출력
			avg = "2학기 성적이 더 높습니다.";
		}
		System.out.println(avg);
	}
}
