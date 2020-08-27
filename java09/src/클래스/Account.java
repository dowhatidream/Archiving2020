package 클래스;

public class Account {
	String name;
	String type;
	int money;
	
	public void deposit() {
		System.out.println("입금");
	}
	public void withdraw() {
		System.out.println("출금");
	}
	
	@Override
	public String toString() {
		return name + "\t" + type + "\t" + money;
	}
	
}
