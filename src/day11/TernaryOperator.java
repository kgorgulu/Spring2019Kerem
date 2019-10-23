package day11;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		
		//use for conditionally assigning a value
		
		int score ;
		Scanner scan=new Scanner(System.in);
		score=scan.nextInt();
		
		String abc = "" ;
		
		if (score>75) 
			
			abc = "pass";
		
		else 
			abc = "fail";
		
		abc = (score>75) ? "pass" : "fail";
		
		System.out.println(abc);
		
		
	}
}
