package Assessment7;

import java.util.Scanner;

import java.util.*;

public class AddPlurals {
	public static void main(String[] args) {
		
				
		    Scanner inp = new Scanner(System.in);
		    System.out.print("# in:");
		    	    		    
		    inp.nextLine(); //this line is necessary
		    System.out.print("word:");
		    String word = inp.nextLine();
		    //leave the above unedited, write your code below:
		 
		    int amt = 0;
			if(amt>1 || amt==0) {
				
			if ((word.substring(word.length()-2,word.length()).contentEquals("fe"))){
				
				word=word.substring(0,3) + "ves";
				
			}
				
			}
			else {
			word=word;
			
			}
			}
}




	
