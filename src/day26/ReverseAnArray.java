package day26;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		
		/// reverse this array so the value of numbers array    

	    //  will be in reverse order
		
		int[] numbers = {11,2,39,18,7,4,15};
		
		int count = numbers.length;
		
		int lastindex= count-1;
		
		for (int i = 0; i <count/2; i++) {
			
			int temp = numbers[i];
			numbers [i]= numbers[lastindex-i];
			 	
			numbers [lastindex-1] = temp;
		}
		
		
	/*
	 * int temp = numbers[0];
	 * 	numbers [0]= numbers[5];
	 
		
		numbers [5] = temp;
		
		temp = numbers[1];
		
		numbers [1]= numbers[5-1];
		
		numbers [5-1] = temp;
		
		temp = numbers[2];
		
		numbers [2]= numbers[5-2];
		
		numbers [5-2] = temp;
		*/
		
	System.out.println(Arrays.toString(numbers));
	
	
		
	}
}
