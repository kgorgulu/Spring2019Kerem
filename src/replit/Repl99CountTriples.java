package replit;
import java.util.Scanner;
public class Repl99CountTriples {
	public static void main(String[] args) {

		
		  Scanner scan = new Scanner(System.in);

		        String str = scan.next();

		        

		        int tripleCount = 0;

		        /*
		         * // We'll say that a "triple" in a string is a char appearing three times in a row. 

				//Print out the number of triples in the given string. 

				//The triples may overlap.
				 * charAt(0)==charAt(3)
		         */
		        // WRITE YOUR CODE HERE

		        for (int i = 0; i < str.length() - 2; i++) {

		            int count = 0;

		            for (int j = i; j < i + 3  ; j++) {

		                if (str.charAt(i) == str.charAt(j)) {

		                    count++;

		                }
                
		            }

		            if (count >= 3) {

		                tripleCount++;

		            }

		        }

		        System.out.println(tripleCount);
	}
}
