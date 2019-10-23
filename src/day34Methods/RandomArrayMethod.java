package day34Methods;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayMethod {
	public static void main(String[] args) {
		
		//for(;;) { //while(true) if you want to repeat forever
		System.out.println(Arrays.toString(getRandomArray(10)));
		
		System.out.println(sum(20,30,40));
		}
		
	
	
	public static int[] getRandomArray(int size) {
		Random random = new Random();
		
		int [] nums = new int [size];

		for (int i = 0; i < size; i++) {
			nums[i]= random.nextInt(101);
		}
		return nums;
		
		
	}
	public static int sum(int... nums) {
		int sum = 0;
		
		for(int n: nums) {
			sum+=n;
			
		}
		return sum;
		
	}

}
