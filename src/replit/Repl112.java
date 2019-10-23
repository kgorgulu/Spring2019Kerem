package replit;

import java.util.*;

public class Repl112 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String[] words = {"tesla", "jiguli", "fiat", "ford", "mazda"};
	    
	    for (int i = 0; i < words.length; i++){
   	    	
   	    	String name = words[i];
	 
	    	
	    
	    //	System.out.println(Arrays.toString(words));
	    	
	    	System.out.println(name.charAt(0)  + name.substring(name.length()-1)); 
	    }
	}
}
