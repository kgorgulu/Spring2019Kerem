package day9;

import java.util.Scanner;

public class gradingifelse {
		
			public static void main(String[] args) {
				

				Scanner scan = new Scanner(System.in);

				System.out.println("enter your grade: ");

				int grade = scan.nextInt();



				if (grade >= 90) {

					System.out.println("your grade is A " );

				}

				else if (grade >= 80 && grade < 90) {

					System.out.println("your grade is B" );

				}

				else if (grade >= 70 && grade < 80) {

					System.out.println("your grade is C");
					

				} else {

					System.out.println("sorry student, gotta work hard to pass this class next time!");

				}



			}



	}

