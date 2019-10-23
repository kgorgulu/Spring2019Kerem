package day19_dowhileLoops;

import java.util.Scanner;

public class ReverseaWord {
	public static void main(String[] args) {
		
		String app = "app" ; 
		String reversedApp = "";
		
//		reversedApp = reversedApp + app.charAt(2) ; 
//		System.out.println(reversedApp);
//		
//		reversedApp = reversedApp + app.charAt(1) ; 
//		System.out.println(reversedApp);
//		
//		reversedApp += app.charAt(0) ; 
//		System.out.println(reversedApp);
		
		int x = 2 ; 
		
		while(x>=0) {
		
		//	System.out.println( x );
			reversedApp = reversedApp + app.charAt(x) ; 
			System.out.println(reversedApp);
			
			x-- ; 
		
		}
		System.out.println("final value of reversed word is " + reversedApp);
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER A name");
		// Ask user a name 
		// for example  Bilal ----> B-i-l-a-l-
		String name = scan.nextLine() ;
		/// USING ABOVE CODE --> CREATE A PROGRAM 
		// TO CHECK WHETHER A WORD IS PALINDROM 
		//    ANA --> REVERSE -- ANA
		//	  CIVIC --> REVERSE -- CIVIC

		
		// in order to reverse a String 
		// we can start getting the chars in reversed order 
		// by using charAt method 
		// since the order is decrementing , we use -- 
		// in order to save the reversed word, we need a container
		// before we reverse the word , just put empty value in container
		// while we looping through each chars , 
		// concatenate this character to the variable value 
		// after the loop we will have the word stored in reversed order
		
		int count = name.length() ;  // ABC 
		String reversed = ""; 
		
		while(count>0) {
			
			System.out.println("reversed variable value before : " + reversed  );					
			count-- ; 
			reversed  = reversed + name.charAt(count) ; 
			//reversed += name.charAt(count)
			System.out.println("reversed variable value after : " + reversed  );					
		}
		System.out.println( "PALINDROME " + name.equals(reversed) );
		
		
		
		
		
		
		
		
		
		//System.out.println();
//		System.out.print(name.charAt(0)+"-");
//		System.out.print(name.charAt(1)+"-");
//		System.out.print(name.charAt(2)+"-");
//		System.out.print(name.charAt(3)+"-");
//		System.out.print(name.charAt(4)+"-");

	}
}
