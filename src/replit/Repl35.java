package replit;

import java.util.Scanner;

public class Repl35 {
	public static void main(String[] args) {
		/*
		 * The video game machines at your local arcade output coupons according to
how well you play the game. You can redeem 10 coupons for a candy bar or 3
coupons for a gumball. You prefer candy bars to gumballs. Write a program that
defines a variable initially assigned to the number of coupons you win. Next, 
the program should output how many candy bars and gumballs you can get if
you spend all of your coupons on candy bars first, and any remaining coupons
on gumballs.

Example:

Display prompt: "Enter number of coupons:"
13
Display prompt: "Number of Candies: 1"
Display prompt: "Number of Gumballs: 1"

Example:

Display prompt: "Enter number of coupons:"
23
Display prompt: "Number of Candies: 2"
		 */
		int coupons, candies, gumballs;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		coupons = scan.nextInt();
		candies= coupons/10;
		gumballs= (coupons-(candies*10))/3;
		
		System.out.println("Number of Candies: " +candies);
		System.out.println("Number of Gumballs: "+gumballs);
		
				}
	}

