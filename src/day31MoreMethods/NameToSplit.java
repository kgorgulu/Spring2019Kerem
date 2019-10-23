package day31MoreMethods;
import java.util.Arrays;
import java.util.Scanner;

public class NameToSplit {
	public static void main(String[] args) {
		
		    Scanner inp = new Scanner(System.in);
		    String s = inp.nextLine();
		    person(s) ;
		  }
		  
		   public static void person(String info) 
			{
			
				//your code here
				String[] given= info.split(" ");
				
				//System.out.println(Arrays.toString(given));
				System.out.println("person name:"+ given[0] + " last name: "+ given[1] + " age: "+given[2]);
			
			
			}//end person
		  
		

	
}
