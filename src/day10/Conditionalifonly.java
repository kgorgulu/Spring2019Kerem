package day10;

import java.util.Scanner;

public class Conditionalifonly {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Okta to Slack");
		System.out.println("Please Enter the length of your User Name");
		
		int lengthOfName = scan.nextInt();
		
		if ( lengthOfName> 22) {
			
			System.out.println("Slack can not make more than 22 char");
			
			lengthOfName = 21;
			System.out.println("user name has been adjusted");
		}
		
			
			System.out.println("Successfully added user");
			
		}

		
		
	}

