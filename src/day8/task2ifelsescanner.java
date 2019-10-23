package day8;

import java.util.Scanner;

public class task2ifelsescanner {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double iphonePrice = 599.99, iPadPrice = 899.99, yourBudget;

		int phoneCount, tabletCount;

		System.out.println("Enter your iphone count :  ");

		phoneCount = input.nextInt();

		System.out.println("Enter ipad count :");
		tabletCount = input.nextInt();

		System.out.println("Enter your budget : ");
		yourBudget = input.nextDouble();

		double total = iphonePrice * phoneCount + iPadPrice * tabletCount;

		System.out.println("$" + total);

		// double additional = total-yourBudget;

		if (total > yourBudget) {
			;
			System.out.println("Out of the Budget");
			System.out.println("You need extra " + "$" + (total - yourBudget));

		} else {
			System.out.println("I will take it");
		}

	}
}
