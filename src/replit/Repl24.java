package replit;

import java.util.Scanner;

public class Repl24 {
	public static void main(String[] args) {
		
		/*
		 * 
		 * -Create a Scanner object named scan.

Execution flow with example:
-Display prompt :"Welcome to the Grader!"
-Display prompt: "Please enter subject name number 1 and score for this subject"
Math
5.0
-Display prompt: "Please enter subject name number 2 and score for this subject"
Biology
5.0
-Display prompt: "Please enter subject name number 3 and score for this subject"
English
4.4
-Display prompt: "Please enter subject name number 4 and score for this subject"
Chemistry
4.8

-build summary variable by concatenating subject names and grades
calculate average score and define that value into average variable.

-Display prompt: "Summary: Math - 5.0,  Biology - 5.0,  English - 4.4, Chemistry - 4.8"
-Display prompt: "Your average score is:  4.8"
-Display prompt: "Thank you for using Grader!"
-Display prompt: "Goodbye!"
		 */

		String subject1,  subject2, subject3,  subject4, summary;
	      float  grade1,  grade2, grade3,  grade4, average;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("Welcome to the Grader!");
	      System.out.println("Please enter subject name number 1 and score for this subject");
	      subject1=scan.next();
	      grade1= scan.nextFloat();
	      
	      System.out.println("Please enter subject name number 2 and score for this subject!");
	      subject2=scan.next();
	      grade2=scan.nextFloat();
	      
	      System.out.println("Please enter subject name number 3 and score for this subject!");
	      subject3=scan.next();
	      grade3=scan.nextFloat();
	      
	      System.out.println("Please enter subject name number 4 and score for this subject!");
	      subject4=scan.next();
	      grade4=scan.nextFloat();
	      
	      average = ((grade1 + grade2+grade3+grade4)/4);

	      	      
	    	      System.out.println("Summary: "+subject1+" - "+grade1+","+subject2+" - "+grade2+","+subject3+ " - "+grade3+","+subject4+" - "+grade4);
	    	      System.out.println("Your average score is: "+average);
	    		  System.out.println("Thank you for using Grader!");
	    		  System.out.println("Goodbye!");
	    	
	    
	}
}
