package replit;

import java.util.*;

import day5.scanneragepractice;

public class Repl_81_Even {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 20; i = i + 2) {
			   System.out.print(i + " ");
			}
		System.out.println("");
		for (int i = 3; i <= 18; i = i + 3) {
			   System.out.print(i + " ");
			}
		System.out.println("");
		Scanner input = new Scanner(System.in);
		
		String answer="";
		String guestlist="";

		   do
		   {
		   System.out.println("Please enter guest name:");
		   String guest=input.nextLine();
		   guestlist=guestlist.concat(guest)+"," ;
		   System.out.println("Do you want to enter new guest name:");
		   answer=input.nextLine();
		   }
		   while (answer.equalsIgnoreCase("yes"));

		   System.out.print("Guest’s list: " + guestlist.substring(0,guestlist.length()-2));
		   
		
			
			
	
		
	}
}
