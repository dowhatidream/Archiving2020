package �÷���;

import java.util.ArrayList;

public class ����Ʈ {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("�ڽ�Ű");
		list.add("�۽�Ű");
		list.add("�轺Ű");
		list.add("����Ű");

		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "��: " + list.get(i));
		}
	}

}
