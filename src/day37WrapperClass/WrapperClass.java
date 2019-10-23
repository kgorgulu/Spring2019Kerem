package day37WrapperClass;

public class WrapperClass {
	public static void main(String[] args) {
		 //Byte b = new Byte((byte) 123);
	
		
		// upcasting/ type widening
		// 10 is literally considered as int
		// 10---> 10L amd stored inside long variable
		
		long lval = 10;
		
		//autoboxing ---> 
		// 10L will become new Long(10L) as object and asssigned to lRef
		
		Long lRef = 10L;
		
		// reference type does not care about the range
		// it only care about the relationship between types
		// range compatible assignment only works for primitive numbers
		// BELOW CODE DOES NOT WORK
		// Long lRef2 = new Integer(10);
		
		// This always mislead programmer to think as below
		// 10--> 10L by type widening to Long Object
		// BIG NO !!!!!!
		// COMPILER IS LAZY---> IT ONLY TAKES ONE STEP!
		// FOR EXAMPLE: IT EITHER ONLY TAKE ACTION OF 10---> 10L OR 10 ---> New Integer (10)
		
		// BIG BAD!!! COMMON TRICKY EXAM | INTERVIEW QUESTIONS
		
		// Long lRef3 = 10;
		
		Double d = 3.14 ; // autoboxing
		
		// compiler can not turn int 3 into Double Object in one step
		// And compiler only willing to take one step so it does not work 
	    
	    // STEP 1 : 3 ---> 3.0d    upcasting 
	    // STEP 2 : 3.0d --> new Double(3.0d);  // autoboxing
	    // BIG BAD 
	    // Double badD = 3; 
		
		
	//	printByteValue( (byte)10 );
	    
	  //  byte b = 12 ; 
	 //   printByteValue(b);
	    
	  }
	  
	  
	  public static void printByteValue(byte b) {
	    
	    System.out.println(b);
	
	
	}
}
