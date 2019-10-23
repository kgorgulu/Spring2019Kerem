package replit;

import java.util.Scanner;

public class Repl39 {
	public static void main(String[] args) {
		/*
		 * Instructions from your teacher:
U have an Integer number already declared and assigned value.

Using Multi-Branch if statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:

10

10 is even


Enter a number:

33

33 is odd


Enter a number:

0

0 is even
		 */
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
		
		if (number % 2 == 0 )
			 System.out.println(number +" is even");
	     else
	        System.out.println(number +" is odd");
			
		
	}
}
