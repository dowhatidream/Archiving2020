package �÷���;

import java.util.ArrayList;

import dbó��.BbsVO;

public class �ƹ��ų����� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("�ȳ�");
		list.add(11);
		list.add(1333.2223);
		list.add(true);
		list.add('A');
		list.add(new BbsVO());

		System.out.println(list.size() + "��");
		System.out.println(list.get(0));

		list.remove(0);
		System.out.println(list.size() + "��");

		list.remove(3);
		System.out.println(list.size() + "��");

		list.set(0, "aaaaaaaa");
		System.out.println(list.get(0));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}

	}

}
