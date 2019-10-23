package replit;

public class FindNumberFromString {
	public static void main(String[] args) {
		
		String str = "404 Error";
		
		System.err.println("The error is " +str.replaceAll("[^0-9]", "")); // it will clear the letters

		System.err.println("The letters are " +str.replaceAll("[^A-z]", "")); // it will clear the numbers
		

	}
}
