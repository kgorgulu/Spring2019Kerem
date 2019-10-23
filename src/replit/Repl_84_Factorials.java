package replit;

import java.util.Scanner;

public class Repl_84_Factorials {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		   long multiply = 1;
		     while(n>1) {
		          multiply = multiply * n;
		          n--;
		      }

		       System.out.println(multiply);
}
}
