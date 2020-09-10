package 생성자;

import java.util.ArrayList;

public class 나의일지 {

	public static void main(String[] args) {
		Day d1 = new Day("수업", 8, "집");
		Day d2 = new Day("산책", 1, "공원");
		Day d3 = new Day("잠", 5, "침대");
		
		ArrayList<Day> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		파일로저장 file = new 파일로저장();
		file.save(list);
	}

}
