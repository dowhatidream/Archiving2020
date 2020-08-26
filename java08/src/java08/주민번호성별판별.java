package java08;

import java.util.Random;
import java.util.regex.Pattern;

public class 주민번호성별판별 {

	public static void main(String[] args) {
		Random r = new Random(); // r 객체 생성
		String pattern = "[1-4]\\d{6}"; // 주민번호 뒷자리 정규식 패턴
		String[] human = new String[100]; // 사람 100명 저장할 배열(나름의 DB..?ㅋㅋ)

		int seoulF = 0; int seoulM = 0; // 통계 저장할 변수 선언 및 초기화
		int busanF = 0; int busanM = 0;
		int jejuF  = 0; int jejuM  = 0;
		int etcF   = 0; int etcM   = 0;

		for (int i = 0; i < human.length; i++) {
			// 주민번호 뒷자리 랜덤 발생 후 배열에 집어넣기(그냥 int로 7자리 받으면 0이 생략되어서 일일이 생성 후 String으로 변환)
			int a = r.nextInt(4) + 1; // 성별조건 때문에 limit
			int b = r.nextInt(10);
			int c = r.nextInt(10);
			
			int d = r.nextInt(10);
			int e = r.nextInt(10);
			int f = r.nextInt(10);
			int g = r.nextInt(10);

			String ssn = "" + a + b + c + d + e + f + g; // 주민번호 뒷자리 전체 완성
			human[i] = ssn; // 생성된 값을 배열에 대입

			boolean regex = Pattern.matches(pattern, human[i]); // 주민번호 여부 판별할 정규식
			String gender = human[i].substring(0, 1); // 성별을 나타내는 0번째 값 잘라서 대입
			String local = human[i].substring(1, 2); // 지역을 나타내는 1번째 값 잘라서 대입

			if (regex) { // 주민등록 뒷자리 형식에 맞는가?
				if (gender.matches("2") || gender.matches("4")) { // 여성인가?
					if (local.matches("1")) { // 서울인가?
						seoulF++;
					}
					else if (local.matches("2")) { // 부산인가?
						busanF++;
					}
					else if (local.matches("3")) { // 제주인가?
						jejuF++;
					}
					else { // 모두 아니면 기타
						etcF++;
					}
				}
				else { // 여성이 아니면 진입
					if (local.matches("1")) { // 서울인가?
						seoulM++;
					}
					else if (local.matches("2")) { // 부산인가?
						busanM++;
					}
					else if (local.matches("3")) { // 제주인가?
						jejuM++;
					}
					else { // 모두 아니면 기타
						etcM++;
					}
				}
			}
			System.out.println("주민번호: " + human[i]);
		}
		System.out.println("-----------------------");
		System.out.println("서울 지역 (총 " + (seoulF + seoulM) + "명)" + "\n" 
						 + "여자 " + seoulF + "명, " 
						 + "남자 " + seoulM + "명 입니다." + "\n");
		System.out.println("부산 지역 (총 " + (busanF + busanM) + "명)" + "\n"
						 + "여자 " + busanF + "명, " 
						 + "남자 " + busanM + "명 입니다." + "\n");
		System.out.println("제주 지역 (총 " + (jejuF + jejuM) + "명)" + "\n"
						 + "여자 " + jejuF + "명, "
						 + "남자 " + jejuM + "명 입니다." + "\n");
		System.out.println("기타 지역 (총 " + (etcF + etcM) + "명)" + "\n"
						 + "여자 " + etcF + "명, "
						 + "남자 " + etcM + "명 입니다." + "\n");
	}
}
