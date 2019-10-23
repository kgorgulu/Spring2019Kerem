package day65;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WarmUp {
	public static void main(String[] args) {
		
		
		 // GIVEN 
	    String str = "ABCABCEFGADBHYKJSGD"; 
	    // Find Out how many unique character 
	  
	    
	    // HINT : 
	    
	    // Convert this to an array 
	          
	    
	    // store it in List 
	  
	    
	    // use one of data structure that store unique element 
		Set<Character> charSet = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i));
			
			charSet.add(str.charAt(i));
			
		}
			System.out.print(charSet);
	}
}
