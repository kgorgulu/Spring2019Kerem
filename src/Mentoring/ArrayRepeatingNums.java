package Mentoring;

import java.util.*;

public class ArrayRepeatingNums {
	public static void main(String[] args) {
		
		int count=0;
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		int[] arr = {1,2,3,3,4,5,3,7,8};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
				
			}
			
			if(count>1) {
				list.add(arr[i]);
				
			}
			count=0;
			
		}
		System.out.println(list);
		

	}
}
