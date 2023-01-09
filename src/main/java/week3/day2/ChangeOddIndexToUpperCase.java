package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text = "changeme";
		System.out.println("Before changing: "+text);
		 
		// a) Convert the String to character array
		char ch[] = text.toCharArray();	
		
		// b) Traverse through each character (using loop)
		for(int i=0; i<ch.length; i++) {
			
			// c)find the odd index within the loop (use mod operator)
			if(i%2 != 0) {
				
				// d)within the loop, change the character to uppercase, if the index is odd else don't change
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		System.out.println("After changing: "+new String(ch));
	}
}
