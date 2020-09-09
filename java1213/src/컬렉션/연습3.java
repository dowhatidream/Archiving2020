package ÄÃ·º¼Ç;

import java.util.LinkedList;

public class ¿¬½À3 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("¹Ú¼ÒÁ¤");
		list.add("±èÁ¤¹Î");
		list.add("¼ÒÁöÇö");
		list.add("±è°³³ä");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "µî " + list.get(i));
		}

		System.out.println("\n" + list.get(1) + " Å»¶ô" + "\n");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "µî " + list.get(i));
		}
	}
}
