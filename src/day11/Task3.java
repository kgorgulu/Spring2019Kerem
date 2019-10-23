package day11;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		//TASK 3:
		
				// Create a variable price as double , String as label
				// if the price is more than 100 assign value as expensive
				//else assign value as cheap
				
				// Create a char variable
		
				double price = 110.99;
				
				String label = (price>100)? "expensive": "cheap";
				
				System.out.println(label);
				
					if (price>100) {
					
					label = "expensive";
				
					}else { if (price<90){
						
						label = "moderate" ;
					}else {
						
					 label = "cheap";
					}
				
				
				label = (price>100) ? "expensive" : (price>90) ? "moderate" : "cheap";
				
				//String label2 = (price<=100 && price>90)? "moderate" : "cheaporexp" ;
				
				
				System.out.println(label);
				
					}
	}
}

				
				

	