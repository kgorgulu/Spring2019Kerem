package day10;

import java.util.Scanner;

public class amazonshopper {
		
			public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Welcome Amazon Shpper");
			
	        System.out.println("Enter Price : ");

	        double price = scan.nextDouble();

	        System.out.println("Are you a PrimeMember : ");

	        boolean primeMember = scan.nextBoolean();

	        
	        if(primeMember == true)

	        {

	            System.out.println("You have a free shipping : "+price);

	            
	        }else if(price>35) {

	            System.out.println("You still have free shipping : "+price);
	            
	       	}else  {

	            System.out.println("Add $5  Shipping :" +price+5);
	            
	            System.out.println("you may also consider joining prime" + "avoid shipping fee");

	}
	}
}

