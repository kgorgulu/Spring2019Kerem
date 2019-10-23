package replit;
import java.util.*;

public class Repl_114_Arrays_has_55 {
	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		   // int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    int[] nums= {1, 5, 5,4, 3};
		    
		    //TODO Type your code below:
		  boolean five=false; // why do we have to declare boolean = false;
		  
		  
		  for (int i = 0; i < nums.length-1; i++) {
			  if(nums[i]==5 && nums[i+1]==5) {
				  
				  five=true;
				  
				  
			  }
					  
		}
		  System.out.println(five);
		       
		    
		  }
		}

