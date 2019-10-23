package day27;

import java.util.Arrays;

public class ArraysEquality {
	public static void main(String[] args) {
		
		int[] arr1 = {1,3,4,65,2};
		int[] arr2 = {1,3,4,65,2};
		
		System.out.println( arr1 == arr2);
		
		boolean sameOrnot = Arrays.equals(arr1,arr2);
		System.out.println( sameOrnot);
		
	}
}
