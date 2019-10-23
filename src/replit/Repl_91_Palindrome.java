package replit;

import java.util.Scanner;

public class Repl_91_Palindrome {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
	    
	    boolean isPolindrome = true;
	    
	    
	   
	    for (int i = 0, j = word.length() - 1; i < word.length() / 2 ; i++,j--) {
	    	if (!(word.charAt(i) == word.charAt(j))) {
				isPolindrome = false;
			}
		}
	    
	    
	    
	    System.out.println(isPolindrome);
	}
}

