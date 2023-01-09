package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
	    // a) Declare A String value as"madam"
		String str = "madam";
		
		// b) Declare another String rev value as ""
		String rev = "";
		
		// c) Iterate over the String in reverse order
		for(int i=str.length()-1; i>=0; i--) {
			
			// d) Add the char into rev
			rev += Character.toString(str.charAt(i));
		}
		
		// e) Compare the original String with the reversed String, if it is same then print palinDrome 
		if(rev.equals(str)) System.out.println(str+" is a Palindrome");
		else System.out.println(str+" is not a Palindrome");
	}
}
