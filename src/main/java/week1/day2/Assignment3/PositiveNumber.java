package week1.day2.Assignment3;
import java.lang.Math; // Importing Math library to perform Mathematical operations at ease

public class PositiveNumber {

	public static void main(String[] args) {
		int num = -40;
		
		if(num < 0) {
			System.out.println(num + " is converted to " + Math.abs(num));
		}
	}
}
