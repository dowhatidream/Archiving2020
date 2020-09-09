package 컬렉션;

import java.util.LinkedList;

public class 큐형태 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("상한우유");
		list.add("싱싱우유");
		list.add("내일우유");
		
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
