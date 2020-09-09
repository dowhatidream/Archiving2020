package 컬렉션;

import java.util.ArrayList;

import db처리.BbsVO;

public class 아무거나묶기 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("안녕");
		list.add(11);
		list.add(1333.2223);
		list.add(true);
		list.add('A');
		list.add(new BbsVO());

		System.out.println(list.size() + "개");
		System.out.println(list.get(0));

		list.remove(0);
		System.out.println(list.size() + "개");

		list.remove(3);
		System.out.println(list.size() + "개");

		list.set(0, "aaaaaaaa");
		System.out.println(list.get(0));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}

	}

}
