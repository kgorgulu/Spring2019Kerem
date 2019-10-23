package replit;

import java.util.Scanner;

public class Repl_103_CountCode {
	public static void main(String[] args) {

		int count = 0;
	    Scanner scan = new Scanner(System.in);
	    String  str = scan.nextLine();
	    
	    for (int i = 0;(i+3)<str.length(); i++) {
            
            if(str.substring(i,i+4).startsWith("co") && str.substring(i,i+4).endsWith("e")){
                count++;
            }
            
		      
		      
	    System.out.println(count);
	}
}
}