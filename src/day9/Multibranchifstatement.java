package day9;

import java.util.Scanner;
public class Multibranchifstatement {
	public static void main(String[] args) {
		
		//Gradebook
		
		int score = 24;
		
		// if the score is between 90-100 A
		// if the score is between 80- 89 B
		// if the score is between 70- 79 C
		//Else D and print study harder
		
		if(score >= 90) {
			System.out.println(" You Got A ");
			
		}else if(score >=80 && score<90) {
			System.out.println(" You got B ");
		}else { 
			System.out.println("study harder");
			
		}
		

		
	}
}
