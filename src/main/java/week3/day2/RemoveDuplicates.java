package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";	
		
		// c) Split the String into array and iterate over it 
		String words[] = text.split(" ");
		for(int i=0; i<words.length; i++){
			
			// d) Initialize another loop to check whether the word is there in the array
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) { 
					text = text.replaceAll(words[i], "");	
					break;
				}
			}
		}
		// g) Displaying the String without duplicate words
		System.out.println("Without Duplicates: "+ text);
	}
}
