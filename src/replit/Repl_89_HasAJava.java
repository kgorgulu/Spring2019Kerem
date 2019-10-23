package replit;

import java.util.Scanner;

public class Repl_89_HasAJava {
	public static void main(String[] args) {
		/*
		 * Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
		 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 
		 */
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	   int indexOf=word.indexOf("java");
	   boolean b=true;

	   if (indexOf==0 || indexOf==1){
	     b=true;
	   }else{
	     b=false;
	   }
	   System.out.println(b);
	}
}
