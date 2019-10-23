package day5;

import java.util.Scanner;

public class scannermore {
	public static void main(String[] args) {
		
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter your first name : ");
		
		String firstName = input.next();
		
		System.out.println("Your first name is  " +firstName);

		System.out.println("Enter your last name ");
		
		String lastName = input.next();
				

		System.out.println("Your last name is  " + lastName);
		
		System.out.println("Your full name is " +firstName +" " + lastName );
		
		
	}
}
