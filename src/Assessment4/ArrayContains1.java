package Assessment4;


public class ArrayContains1 {
	public static void main(String[] args) {

		int[] arr = {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0};
		
		System.out.println(has1(arr));
		
}

	//write a static method that takes in int array and return true if array contains 1
	
		public static boolean has1(int[] array) {
			for (int i = 0; i < array.length; i++) {
				
					if (array[i]==1) {
						return true;
				
			}
			}
			return false;
			
}
	
}
