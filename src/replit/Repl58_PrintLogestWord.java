package replit;

import java.util.Scanner;

public class Repl58_PrintLogestWord {
	public static void main(String[] args) {

	
		
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //WIRTE YOUR CODE HERE
		    
		    int count1=word1.length();
		    int count2=word2.length();
		    
		    if (count1>count2) {
		    	System.out.println(word1);
		    }else {
					System.out.println(word2);
				}
				
			}
}

