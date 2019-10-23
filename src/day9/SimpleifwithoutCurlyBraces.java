package day9;

import java.util.Scanner;

public class SimpleifwithoutCurlyBraces {
	public static void main(String[] args) {

		int x = 9;

		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();

		if (x1 != 10)
			System.out.println(" Not 10 !");

		else

			System.out.println(" yes It is");

		/*
		 * boolean b = false ; () inside here , you can put boolean literal :true false
		 * boolean variable : b boolean expression : any operation that result in
		 * boolean
		 * 
		 */
		// Curly braces for if and else blocks are optional
		// ONLY WHEN WE HAVE SINGLE STATEMENT !
		// if(x != 10 )
		// System.out.println("NOT 10 !");
		// else
		// System.out.println("YES IT IS 10");

		// COMMAND SHIFT F
		// CTR SHIFT F

	}
}
