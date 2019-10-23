package day9;

import java.util.Scanner;

public class Stringequaltry {
	public static void main(String[] args) {

		
			
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter your name please : ");
				
				String name = scan.next();
				String expected = "Kerem";
				
				
				boolean namexpected = name.equals("Kerem");
				
				 
				
				if ( name.equals("Kerem")) {
					
				System.out.println("Thats Him");
					
				}else{ 
					
					System.out.println("Not Him");
					
				}
	}

	}
