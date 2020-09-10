package 생성자;

public class 은행 {

	public static void main(String[] args) {
		계좌 a1 = new 계좌(); // 이 괄호가 마치 메소드를 호출한 것 같은 느낌을 주네? 아 있네 이거 그 생성자잖아~
		계좌 a2 = new 계좌("이승연", "적금", 1000000);
		
		System.out.println(a2);
	}

}
