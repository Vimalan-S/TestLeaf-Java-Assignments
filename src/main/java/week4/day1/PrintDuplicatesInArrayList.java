package week4.day1;

import java.util.ArrayList;

public class PrintDuplicatesInArrayList {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int num: arr) al.add(num);
		
		System.out.println("Duplicates present in the ArrayList: ");
		
		// iterate from 0 to the array length-1 (outer loop starts here)
		for(int i=0; i<al.size()-1; i++) {
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for(int j=i; j<al.size()-1; j++) {
				
				// compare both the loop variables & check they're equal
				if(al.get(i) == al.get(j)) {
					
					// print the matching value
					System.out.println(al.get(i));
					al.remove(i);
					break;
				}
			}
		}						
	}
}
