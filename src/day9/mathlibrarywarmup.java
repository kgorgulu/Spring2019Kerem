package day9;

import java.util.Scanner;

public class mathlibrarywarmup {
	public static void main(String[] args) {

		int num1, num2, sum;
		
			Scanner scan  = new Scanner(System.in);
	

			System.out.println("Welcome to Math Library");

			
			
			System.out.println("Enter two numbers : ");

			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			sum = num1 + num2;
			

			if ((sum) > 100) {

				System.out.println("You entered a great number");

			}

			else {

			   System.out.println("Looks like your sum is less than or equal 100");
	}
	}
}

