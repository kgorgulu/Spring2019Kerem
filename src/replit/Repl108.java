package replit;
import java.util.Scanner;
public class Repl108 {
	public static void main(String[] args) {
	/*
	 * Using for loops (you may need more than one), 
	 * write code that will cause a triangle of asterisks of size n to be output to the screen.
	 * Example:

input: 5
output: *
output: **
output: ***
output: ****
output: *****
	 */
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();


		for ( i = 1; i <= n; i++) {

			for ( j = 0; j < i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}
		

	}
}
