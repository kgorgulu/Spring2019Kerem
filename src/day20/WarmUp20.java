package day20;

import java.util.Scanner;

public class WarmUp20 {
	public static void main(String[] args) {
		
		
		/*
		 * while (some condition is true){
		 * 	action to be repeated
		 * }
		 * do{
		 * action to be repeated
		 * }while(some condition true
		 */
		
		String name = "";
		String pass = "";
		Scanner scan = new Scanner(System.in);
		
				
			System.out.println("Enter username: ");
			name= scan.next();
			System.out.println("Enter password: ");
			pass= scan.next();
		while (!(name.equals("abc") && pass.equals("123"))) {

		
	System.out.println("END");
		
	
	
		}	

}
}

