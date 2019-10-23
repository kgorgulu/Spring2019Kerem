package replit;

import java.util.Scanner;

public class Repl_68_Reverseastringwithnoloop {
	public static void main(String[] args) {

	

		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    int i=word.length();
		    
		   	   
		   
		    if(i>5) {
		    	System.out.println("Too long!");
		    		    		  
		    }else if(i<5) {
		    	
		    	System.out.println("Too short!");
		    
		    
		    } else if (i==5) {
		    	  String reverse = "";
		         
		        for(int j = i - 1; j >= 0; j--)
		         {
		             reverse = reverse + word.charAt(j);
		         }
		         
		         System.out.println(reverse);
										
		    }
		    
		   }
	}




