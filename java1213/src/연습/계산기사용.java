package 연습;

public class 계산기사용 {

	public static void main(String[] args) {
		계산기 c = new 계산기();
		c.brand = "땡땡전자";
		c.type = "일반";
		c.price = 15000;
		
		double sum = c.add(13, 2323);
		double sum2 = c.sub(13, 2323);
		double sum3 = c.mul(13, 2323);
		double sum4 = c.div(13, 2323);
		
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}

}
