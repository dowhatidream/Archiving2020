package 크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링2 {

	public static void main(String[] args) {
		// 웹사이트에서 정보를 가지고 오는 것
		// 단순: 스크랩핑
		// 단순+@: 크롤링
		// 요즘은 파이썬으로 크롤링함(beautiful soup). 자바로는 잘 하지 않음.
		// 크롤링 순서
		// 1. 사이트 연결
		// 2. 해당 페이지 다운로드(HTML)
		// 3. 원하는 위치의 정보를 추출해냄
		Connection con = Jsoup.connect("https://www.naver.com/");
		System.out.println("1. 사이트 연결 성공");
		try {
			Document doc = con.get();
			System.out.println("2. 해당 페이지 다운로드 성공");
			
			Elements list = doc.select("a.nav"); // arraylist랑 비슷함. 왜냐면 얠 상속했기 때문!
			System.out.println("3. 원하는 위치의 정보 추출 성공");
			
			for (int i = 0; i < list.size(); i++) {
				String text = list.get(i).text(); // 한개만 가져오기
				System.out.println(text);
			}
			
//			
//			String text = tag.text(); // 가져온 요소 중 텍스트만 가져오기
//			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
