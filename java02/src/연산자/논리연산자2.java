package 연산자;

public class 논리연산자2 {

	public static void main(String[] args) {
		int hot = 25;
		int wind = 100;
		
		// 온도가 30도 이상이거나 바람이 88 이하면, 양산을 들고 가겠다!!!!!!!!
		if (hot >= 30 || wind <= 88) {
			System.out.println("양산 들고 가라!!");
		}
		else {
			System.out.println("빈 손으로 가라!!!");
		}
	}

}
