package day20;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String name= "Hurma"; // = scan.next();
		
		
		// Task 1:
				// print our name char by char using do while loop
				// Hurma ---> H u r m a
				// use do while loop
		int x = 0;
		
		do {
			System.out.println(name.charAt(x) + " ");
			x++;  //x=x+1;
			
		} while (x<name.length());
		
		//System.out.println(name.charAt(0) + " ");
		//System.out.println(name.charAt(1) + " ");
		//System.out.println(name.charAt(2) + " ");
		//System.out.println(name.charAt(3) + " ");
		//System.out.println(name.charAt(4) + " ");
		
		System.out.println();
		
		
	}
}
