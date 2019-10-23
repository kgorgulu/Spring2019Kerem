package replit;

import java.util.*;

public class Repl_67_Merge_them {
	
	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    
	    if(word2.length()!=3 || word1.length()!=3){
	        System.out.println("cannot merge");

	    }else{
	        for(int i=0;i<3;i++){
	            System.out.print(word1.charAt(i));
	             System.out.print(word2.charAt(i));

	        }
	    }
	    

	}
}
