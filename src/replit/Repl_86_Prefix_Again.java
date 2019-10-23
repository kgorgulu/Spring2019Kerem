package replit;

import java.util.Scanner;

public class Repl_86_Prefix_Again {
	public static boolean main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int n = scan.nextInt();

    boolean result = false;
    if (n < str.length() && 
            (str.substring(1)).indexOf(str.substring(0,n)) > -1
            ) {
        result = true;
    }
    return result;
    
}

	}

