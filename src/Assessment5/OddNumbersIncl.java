package Assessment5;

import java.util.Scanner;

public class OddNumbersIncl {
	public static void main(String[] args) {

	
		 Scanner s = new Scanner(System.in);
		    System.out.print("#1: ");
		    int num1 = s.nextInt();
		    System.out.print("#2: ");
		    int num2 = s.nextInt();
		    //start on line 11
		    if (num1 % 2 != 0) {

				System.out.print(num1 + " ");

				for (int i = num1 + 2; i < num2; i += 2) {

				
					System.out.print(i + " ");

				}

				if (num2 % 2 != 0) {

					System.out.print(num2 + " ");

				}

			}

			else {

				for (int i = num1 + 1; i < num2; i += 2) {
			
					System.out.print(i + " ");

				}

				if (num2 % 2 != 0) {

					System.out.print(num2 + " ");
	    
	  }
	}
}
}