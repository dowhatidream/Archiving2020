package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// 창을 띄워서 입력을 받아보자
		// 창을 띄워서 출력을 해보자
		// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다.
		// 특정한 일을 전담하는 부품을 만들어, 특정한 처리를 할 때 부품을 지정함.
		// 키보드로 입력한 데이터 타입은 무조건 String
		// String으로 저장된 데이터를 int/String 쓸지는 내가 결정
		// 계산의 유무에 따라 계산해야 하는 경우는 int로 변환해주어야 함

		String name = JOptionPane.showInputDialog("이름?"); // ram에 name 변수 생성
		System.out.println(name + "씨 안녕하세요."); // cpu가 출력 처리
		
		String age = JOptionPane.showInputDialog("나이?"); // ram에 age 변수 생성
		int age2 = Integer.parseInt(age); // ram에 age2 변수 생성
		System.out.println(age2); // cpu가 출력 처리
		
		int lastAge = age2 - 1; // ram에 lastAge 변수 생성, cpu가 대입 연산 수행
		System.out.println("당신 작년 나이는 " + lastAge); // cpu가 출력 처리
	}
}
