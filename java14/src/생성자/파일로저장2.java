package ������;

import java.io.FileWriter;
import java.util.ArrayList;

public class ���Ϸ�����2 {

	public void save(ArrayList<����> list) {
		for (int i = 0; i < list.size(); i++) {
			���� a = list.get(i);

			try {
				FileWriter w = new FileWriter(a.name + ".txt"); // String�� �־��~
				w.write(a.name + "\n");
				w.write(a.field + "\n");
				w.write(a.balance + "\n");
				w.close();
			} catch (Exception e) {
				System.out.println("���� ���� ����");
			}
		}
	}
}
