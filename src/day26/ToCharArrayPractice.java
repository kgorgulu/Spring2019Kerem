package day26;

import java.util.Arrays;
import java.util.Scanner;



public class ToCharArrayPractice {
	public static void main(String[] args) {
		
		//Task 2
		// get user input using scanner as String name
		// turn it into char Array and count letter a
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name= scan.next();
		//Ask user t enter char to count
		//since we can not store user input as a character
		// we will just ask for string then turn it into character
		//for example if User enter "A" ---> , charAt(0)---->
		
		System.out.println("Enter char to count");
		String userCharstr="a";
		char charToLookFor = userCharstr.charAt(0);
		
		
		char[] nameChars = name.toCharArray();
		
		System.out.println( Arrays.toString(nameChars));
		
		int counter = 0;
		
		for (int i = 0; i < nameChars.length; i++) {
			
			if (nameChars[i]==charToLookFor) {
				counter++ ;
						
			}
		}
		System.out.println("the count of "+userCharstr +": " + counter);

		}
		

	}

