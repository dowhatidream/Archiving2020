package ������;

import java.io.FileWriter;
import java.util.ArrayList;

public class ���Ϸ����� {
	public void save(ArrayList<Day> list) {
		System.out.println(list.size() + "��ġ");
		for (int i = 0; i < list.size(); i++) {
			Day day = list.get(i);

			System.out.println(day);

			try {
				FileWriter w = new FileWriter(i + ".txt"); // String�� �־��~
				w.write(day.doing + "\n");
				w.write(day.time + "\n");
				w.write(day.location + "\n");
				w.close();
			} catch (Exception e) {
				System.out.println("���� ���� ����");
			}
		}
	}
}
