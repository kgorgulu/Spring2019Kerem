package day33Methods;

import java.util.Arrays;
import java.util.Random;

public class GetArray {
	public static void main(String[] args) {
		
		//getArray();
		
		System.out.println(Arrays.toString(getArray()));
		int [] nums = getArray();
		System.out.println(Arrays.toString(nums));
		
		
	}
	public static int[] getArray() {
		int [] retArray = {45,43,11,545,1234};
		return retArray;
		
		
	}
	
}
