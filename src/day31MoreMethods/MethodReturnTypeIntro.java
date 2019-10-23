package day31MoreMethods;

public class MethodReturnTypeIntro {
	
	public static void main(String[] args) {
		
		String str = "You know nothing about Java Jon Snow";
		
		int count = str.length();
		System.out.println(count);
		System.out.println(str.length());
		
		// String arrStr = Arrays.toString(str.toCharArray());
		
		int five = giveMeFive();
		System.out.println(five);
		System.out.println(giveMeFive());
		
			String nameString = giveMeMyName();
				System.out.println(nameString);
				
				System.out.println(nameString.substring(0,2));
				
	}
	
	public static String giveMeMyName() {
		return "Kerem";
		
	}
	
	public static int giveMeFive() {
		
		return 5;
		
	}


}
