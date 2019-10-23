package day12;

import java.util.Scanner;

public class ConditioanlReview {
	public static void main(String[] args) {
		
		//any ternary operator can be turned into if else statement;
		
		// one and only one purpose of ternary operator is conditional assignment;
		
		String weather = "sunny";
		String action = "go out";
		
				
	    // check for weather equal to sunny or not 
		 //  And Assign the Value  --if sunny assign action value to go out
			// if not assign action value to stay home
				
				
			// print out your action after the statement
			// try to check for multiple condition of sunny/cloudy/windy/rainy/;
	
				
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("How is the weather today?");
			
			weather = scanner.next();
			
			  /// ALWAYS USE  str1.equal(str2) for String equality check 
			  
//			  if(weather.equalsIgnoreCase("sunny")){
//			  //if( weather.equals("sunny") ){
//				  action = "go out";
//			  }else{
//				  action =  "stay home";
//			  }
			  
			 
			 // action = ( weather.equals("sunny") ) ? "go out" : "stay home" ; 
			  action = ( weather.equalsIgnoreCase("sunny") ) ? "go out" : "stay home" ; 
				
			  
	System.out.println("THE ACTION : " + action);

	}
}
