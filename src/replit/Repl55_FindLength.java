package replit;


import java.util.Scanner;

public class Repl55_FindLength {
	public static void main(String[] args) {
		
		System.out.println( "Please enter the text:");
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		
		int charCount = word.length();
		
		System.out.println("Length is: "+ charCount);
		
		

	}
}
