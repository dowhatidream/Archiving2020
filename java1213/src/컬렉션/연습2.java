package 컬렉션;

import java.util.HashSet;

public class 연습2 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("디자이너");
		set.add("프로그래머");
		set.add("DB관리자");
		set.add("디자이너");
		
		System.out.println(set);
	}

}
