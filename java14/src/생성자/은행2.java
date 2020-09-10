package 생성자;

import java.util.ArrayList;

public class 은행2 {

	public static void main(String[] args) {

		계좌 a1 = new 계좌("이승연", "적금", 1000000);
		계좌 a2 = new 계좌("이시아", "예금", 13000000);
		계좌 a3 = new 계좌("김시연", "적금", 1000000);
		계좌 a4 = new 계좌("정시연", "주택청약", 100000);
		계좌 a5 = new 계좌("박시아", "적금", 2000000);
		
		ArrayList<계좌> list = new ArrayList<계좌>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		파일로저장2 file = new 파일로저장2();
		file.save(list);
	}
}
