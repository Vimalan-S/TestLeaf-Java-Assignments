package week1.day1.ClassRoom;

public class Calculator {
	
	public void addTwoNum(int n1, int n2) {
		System.out.println(n1+" + "+n2 + " = " + (int)(n1+n2));
	}
	
	public void addThreeNum(int n1, int n2, int n3) {
		System.out.println(n1+" + "+n2+ " + " +n3+ " = " + (int)(n1+n2+n3));
	}

	public void subTwoIntegers(int n1, int n2) {
		System.out.println(n1+" - "+n2 + " = " + (n1-n2));
	}

	public void subTwoDouble(double n1, double n2) {
		System.out.println(n1+" - "+n2 + " = " + (double)(n1-n2));
	}

	public void multTwoIntegers(int n1, int n2) {
		System.out.println(n1+" X "+n2 + " = " + n1*n2);
	}
	
	public void multIntAndDouble(int n1, double n2) {
		System.out.println(n1+" X "+n2 + " = " + (double)n1*n2);
	}
	
	public void divTwoIntegers(int n1, int n2) {
		System.out.println(n1+" / "+n2 + " = " + n1/n2);
	}
	
	public void divIntAndDouble(int n1, double n2) {
		System.out.println(n1+" / "+n2 + " = " + (double)n1/n2);
	}
	

	public static void main(String[] args) {
		Calculator calC = new Calculator();
		
		System.out.println("ADDITION:");
		calC.addTwoNum(493, 82);
		calC.addThreeNum(3, 8, 7);
		
		System.out.println("\nSUBTRACTION:");
		calC.subTwoIntegers(953, 50);
		calC.subTwoDouble(953.25, 50.25);
		
		System.out.println("\nMULTIPLICATION:");
		calC.multTwoIntegers(483, 4);
		calC.multIntAndDouble(5, 653.4);
		
		System.out.println("\nDIVISION:");
		calC.divTwoIntegers(483, 4);
		calC.divIntAndDouble(5, 653.4);	
	}
}
