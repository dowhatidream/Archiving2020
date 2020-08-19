package 조건문;

public class SwitchTest {

	public static void main(String[] args) {
		String food = "초밥";

		switch (food) {
		case "냉면":
			System.out.println("혹시 육쌈냉면인가요?");
			break;
		case "초밥":
			System.out.println("아~ 은행골 가셨네.");
			break;
		case "돈까스":
			System.out.println("그 모퉁이 집?");
			break;
		case "국밥":
			System.out.println("대체 어디요? 너무 많던데..");
			break;
		default:
			System.out.println("뭐래..");
			break;
		}
	}

}
