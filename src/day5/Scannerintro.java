package day5;

import java.util.Scanner;

public class Scannerintro {
	
	public static void main(String[] args) {

		
		Scanner user = new Scanner(System.in);
		
			
		System.out.println("Enter your name please: " );
		
		
		//String name  = input.next();
		
		String name  = user.nextLine()	;
		
		System.out.println( "You have entered : " + name);
		
		System.out.println("Enter your lastname please: " );
		
		String lastname = user.next();
		System.out.println("Your last name is " +lastname);
		
		System.out.println("Your full name is  " + name  +lastname);
		
		
		
		
		
		
		
		
		
				
	}
}
