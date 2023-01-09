package week3.day2.Assignment1.org.system;

public class Desktop extends Computer{
	
	public void desktopSize(float size) {
		System.out.println("Desktop Size: "+ size);
	}
	
	public static void main(String[] args) {
		Desktop comp1 = new Desktop();
		comp1.computerModel("Acer Aspire 7");
		
		// Single level Inheritance
		comp1.desktopSize((float) 15.6);
	}
}
