package java08;

import java.util.Scanner;

public class 신검등급판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String result = "면제";
			String ssn = null;
			int height = 0;
			int weight = 0;
			double sight = 0;
			int symtom = 0;
			int score = 0;
			
			System.out.print("주민번호>> ");
			ssn = sc.next();
			System.out.print("키>> ");
			height = sc.nextInt();
			System.out.print("몸무게>> ");
			weight = sc.nextInt();
			System.out.print("시력>> ");
			sight = sc.nextDouble();
			System.out.print("병명(없음-1, 평발-2, 고혈압-3)>> ");
			symtom = sc.nextInt();
			
			int bmi = (weight / height * height);
			
			if ((height > 190 || height < 150) || bmi > 30 || sight < 0.0) {
				System.out.println(result +"\n");
			}
			else {
				if (height >= 150 && height <= 190) { // 키가 150~180
					score += 20;
				}
				if (weight >= 35 && weight <= 100) { // 몸무게가 35~100
					score += 20;
				}
				
				if (sight >= 1.0) {
					score += 30;
				}
				else if (sight >= 0.5) {
					score += 20;	
				}
				else if (sight >= 0.1){
					score += 10;
				}
				
				if (symtom == 1) {
					score += 30;
				}
				else if (symtom == 2) {
					score += 20;
				}
				else if (symtom == 3) {
					score += 10;
				}
				
				// 점수 판단
				if (score >= 40) {
					result = "현역";
				}
				System.out.println(score + "점. " +result +"\n");
			}
		}
		
	}

}
