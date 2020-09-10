package ũ�Ѹ�;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ�4 {

	public static void main(String[] args) {
		// ������Ʈ���� ������ ������ ���� ��
		// �ܼ�: ��ũ����
		// �ܼ�+@: ũ�Ѹ�
		// ������ ���̽����� ũ�Ѹ���(beautiful soup). �ڹٷδ� �� ���� ����.
		// ũ�Ѹ� ����
		// 1. ����Ʈ ����
		// 2. �ش� ������ �ٿ�ε�(HTML)
		// 3. ���ϴ� ��ġ�� ������ �����س�
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=293490");

		try {
			Document doc = con.get();

			Elements list = doc.select("h2 > a");
			String name = list.get(0).text();

			Elements list2 = doc.select(".code");
			String code = list2.get(0).text();

			Elements list3 = doc.select("div.today");
			Elements list4 = list3.select(".blind");
			String now = list4.get(0).text();
			String dif = list4.get(1).text();
			String per = list4.get(2).text();

			Elements list5 = doc.select("td.first");
			Elements list6 = list5.select(".blind");
			String yes = list6.get(0).text();
			String mar = list6.get(1).text();

			System.out.println("ȸ���̸�: " + name);
			System.out.println("�ڵ�: " + code);
			System.out.println("���簡: " + now);
			System.out.println("����: " + dif);
			System.out.println("��������: " + per + "%");
			System.out.println("����: " + yes);
			System.out.println("�ð�: " + mar);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
