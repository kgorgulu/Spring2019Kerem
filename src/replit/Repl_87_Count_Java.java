package replit;

import java.util.Scanner;

public class Repl_87_Count_Java {
	public static void main(String[] args) {
		
		/*
		 * Return the number of times that the string "java" appears anywhere in the given string word.

Example: 
input: javaxjava
output: 2
Example:
input: javaxjavaapplepearjavaegg
output: 3
		 */
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int count =0;
	    int x = 0;
	    
	    do{
	      if(word.charAt(x)=='j'){
	        ++count;
	      }
	      x++;
	    }while(x < word.length());
	    System.out.println(count);
	       

	}
}
