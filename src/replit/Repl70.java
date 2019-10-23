package replit;

import java.util.Scanner;

public class Repl70 {
	public static void main(String[] args) {
		
				    Scanner scan = new Scanner(System.in);

		    String word = scan.next();

		    if (((word.charAt(0) == 'x' ) && (word.charAt(word.length() - 1) == 'x')) || 

					((word.charAt(0) == 'X' ) && (word.charAt(word.length() - 1) == 'X')) ||

					((word.charAt(0) == 'x' ) && (word.charAt(word.length() - 1) == 'X')) || 

					((word.charAt(0) == 'X' ) && (word.charAt(word.length() - 1) == 'x'))) {

					System.out.println(word.substring(1,word.length() - 1));

				}

				else {

					System.out.println(word);

				}

		    

	}
}
