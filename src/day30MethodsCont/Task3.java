package day30MethodsCont;


public class Task3 {
	

		
		// create a method called reportName
				 // this method take 2 String parameters as firstName, lastName
				 // return nothing
				 // inside the body --> 
				 // print the length of first and lastName with a nice message
				 // print the first initial of first and lastName together
				 // print the first initial of first and lastName together
				 
				  
				 // create a static method called reverseString()
				 // it takes one String as a parameter return nothing
				 // in the body --> print reversed String
				 
				 // create a static method called addAllNUmbers
				 // it takes 3 numbers and get the sum of 
		
			public static void reportName(String firstName, String lastName) {
			
			System.out.println("Your" +firstName+ "length is: " + firstName.length());
			
			
			System.out.println("Your" +lastName+ "length is: " + lastName.length());
		
			System.out.println("Your initial is "  +firstName.charAt(0)+ " " + lastName.charAt(0));
			
		}
			
			
			
		
			public static void main(String[] args) {
			reportName ("Kerem", "Gorgulu");
			
	}
}
