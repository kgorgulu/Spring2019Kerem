package day9;

import java.util.Scanner;

public class Warmuptask {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Welcome to Math Library");
		
		int n1, n2;
		
		System.out.println("Please enter two numbers: ");
		
		n1= scan.nextInt();
		n2=scan.nextInt();
		if (n1+n2>100) {
			
		
		System.out.println("Your sum is greater than 100");
		
		}else {
			System.out.println("Looks like your sum is less than 100");
		}
		
		
		
	}
}
