package ÄÃ·º¼Ç;

import java.util.HashMap;

public class ¿¬½À4 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100, "±èµ¥ÀÌ");
		map.put(200, "±è»çÀü");
		map.put(300, "±è±¸Á¶");
		map.put(400, "±èÀÚ·á");

		System.out.println(map);

		map.remove(200);
		map.put(300, "±èÃæ¼º");

		System.out.println(map);
	}
}
