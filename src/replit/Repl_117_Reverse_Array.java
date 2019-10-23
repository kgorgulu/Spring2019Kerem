package replit;

import java.util.*;

public class Repl_117_Reverse_Array {
	public static void main(String[] args) {
		

		
		    Scanner input = new Scanner(System.in);
		    //int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    
		    int[] nums ={4, 3, 2, 44, 1, 100, 55};
		    
		    //Do not change below statement:
		    for (int i = 0, j = nums.length -1; i < nums.length/2; i++, j--){
			      int t = nums[i];  // ?
			      nums[i] = nums[j];
			      nums[j] = t;
			  
			    }
		    
		    System.out.println(Arrays.toString(nums));
		    
		  }
		}