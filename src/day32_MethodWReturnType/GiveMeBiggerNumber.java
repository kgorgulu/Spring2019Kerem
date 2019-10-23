package day32_MethodWReturnType;

public class GiveMeBiggerNumber {
	public static void main(String[] args) {
		
		
		
		// Task3 ;
		// Create a static a method called giveMeBiggerNumber
		// it takes 2 int as paramteters
		// and return a bigger number
		// call the method couple times with different result
		
		int biggerNum = giveMeBiggerNumber(10,12);
		
		System.out.println(biggerNum);
		
				
		System.out.println(giveMeBiggerNumber(100,11));
		
		
	}
		public static int giveMeBiggerNumber(int num1 , int num2) {
			
			int max = (num1>num2)? num1 : num2;
			
			return max ;
			
		}
		
		
		
	}

