package 클래스;

public class myDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.age = 10;
		dog1.name = "이시아";
		dog1.color = "흰색";

		System.out.println("이름은 " + dog1.name);
		System.out.println("색은 " + dog1.color);
		System.out.println("나이는 " + dog1.age);
		dog1.walking();
		dog1.feeding();
		
		System.out.println();
		
		Dog dog2 = new Dog();
		dog2.age = 5;
		dog2.name = "이시윤";
		dog2.color = "갈색";

		System.out.println("이름은 " + dog2.name);
		System.out.println("색은 " + dog2.color);
		System.out.println("나이는 " + dog2.age);
		dog2.naming();
		dog2.feeding();
	}

}
