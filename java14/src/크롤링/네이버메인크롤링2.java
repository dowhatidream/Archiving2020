package ũ�Ѹ�;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�2 {

	public static void main(String[] args) {
		// ������Ʈ���� ������ ������ ���� ��
		// �ܼ�: ��ũ����
		// �ܼ�+@: ũ�Ѹ�
		// ������ ���̽����� ũ�Ѹ���(beautiful soup). �ڹٷδ� �� ���� ����.
		// ũ�Ѹ� ����
		// 1. ����Ʈ ����
		// 2. �ش� ������ �ٿ�ε�(HTML)
		// 3. ���ϴ� ��ġ�� ������ �����س�
		Connection con = Jsoup.connect("https://www.naver.com/");
		System.out.println("1. ����Ʈ ���� ����");
		try {
			Document doc = con.get();
			System.out.println("2. �ش� ������ �ٿ�ε� ����");
			
			Elements list = doc.select("a.nav"); // arraylist�� �����. �ֳĸ� �� ����߱� ����!
			System.out.println("3. ���ϴ� ��ġ�� ���� ���� ����");
			
			for (int i = 0; i < list.size(); i++) {
				String text = list.get(i).text(); // �Ѱ��� ��������
				System.out.println(text);
			}
			
//			
//			String text = tag.text(); // ������ ��� �� �ؽ�Ʈ�� ��������
//			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
