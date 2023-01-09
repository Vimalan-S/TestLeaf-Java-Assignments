package week3.day2.Assignment3;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Amount Deposited successfully in Axis Bank");
	}
	
	public static void main(String[] args) {
		AxisBank acc1 = new AxisBank();
		
		// Method Overriding
		acc1.deposit();
	}
}
