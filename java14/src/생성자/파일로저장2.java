package 생성자;

import java.io.FileWriter;
import java.util.ArrayList;

public class 파일로저장2 {

	public void save(ArrayList<계좌> list) {
		for (int i = 0; i < list.size(); i++) {
			계좌 a = list.get(i);

			try {
				FileWriter w = new FileWriter(a.name + ".txt"); // String을 넣어라~
				w.write(a.name + "\n");
				w.write(a.field + "\n");
				w.write(a.balance + "\n");
				w.close();
			} catch (Exception e) {
				System.out.println("파일 저장 실패");
			}
		}
	}
}
