package day23_nested_loop_array;

import java.util.Scanner;

public class ArrayCreation {
	public static void main(String[] args) {
		
		// TASK 4
		// create an array of double with size 4 
				// assign 4 value
				//then print then all out
			// dataType[] variableName=new data[4];
	//	int i;
	//	i=10;
		
				double[] prices1;
					prices1= new double[4];
					
				//double[] number = new double[4];
				
				prices1[0]=10.5;
				prices1[3]=21.2;
				prices1[2]=37.8;
				prices1[1]=40.1;
				
				System.out.println(prices1[3] );
				
				// TASK 5:
				/*
				 * declare boolean array variable that point to array of size 5
				 * declare short variable 
				 * declare String array variable
				 * declare Scanner array variable
				 */
				/// the number in [] is the capacity of array object
				
				boolean [] b1=new boolean[5];
				short [] s1=new short[2];
				String [] st1=new String[20];
				Scanner [] scan= new Scanner[15];
				
				
				//int[] nums=new int[3];
				
				//int[] nums= {100,200,300};
				
				int[] nums= new int[] {100,200,300};
					
					System.out.println(nums);
					
				
				

	}
}
