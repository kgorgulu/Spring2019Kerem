package replit;

import java.util.*;



public class Repl_111_Arrays_findnonduplicate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
		int counter=0;
		int value = 0;
		
		for (int i=0; i<nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					counter++;
					
				}
			}
		if(counter==1) {
			value=nums[i];
			break;
			
		}
		counter=0;
		
		}
		
		System.out.println(value);
		
	}
}
