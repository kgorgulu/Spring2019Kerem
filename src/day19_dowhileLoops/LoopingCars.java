package day19_dowhileLoops;
import java.util.Scanner;
public class LoopingCars {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		// how to check whether string start with a-z
		char firstChar = str.charAt(0);

		//ABC System.out.println('a' > 'b');

		if (firstChar >= 'a' && firstChar <= 'z') {

			System.out.println(" lower case letter");

		} else {

			System.out.println("NOT a-z");
		}

		// CREATE A PROGRAM LIKE ABOVE 
		// to check whether user input first character
		// 1 , started with number
		// 2 , end with uppercase
		
		
		
		


	}
}
