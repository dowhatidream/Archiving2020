package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링3 {

	public static void main(String[] args) {
		// 웹사이트에서 정보를 가지고 오는 것
		// 단순: 스크랩핑
		// 단순+@: 크롤링
		// 요즘은 파이썬으로 크롤링함(beautiful soup). 자바로는 잘 하지 않음.
		// 크롤링 순서
		// 1. 사이트 연결
		// 2. 해당 페이지 다운로드(HTML)
		// 3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010#");

		try {
			Document doc = con.get();
			Elements list = doc.select("dd p a"); // h3 a
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text());
			}
			
//			System.out.println(list.get(6).text());
			
			
//			String text = list.get(0).text(); // 한개만 가져오기
//			System.out.println(text);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
