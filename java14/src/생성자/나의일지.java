package ������;

import java.util.ArrayList;

public class �������� {

	public static void main(String[] args) {
		Day d1 = new Day("����", 8, "��");
		Day d2 = new Day("��å", 1, "����");
		Day d3 = new Day("��", 5, "ħ��");
		
		ArrayList<Day> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		���Ϸ����� file = new ���Ϸ�����();
		file.save(list);
	}

}
