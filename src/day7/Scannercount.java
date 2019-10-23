package day7;

import java.util.Scanner;

public class Scannercount {
	
public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		int offerCount =1;

		offerCount+=5;

		offerCount -=2;

		offerCount *=4;

		offerCount /=2;

		offerCount %=5;
		
		System.out.println("offerCount");
		

		System.out.println("Type your offercounts");

		

			int offercount = input.nextInt();

		

		System.out.println( (4*(offercount-2) /2)%5 );

	}
}
