package week1.day2.ArrayAssignments;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = {23,45,67,32,89,22 };
		
		Arrays.sort(arr);
		
		System.out.println(arr[1] + " is the Second Smallest number");
	}
}
