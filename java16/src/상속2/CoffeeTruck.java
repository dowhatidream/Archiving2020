package 상속2;

public class CoffeeTruck extends Truck {
	int sale;
	
	public void selling() {
		System.out.println("커피를 팔았어요!!!");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [sale=" + sale + ", color=" + color + ", carNum=" + carNum + ", brand=" + brand + "]";
	}
	
}
