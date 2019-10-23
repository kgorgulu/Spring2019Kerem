package replit;

import java.util.Scanner;

public class Repl_65_ConcatenateStr {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		  
		 String word1 = scan.next();
		 String word2 = scan.next();
		
		int a = word1.length();
	    int b= word2.length();
	    char c=word1.charAt(a-1);
	    char d=word2.charAt(0);
	    
	    if (c==d){
	    	  System.out.println( word1+word2.substring(1,word2.length()));
	    	 } else {

	    	  System.out.println(word1+word2);
	    	 }
	  

	}
}
