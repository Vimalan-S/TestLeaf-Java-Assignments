package week4.day1;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int num: arr) al.add(num);
		
//		1) Arrange the array in ascending order
		Collections.sort(al);
		
//		2) Pick the 2nd element from the last and print it
		System.out.println(al.get(al.size()-2) + " is the Second Largest Element");
	}
}
