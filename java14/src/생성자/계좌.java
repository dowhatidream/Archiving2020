package 생성자;

public class 계좌 {
	// 계좌 객체를 생성할 때, name field balance를 넣지 않으면 객체를 생성하지 못하게 해야함
	// 세가지를 모두 넣었을 때만 계좌를 개설하도록 정의
	String name;
	String field;
	int balance;

	// 입력값이 없으면서, 클래스 이름과 동일한 메서드
	// 기본생성자 메서드
	// 프로그래머가 메서드를 정의하지 않아도 자동으로 만들어진다
	public 계좌() {
		// 생성자 메서드는 무조건 void!!!!
		// 기본 성격이 void인 경우, 보통 생략을 많이 함
		// 객체생성시마다, 자동으로 실행해주어야 하는 처리 내용
		// 초기화시킬 내용이 있으면, 이 메서드에다 처리 내용
		// new를 이용해서 객체 생성시 무조건 자동호출되므로,
		// 생성자 메서드(생성자)
		// 보통 멤버변수 초기화같은 처리를 넣어줍니다
		System.out.println("객체 생성시 마다 자동으로 호출됩니다ㅎㅎ");
		System.out.println("보통 멤버변수 초기화같은 처리를 넣어줍니다");
	}
	
	public 계좌(String name, String field, int balance) {
		super();
		this.name = name;
		this.field = field;
		this.balance = balance;
	}



	// 객체 생성 후, 멤버 변수에 들어가있는 값을 한꺼번에 확인하고자 하는 경우 toString()을 만들자
	@Override
	public String toString() {
		return "[name=" + name + ", field=" + field + ", balance=" + balance + "]";
	}	
}
