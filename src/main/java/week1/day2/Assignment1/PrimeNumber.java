package week1.day2.Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int num = 13;
		
		// Declare a boolean variable flag as false
		boolean isPrime = true;
				
		// Iterate from 2 to half of the input
		for (int i = 2; i < num/2; i++) {
			
			// Check the remainder
			if(num % i == 0) {
				// Set the flag as false when there is no remainder
				isPrime = false;
				
				// break the iterator
				break;
			}
		}
		
		// Check the flag (Provide a condition)
		if(isPrime) {
			// Print 'Prime' when the condition matches
			System.out.println(num + " is a Prime Number");			
		}else {
			// Print 'Not a Prime' when the condition doesn't match 
			System.out.println(num + " is not a Prime Number");	
		}
	}
}
