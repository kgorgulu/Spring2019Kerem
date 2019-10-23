package day62_Exceptions;

public class MultiTryCatchBlock4 {
	public static void main(String[] args) {
		
		//StringIndexOutOfBoundsException, ArithmeticException
		
		System.out.println("Beginning");
		
		String str = "ABC";
		
		int num1=10;
		int num2= 0;
	try {
		System.out.println("Try Started");
		System.out.println(str.charAt(100));  // -->> NEW StringIndexOutOfBoundsException()
		
		System.out.println(num1/num2);   // -->> NEW ArithmeticException()
		
		System.out.println("Try Ended");
	} catch (StringIndexOutOfBoundsException ex1) {
		// TODO: handle exception
		
		System.out.println("does not have that index");
	}catch (ArithmeticException ex2) {
		// TODO: handle exception
		
		System.out.println("DO NOT DIVIDE BY 0 !!!");
	}
	
	
		
		System.out.println("Ending");

	}
}
