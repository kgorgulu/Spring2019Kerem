package day25;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		
		//create an array of int with capacity of 50
		// store 1-50 inside
		// print them out
		 
		int [] nums = new int [50];
		 
		 for (int i = 0; i < 50; i++) {
			nums[i]=i+1;
		 }
			System.out.println(Arrays.toString(nums));
			
			int[] evenNumbers = new int[51];
			
		for (int i = 0; i <51; i++) {
			nums[i]= i*2;
					
		}
		 System.out.println(Arrays.toString(evenNumbers) );
		 
		 //   int y = 0;
		//    for(int i = 0; x<50;i++) {
		 //   	nums[i]=i+1;
		 //   	y+=2;
		 //   System.out.print(nums[x]+" ");	
		    }
		
		// create another array of int with cap. of 50 
		// store even numbers from 0-100 inside
		// print them out
		/*
		 *  int [] arr = new int [50];
		    int y = 0;
		    for(int x = 0; x<50;x++) {
		    	arr[x]=y;
		    	y+=2;
		    System.out.print(arr[x]+" ");	
		    }
		 */
	}

