package replit;

import java.util.Scanner;

public class Repl_90 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();

		 int firstIndex =html.indexOf("id=\"");
	        int lastindex = html.lastIndexOf("\"");
	        String myValue = "";
	        
	        for(int i=0; i<html.length()-2;i++) {
	          if(html.contains("id=\"") && html.contains("\"")){
	        myValue=html.substring(firstIndex+4,lastindex);    }
	        else
	        myValue="Invalid input!";
	        }
	    
	        System.out.println(myValue);

	}
}
