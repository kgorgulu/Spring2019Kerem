package day9;

import java.util.Scanner;

public class StringEquality {
	public static void main(String[] args) {

		//String name  = " Lachyn";
		
		//boolean b = (name == "Lachyn");
		
		// we use method from String class called equals
		
		//boolean b = name.equals("Lachyn");
	//	System.out.println(b);
		
		//Task 2
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please : ");
		
		String name = scan.next();
		String expectedName = "Tahir";
		
		
		//boolean nameEqualToExpected = name.equals("Tahir");
		
		 boolean nameEqualToExpected = name.equals( expectedName );
		 
		
		if ( nameEqualToExpected) {
			
		System.out.println("Thats Tahir");
			
		}else{ 
			
			System.out.println("Not Him");
			
		}
	
}
}
