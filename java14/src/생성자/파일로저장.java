package 생성자;

import java.io.FileWriter;
import java.util.ArrayList;

public class 파일로저장 {
	public void save(ArrayList<Day> list) {
		System.out.println(list.size() + "일치");
		for (int i = 0; i < list.size(); i++) {
			Day day = list.get(i);

			System.out.println(day);

			try {
				FileWriter w = new FileWriter(i + ".txt"); // String을 넣어라~
				w.write(day.doing + "\n");
				w.write(day.time + "\n");
				w.write(day.location + "\n");
				w.close();
			} catch (Exception e) {
				System.out.println("파일 저장 실패");
			}
		}
	}
}
