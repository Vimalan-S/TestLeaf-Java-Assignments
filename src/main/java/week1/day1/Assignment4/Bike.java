package week1.day1.Assignment4;

public class Bike {
	
	public void applyBreak() {
		System.out.println("\n\nApplied break for my Bike");
	}
	
	public void soundHorn() {
		System.out.println("Applied Sound horn for my Bike");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.applyBreak();
		myCar.soundHorn();
		
		Bike myBike = new Bike();
		
		myBike.applyBreak();
		myBike.soundHorn();
	}
}
