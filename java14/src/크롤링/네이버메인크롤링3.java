package ũ�Ѹ�;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�3 {

	public static void main(String[] args) {
		// ������Ʈ���� ������ ������ ���� ��
		// �ܼ�: ��ũ����
		// �ܼ�+@: ũ�Ѹ�
		// ������ ���̽����� ũ�Ѹ���(beautiful soup). �ڹٷδ� �� ���� ����.
		// ũ�Ѹ� ����
		// 1. ����Ʈ ����
		// 2. �ش� ������ �ٿ�ε�(HTML)
		// 3. ���ϴ� ��ġ�� ������ �����س�
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010#");

		try {
			Document doc = con.get();
			Elements list = doc.select("dd p a"); // h3 a
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}
			
//			System.out.println(list.get(6).text());
			
			
//			String text = list.get(0).text(); // �Ѱ��� ��������
//			System.out.println(text);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
