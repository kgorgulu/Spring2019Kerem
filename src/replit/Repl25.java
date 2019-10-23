package replit;
import java.util.Scanner;
public class Repl25 {
	public static void main(String[] args) {
		/*
		 * 
		 * Instructions from your teacher:
a console menu is basically a text menu. after it is outputted to the console a user input is captured.

then the program decides what to do according to the user input (what the user selected).

this is done using ifs.

our console menu has 3 items called "options"


    System.out.println("---------------");

    System.out.println("select an option:");

    System.out.println("1) option 1");

    System.out.println("2) option 2");

    System.out.println("3) option 3");

    System.out.println("---------------");


which outputs:

 

---------------
select an option:
1) option 1
2) option 2
3) option 3
---------------


you are to implement the logic part of the menu using ifs .

for example:

if the user inputs 1

output:
user selected 1

if the user inputs 2

output:
user selected 2

if the user inputs 2

output:
user selected 2
		 */
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("---------------");
	    System.out.println("select an option:");
	    System.out.println("1) option 1");
	    System.out.println("2) option 2");
	    System.out.println("3) option 3");
	    System.out.println("---------------");
	    
	    int choice = s.nextInt();
	    
	    if (choice==1) {
	    	System.out.println("user selected 1");
	    }else
	    if (choice==2){
	    	System.out.println("user selected 2");
	  	    }else
	  	 if (choice==3) {
			System.out.println("user selected 3");
			    	
	    	
		}
	  
	}
}
