package week1.day1.Assignment2;

public class Mobile {
	
	public void makeCall() {
		String mobileModel = "Samsung M51";
		float mobileWeight = 170.52f;
		
		System.out.println("Model name: "+mobileModel+"\nWeight: " + mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 25000;
		
		System.out.println("Is it fully Charged? " + isFullCharged + "\nPrice: Rs." + mobileCost);
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is my Mobile Details:");
		Mobile m51 = new Mobile();
		
		m51.makeCall();
		m51.sendMsg();
	}

}
