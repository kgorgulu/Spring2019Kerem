package day24_Array;

import java.util.Arrays;

public class ArrayC50 {
	public static void main(String[] args) {

		
		int [] nums = new int[51];
		
		//evenNums= nums%2
			
		for (int i = 0; i <=50; i++) {
			nums[i]=i*2;
			
		}
		
		System.out.print(Arrays.toString(nums));		
	}
}
