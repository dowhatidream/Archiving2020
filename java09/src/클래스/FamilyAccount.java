package 클래스;

public class FamilyAccount {

	public static void main(String[] args) {
		Account me = new Account();
		me.name = "이승연";
		me.type = "정기적금";
		me.money = 100000000;
		
		Account dog = new Account();
		dog.name = "이시아";
		dog.type = "주택청약";
		dog.money = 1000000;
		
		Account ddong = new Account();
		ddong.name = "이땡땡";
		ddong.type = "정기예금";
		ddong.money = 1000;
		
		me.deposit();
		dog.deposit();
		ddong.withdraw();
		
		System.out.println("계좌 정보");
		System.out.println("-----------------------------");
		System.out.println("이름\t계좌이름\t금액");
		System.out.println("-----------------------------");
		
		System.out.println(me.name+"\t"+me.type+"\t"+me.money);
		System.out.println(dog.name+"\t"+dog.type+"\t"+dog.money);
		System.out.println(ddong.name+"\t"+ddong.type+"\t"+ddong.money);
	
		System.out.println();
		
		System.out.println(me);
		System.out.println(dog);
		System.out.println(ddong);
	}

}
