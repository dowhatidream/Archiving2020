package �÷���;

import java.util.LinkedList;

public class ť���� {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("���ѿ���");
		list.add("�̽̿���");
		list.add("���Ͽ���");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------");
		
		list.remove();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------");
		
		list.remove();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
