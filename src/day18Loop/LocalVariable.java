package day18Loop;

import java.util.Scanner;

public class LocalVariable {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x ;
		int y = 10;
		
		if(y>5) {
			
			x=10;
		}else {
			x=5;
			
			
			System.out.println("Give me 5");
			x=scan.nextInt();
			
		}
			System.out.println("YAY GOOD JOB");
			

	}
}
