package day30MethodsCont;

import java.util.Scanner;

import day29Methods.Spartan;

public class Utility {
	
	
	
	
		public static void printUsersName() {
			
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please");
		
		String name = scan.next();
		
		System.out.println("Yon entered : " + name);
		}
		public static void main(String[] args) {
			
			
			//calling the method
					
			printUsersName();
			
			// calling the method
			// Utility.printUsersName();
			//Arrays.sort(arrObject);
			Spartan.releaseTheHorse();
		}
		 // We can call methods coming from 

	    // different classes 

	    // if the class is under same package no import needed

	    // if the class is under different package import is mandatory
}

	
	//

