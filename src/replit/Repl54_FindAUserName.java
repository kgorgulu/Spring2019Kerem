package replit;

import java.util.Scanner;


public class Repl54_FindAUserName {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
		
		 String name1 = "Max Payne";
		 String name2 = "Alan Wake";
		 
		 System.out.println("Enter full name:");
				
		 String name=scan.nextLine();
		 
		 	    
		    
	    if(name.equalsIgnoreCase(name1) || name.equalsIgnoreCase(name2)) { 

	      System.out.println("User found!");

	    }else { 

	      System.out.println("User not found!");


	  }

	}
}
