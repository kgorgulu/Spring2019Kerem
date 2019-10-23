package day29Methods;

import java.util.Random;


public class Numbers {
	public static void main(String[] args) {
		stringLength();
		stringLength();
		showme5Numbers();
		while (true) {
			showme5Numbers();
			
			break;
			
		}
		}
	
	
		public static void stringLength() {
			
	
		String string= "Java";
		
		int nums= string.length();
					
		System.out.println(nums);
		}
		public static void showme5Numbers() {
			
		
		Random ran = new Random();
		int i=0;
		
		for(i=1; i<=5; i++) {
			
			System.out.print(ran.nextInt(1001)+ " ");
	}

		System.out.println();
		}
}
