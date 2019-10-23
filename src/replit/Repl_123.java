package replit;

import java.util.*;

public class Repl_123 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    
		    //TODO. Write you code below this line. 
		    boolean allDead = true;

				int day = 0;
				System.out.println("Day " + day++ + " " +  Arrays.toString(inhabitants));



				do {

					for (int i = 0; i < inhabitants.length; i++) {

						allDead = true;

						inhabitants[i] /= 2;

					}

				System.out.println("Day " + day++ + " " +  Arrays.toString(inhabitants));

					for (int j = 0; j < inhabitants.length; j++) {



						if (inhabitants[j] > 0) {

							allDead = false;

						}



					}



				} while (!allDead);

				System.out.println("---- EXTINCT ----");

	}
}
