package Assessment8;

import java.util.Scanner;


public class CondStatement {
	public static void main(String[] args) {

		
			Scanner inp = new Scanner(System.in);
		  	System.out.print("In:");
		  	String word = inp.nextLine();
		  	//DO NOT CHANGE ABOVE CODE!  Write your code below
		  	
		  	if(word.endsWith("ly")) {
		  		System.out.println("-ies");
		  	}else if(word.endsWith("ey")) {
		  		System.out.println("-eys");
		  	}else if(word.endsWith("ife")) {
		  		System.out.println("ives");
		  	}else {
		  		System.out.println("-s");
			}
		  	
		  }
}
