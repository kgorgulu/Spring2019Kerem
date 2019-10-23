package day29Methods;

import java.util.Scanner;

public class MethodWithParameter {
	public static void main(String[] args) {
	    
	  
	 // holdYourHorse("Anar");
	 // holdYourHorse("Kerem");
	//  holdYourHorse("Yavuz");
	  
	  Scanner scan = new Scanner(System.in);
	 
	  String name = scan.next();
	  
	  System.out.println("Hold Your Horse");
	  holdYourHorse(name);
	  
	  
	}									//parameter
	  public static void holdYourHorse(String owner) {
	    
	     //String owner = "Anar" ;
	     
	     
	 //    System.out.println(owner + ", hold your horse please!");     
	     
	     /*
	      * 
	   
	     // Arrays.sort(arr) ;     

	     holdYourHorse("Anar"); 

	     //holdYourHorse(12321);  // does not compile if datatype not match

	     holdYourHorse("David"); 

	     holdYourHorse("Fatma"); 

	     holdYourHorse("Sumeyye"); 

	     

	   }

	                   // parameter 

	   public static void holdYourHorse(String owner) {  

	      //String owner = "Anar" ;

	      System.out.println(owner + ", hold your horse please!"); 
	       */
	  }
		
	
}

