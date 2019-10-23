package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayP {
	public static void main(String[] args) {
		
		int [] nums= {1,2,1};
		//int [] nums= {1,2,3};
		
		if(nums.length>=1 && nums[0]==nums[nums.length-1]) {
			
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
		
		int [] a={2,2,3};
		int [] b={1,2,3};
		
		if(a[0]==b[0]|| a[a.length-1]==b[b.length-1]){
			
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}
		Scanner input = new Scanner(System.in);
		
		int[] nums1 = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		Arrays.sort(nums1);
	}
}
