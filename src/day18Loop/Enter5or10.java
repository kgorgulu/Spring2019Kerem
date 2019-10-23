package day18Loop;

import java.util.Scanner;

public class Enter5or10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		
		while (x!=5 && x!=10);{
			
		
		//while (!(x==5 || x==10 )) {
			
		
			System.out.println("Enter 5$ or 10$ ");
			x=scan.nextInt();
		}
			System.out.println("END OF LOOP");
		
	}
}
