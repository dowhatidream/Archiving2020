package 컬렉션;

import java.util.HashSet;

public class 중복제거목록 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("사탕");
		set.add("충전기");
		set.add("사탕");
		set.add("아로마");
		
		System.out.println(set.size());
		System.out.println(set);
		
	}

}
