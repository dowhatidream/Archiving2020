package ������;

import java.util.ArrayList;

public class ����2 {

	public static void main(String[] args) {

		���� a1 = new ����("�̽¿�", "����", 1000000);
		���� a2 = new ����("�̽þ�", "����", 13000000);
		���� a3 = new ����("��ÿ�", "����", 1000000);
		���� a4 = new ����("���ÿ�", "����û��", 100000);
		���� a5 = new ����("�ڽþ�", "����", 2000000);
		
		ArrayList<����> list = new ArrayList<����>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		���Ϸ�����2 file = new ���Ϸ�����2();
		file.save(list);
	}
}
