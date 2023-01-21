package week4.day1;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";	
		
		// c) Split the String into array and iterate over it 
		String words[] = text.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String word: words) hm.put(word, hm.getOrDefault(word, 0)+1);
		
		
		for(Map.Entry<String, Integer> e: hm.entrySet()) {
			if(e.getValue()>1) {
				hm.remove(e.getKey());
				text = text.replaceAll(e.getKey(), "");
				break;
			}
		}

		System.out.println(text);
	}
}
