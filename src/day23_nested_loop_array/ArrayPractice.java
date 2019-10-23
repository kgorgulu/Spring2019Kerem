package day23_nested_loop_array;

import java.util.Arrays;

import Assessment4.IsSorted;

public class ArrayPractice {
	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50,60,70,80}; 
		
		System.out.println(Arrays.toString(arr));
		
		      
  
        for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i]); 
        
        char [] mycity = {'D','a','l','l','a','s'};
        
        System.out.println(mycity);
        
        int total =0;
        for (int i = 0; i < arr.length; i++) {
        	total+= arr[i];
        }
		System.out.println(total);	
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max)
			max=arr[i];
			
		}

		System.out.println(max);
	
	for(int numbers : arr) {
		System.out.print(numbers+ ",");
	}
	
	int x = 30;
	int[] numbers = new int[x];
	x = 60;
	System.out.println("x is " + x);
	System.out.println("The size of numbers is " + numbers.length);
    } 
	
	/*
		String name ="Gorgulu";
		String reversed= "";
		
		for(int i=name.length()-1; i>=0 ; i--){
			
			reversed+= name.charAt(i);
		}
		System.out.print(reversed);
*/
}



