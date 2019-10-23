package replit;

import java.util.Scanner;

public class Repl_71_Swap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String firstName="";
	    String lastName="";
	    String domain="";
	        
        
    if(email.contains("_")) {
    	firstName=email.substring(0,email.indexOf("_"));
        lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        domain= email.substring(email.indexOf("@"));
        
        System.out.println(lastName+ "_" + firstName + domain);
    }else {
        System.out.println(email);

	}
}
}
