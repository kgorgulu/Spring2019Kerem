package day15_StringnMore;


public class Reversing {
	public static void main(String[] args) {


			String myword= "Kerem";
			
			System.out.println(reverse(myword));
			
	}

	public static String reverse(String text) {
		
		String reversed = "";
		for (int i = text.length()-1; i>= 0; i--) {
			reversed+= text.charAt(i);
			
		}
		return reversed;
		
	}
}
