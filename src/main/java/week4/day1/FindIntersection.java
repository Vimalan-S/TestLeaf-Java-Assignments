package week4.day1;

import java.util.ArrayList;

public class FindIntersection {

	public static void main(String[] args) {
//		* a) Declare An array for {3,2,11,4,6,7};	
		int arr1[] = {3,2,11,4,6,7};
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int num: arr1) al1.add(num);
		
		
//		 * b) Declare another array for {1,2,8,4,9,7};
		int arr2[] = {1,2,8,4,9,7};
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int num: arr2) al2.add(num);
		
		System.out.println("Common elements present in both ArrayLists: ");
		
//		 * c) Declare for loop iterator from 0 to array length
		for(int i=0; i<al1.size()-1; i++) {
			
//			 * d) Declare a nested for another array from 0 to array length
			for(int j=0; j<al2.size()-1; j++) {
				
//				 * e) Compare Both the arrays using a condition statement
				 if(al1.get(i) == al2.get(j)) {
					 System.out.println(al1.get(i));
					 break;
				 }
			}
		}
	}
}
