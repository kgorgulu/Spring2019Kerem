package day32_MethodWReturnType;

public class Task2 {
	public static void main(String[] args) {
		
		// create a method called isAdultOrNot
		// it takes one int as a parameter and return a boolean
		// inside body --> if the number passed is more than 18 return true
		// else return false
		
		
		// call your method couple times and print out the result
		// either by saving it or directly storing it
		
		
		boolean result = isAdultOrNot(19);
		
		System.out.println( isAdultOrNot(23) );
	}
	
		public static boolean isAdultOrNot(int age) {
			

	  if (age > 18) {

	    return true;

	  } else {

	    return false;

	   
	  }
	}
}
