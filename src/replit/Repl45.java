package replit;
import java.util.Scanner;
public class Repl45 {
	public static void main(String[] args) {
			/*
		 * In the Happy Valley School System, children are classified by age as follows:
		 
		 		less than 2, ineligible
			    2, toddler
			    3-5, early childhood
			    6-7, young reader
			    8-10, elementary
			    11 and 12, middle
			    13, impossible
			    14-16, high school
			    17-18, scholar
			    greater than 18, ineligible
			Given an int variable age, write an if statement that prints out, on a line by itself, the appropriate label from the above list based on age.
			Example:
			-Display prompt: Enter age:
			8
			-Display prompt: elementary
*/
		int age;
		System.out.println("Enter age:");
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		if (age<2 || age>18)
			System.out.println("ineligible");
		if (age==2)
			System.out.println("toddler");
		if (age>2 && age<6)
			System.out.println("early childhood");
		if (age>5 && age<8)
			System.out.println("young reader");
		if (age>7 && age<11)
			System.out.println("elementary");
		if (age>10 && age<13)
			System.out.println("middle");
		if (age==13)
			System.out.println("impossible");
		if (age>13 && age<17)
			System.out.println("high school");
		if (age>16 && age<19)
			System.out.println("high scholar");
			
		
		
	}
}
