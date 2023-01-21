package JavaChallenge;

//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.


public class HappyNumber {
	public static void HappyCheck(int n) {
		System.out.println("Received: "+n);
		int sum = 0;
		while(n != 0) {
			int a = n/10;
			sum += Math.pow(a,2);
			n/=10;
			System.out.println("Sum: "+sum);
		}
		
		if(sum == 1) {
			System.out.println("true");
		}else if(sum < 0) {
			System.out.println("false");
		}else {
			HappyCheck(sum);
		}
	}
	
	public static void main(String[] args) {
		int num = 2;
		
		if(num > 0) {
			HappyCheck(num);
		}else {
			System.out.println("false");
		}
	}
}
