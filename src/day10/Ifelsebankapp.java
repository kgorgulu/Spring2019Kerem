package day10;

import java.util.Scanner;

public class Ifelsebankapp {
	
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Welcome to CyberTek Banking App");
		
		Long accountNumber = 12345L;
		String userPassword= "abc123";
		
		System.out.println("Enter your account number: ");
		Long account= scan.nextLong();
		
		//scan.nextLine();
		
		
		System.out.println("Enter your password: ");
		
		String password=scan.next();
		
		/// for primitive type equality use always ==
		/// for string you should always use .equals method
		// if you have single line of statement under your if or else 
		// curly braces are optional 
		
		if(accountNumber==account && userPassword.equals(password))
		
		System.out.println("Login success!");
		
		else 
			
			System.out.println("Login Failed!");
		
			System.out.println("end");
		}
		
		
		
	}

	
