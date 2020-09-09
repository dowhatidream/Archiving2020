package 컬렉션;

import java.util.LinkedList;

public class 연습1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("컴퓨터");
		
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
