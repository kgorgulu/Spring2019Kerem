package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_119_Arraysconvertdec2bin {
	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    int[] binary = new int[8];
		    
		    int i =7;
		    while(decimal>7) {
		    	
		    	binary[i--]=decimal%2;
		    	decimal/=2;
		    	
		    }
		    System.out.println(Arrays.toString(binary));
		    
		    
	}
}
