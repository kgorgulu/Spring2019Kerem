package replit;

import java.util.Scanner;

public class Repl_66_Printhalftwice {
	

	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
		
	    int half=word.length()/2;
	    String halfString=word.substring(0,half);
	    
	    System.out.print(halfString);
	    System.out.print(halfString);
	}
}
