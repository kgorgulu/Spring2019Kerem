package replit;

import java.util.Scanner;

public class Repl57_PrintLastChar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
		
		int count = word.length() ; 
		
		System.out.println(count);
		System.out.println(  word.substring(count-1, count)     );
		
		System.out.println(word.substring(4,5));

	}
}
