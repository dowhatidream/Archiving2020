package �÷���;

import java.util.LinkedList;

public class ����1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��ǻ��");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		list.remove();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		list.remove();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		list.remove();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	}

}
