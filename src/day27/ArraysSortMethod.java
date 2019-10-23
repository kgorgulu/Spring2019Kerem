package day27;

import java.util.Arrays;

public class ArraysSortMethod {
	public static void main(String[] args) {
		
		int[] nums = {1,4,5,2,77,45} ;
		System.out.println(Arrays.toString(nums));
			
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		//sorted based on ASCII code value
		
		String name= "CyberTek 123";
		
		char[] nameChars = name.toCharArray();
		
		Arrays.sort(nameChars);
		
		System.out.println(Arrays.toString(nameChars));
		
		String [] names1= {"abc" , "afg", "afz", "Afz", "afZ"};
				
		System.out.println(Arrays.toString(names1));
		
		

	}
}
