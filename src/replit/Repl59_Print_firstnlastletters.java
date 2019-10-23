package replit;

import java.util.Scanner;

public class Repl59_Print_firstnlastletters {
	public static void main(String[] args) {
		
		

	
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    char first = word.charAt(0);
		    char last = word.charAt(word.length()-1);
		    
		    
		    System.out.print(first);
		    System.out.println(last);
	}
}
