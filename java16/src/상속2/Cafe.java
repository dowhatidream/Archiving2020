package 상속2;

public class Cafe {

	public static void main(String[] args) {
		CoffeeTruck t = new CoffeeTruck();
		
		t.brand = "벤츠";
		t.color = "흰색";
		t.carNum = "1630";
		t.sale = 132;
		
		t.changeTire();
		t.selling();
		t.cleaning();
		t.needLPG();
		
		System.out.println(t);
	}

}
