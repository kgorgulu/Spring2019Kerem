package day15_StringnMore;

import java.util.Scanner;

public class AmazonSearchTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		// ask user to items to search for 
		
		// verify the tab name has changed to Amazon.com : yourText
		
		System.out.println("Enter items to search for : ");
		String itemToSearchFor = scan.next(); 
		
		System.out.println(  "You have entered : "+ itemToSearchFor);
		
		// Amazon.com : itemToSearchFor
		String expectedResult = "Amazon.com :iPad"  ; 
		String actualResult = "Amazon.com :"+itemToSearchFor ; 
		
		//if(expectedResult.equalsIgnoreCase(actualResult) ) {
		if(expectedResult.equals(actualResult) ) {
				System.out.println("Test pass for ipad");
		}else {
			System.out.println("Test Failed for ipad");
		}


	}
}
