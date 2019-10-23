package replit;
import java.util.Scanner;
public class Repl97 {
	public static void main(String[] args) {
		
/*
 * Example:

input: A

input: Z

output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */


			   Scanner scan = new Scanner(System.in);

				    char start = scan.next().charAt(0);

				    char end = scan.next().charAt(0);

				    

				    for (int i = start; i <= end; i++) {

						System.out.print((char)(i));

					}
		

	}

}

