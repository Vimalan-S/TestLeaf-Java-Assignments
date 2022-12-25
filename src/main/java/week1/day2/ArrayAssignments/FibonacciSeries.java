package week1.day2.ArrayAssignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8, firstNum = 0, secNum = 1, sum = 0;
		
		// Print first number
		System.out.println(firstNum + " is the First number");
		
		System.out.print(firstNum + " " + secNum + " ");
		
		// Iterate from 1 to the range
		// But I'm starting from i=3 because already the first two numbers of the Fibonacci range are printed so my loop should start from i=3 and end when i = range
		for (int i = 3; i <= range; i++) {
			// add first and second number assign to sum
			sum = firstNum + secNum;
			
			// Assign second number to the first number
			firstNum = secNum;
			
			// Assign sum to the second number
			secNum = sum;
			
			// print sum
			System.out.print(sum + " ");
		}
	}
}
