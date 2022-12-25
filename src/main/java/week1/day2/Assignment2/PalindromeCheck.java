package week1.day2.Assignment2;

import java.util.Iterator;

public class PalindromeCheck {

	public static void main(String[] args) {
		int num = 34343;
		int inputNum = num;
		
		int sum, rem = 0;
		
		// After each iteration, the last digit gets cutted off from the num
	    for (sum = 0; num>0; num/=10) {
	    	// Remainder
			rem = num%10;
			
			sum = (sum*10) + rem;
		}
	    
	    if(inputNum == sum) System.out.println(inputNum + " is a Palindrom number");
	    else System.out.println(inputNum + " is not a Palindrom number");
	}
}
