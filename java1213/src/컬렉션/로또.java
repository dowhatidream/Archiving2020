package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet set = new HashSet();

		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}

		System.out.println(set);
	}
}
