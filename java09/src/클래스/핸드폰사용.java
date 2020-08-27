package 클래스;

public class 핸드폰사용 {

	public static void main(String[] args) {
		핸드폰 p1 = new 핸드폰(); 
		// 멤버변수 복사 -> 자동초기화
		// p1 변수 생성 -> 멤버변수들을 가리키는 주소
		p1.color = "검정";
		p1.size = 1;
		p1.company = "LG";
		
		System.out.println("색: " + p1.color);
		System.out.println("크기: " + p1.size);
		System.out.println("제조사: " + p1.company);
		p1.texting();
		
		System.out.println();
		
		핸드폰 p2 = new 핸드폰();
		p2.color = "흰색";
		p2.size = 33;
		p2.company = "삼성";
		
		System.out.println("색: " + p2.color);
		System.out.println("크기: " + p2.size);
		System.out.println("제조사: " + p2.company);
		p2.calling();
		
	}

}
