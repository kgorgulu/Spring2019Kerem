package replit;

import java.util.*;

public class Repl62_Middle_One {
	public static void main(String[] args) {

		
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		   
		    int x = word.length();
			
			if (x %2 ==1 && x >=3) {
				System.out.println(word.charAt(word.length()/2));
				
			}else if (word.length()==1) {
			System.out.println(word+ "" + word +"" + word);
			}
			
			if (x%2 ==0 && x >=4) {
		        System.out.println(""+word.charAt(x/2-1)+word.charAt(x/2));
			
		}else if (word.length()==2) {
			System.out.println(word + word);
		
					
		}
	}
}
