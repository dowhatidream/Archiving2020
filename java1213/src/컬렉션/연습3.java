package �÷���;

import java.util.LinkedList;

public class ����3 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("�ڼ���");
		list.add("������");
		list.add("������");
		list.add("�谳��");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "�� " + list.get(i));
		}

		System.out.println("\n" + list.get(1) + " Ż��" + "\n");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + "�� " + list.get(i));
		}
	}
}
