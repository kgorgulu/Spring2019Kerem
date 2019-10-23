package day36ArrayLists;

public class StringToPrimitveOrObject {
	public static void main(String[] args) {
		
		/*
		 * from String to Primitives;
		 * parseX method will take String and return  to Primitive Value
		 */ 
		 
		String str1 = "True";  // i m trying to turn object to primitive
		
		boolean b1= Boolean.parseBoolean(str1);
		boolean b2= Boolean.parseBoolean("abc");
		boolean b3= Boolean.parseBoolean("ABC");
		boolean b4= Boolean.parseBoolean("true");
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		/*
		 * from String to Wrapper Class Object 
		 * value of method will take String and return to Wrapper Class Object
		 */
		String d= "3.14";
		Double d1 = Double.valueOf(d);
		
		System.out.println(d1.toString());
		
		double d2=d1; // auto boxing or unboxing ( auto unboxing)
		
		//invalid conversion
		
	}
}
