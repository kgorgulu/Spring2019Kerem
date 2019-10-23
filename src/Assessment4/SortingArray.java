package Assessment4;


public class SortingArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		int [] array = {1,2,3,4,5};
		int [] array2 = {23, 45, 55, 76, 34, 98, 101}; 

		System.out.println(isSort(array)); //true
		System.out.println(isSort(array2));//false
		
		
		
	}
	
	//write a static method isSort that takes int arr and return true if array is sorted
	
		public static boolean isSort(int[] arr) {
	
			for (int i = 0; i < arr.length-1; i++) {
		
				if (arr[i]>arr[i+1]) {
			
			return false;
		}
		}
		return true;

		
		}
			
	}
