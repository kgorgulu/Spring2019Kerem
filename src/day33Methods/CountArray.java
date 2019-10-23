package day33Methods;


public class CountArray {
	public static void main(String[] args) {
		int [] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
		//int fives =
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));
		
		int five = findOccurences(nums, 5);
		System.out.println(five);
	}
		public static int findOccurences(int[] array, int value) {
			
			int counter = 0;
			for (int num : array) {
				if (num==value) {
					counter++;
								
				}
			}
			return counter;
			}
		

	}
