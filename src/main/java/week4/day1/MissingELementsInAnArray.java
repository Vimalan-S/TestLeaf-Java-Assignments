package week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class MissingELementsInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int num: arr) al.add(num);
		
		// Sort the array	
		Collections.sort(al);

		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=0; i<al.size(); i++) {

			// check if the iterator variable is not equal to the array values respectively
			if(al.get(i) != i+1) {
				
				// print the number
				System.out.println(i+1 +" is the Missing Element in the ArrayList");
				
				// once printed break the iteration
				break;
			}		
		}
	}
}
