package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링4 {

	public static void main(String[] args) {
		// 웹사이트에서 정보를 가지고 오는 것
		// 단순: 스크랩핑
		// 단순+@: 크롤링
		// 요즘은 파이썬으로 크롤링함(beautiful soup). 자바로는 잘 하지 않음.
		// 크롤링 순서
		// 1. 사이트 연결
		// 2. 해당 페이지 다운로드(HTML)
		// 3. 원하는 위치의 정보를 추출해냄
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

			System.out.println("회사이름: " + name);
			System.out.println("코드: " + code);
			System.out.println("현재가: " + now);
			System.out.println("차이: " + dif);
			System.out.println("증감비율: " + per + "%");
			System.out.println("전일: " + yes);
			System.out.println("시가: " + mar);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
