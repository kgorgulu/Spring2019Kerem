package replit;

import java.util.Scanner;


public class numberssum {
	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		
		int sum= n1+n2+n3 ;
		
		System.out.println("The sum of the numbers is : " + sum);
		

	}
}
