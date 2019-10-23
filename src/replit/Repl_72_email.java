package replit;

import java.util.Scanner;

public class Repl_72_email {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
		
		int len= email.length();
        int underscore= email.indexOf("_");
        int at = email.indexOf("@");
        int dot= email.indexOf(".");
          
        String first= email.substring(1,underscore);
        String firstchar= (email.substring(0,1)).toUpperCase();
        
        String last = email.substring(underscore+2, at );
        String lastchar= (email.substring(underscore+1,underscore+2)).toUpperCase();
        
        String domain = email.substring(at+1,dot);
        String topLevel= email.substring(dot+1,len);
        
        System.out.println("First name: "+firstchar+""+first);
        System.out.println("Last name: "+lastchar+last);
        System.out.println("Domain: "+ domain);
        System.out.println("Top-Level Domain: "+topLevel);
 }

	}

