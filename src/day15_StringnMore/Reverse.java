package day15_StringnMore;


public class Reverse {
	public static void main(String[] args) {
		
		String word = "apple" ; 
		
		word.toUpperCase() ;  // "APPLE"
		
		System.out.println( word.toUpperCase()  );// "APPLE"
		
		System.out.println(  word );
		System.out.println(reverse("Apple"));
	}
		
//System.out.println(""+ word.charAt(4) + word.charAt(3)  );
		
		public static String reverse(String text) {
			
			String reversed = "";
			for (int i = text.length()-1; i>= 0; i--) {
				reversed+= text.charAt(i);
				
			}
			return reversed;
			
		
			
	}
}
