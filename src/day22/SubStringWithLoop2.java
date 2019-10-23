package day22;

public class SubStringWithLoop2 {
	public static void main(String[] args) {

		//Task 2
		
		String str="ABCDEBC";
		// print 2 letter at a time compared to one from previous tasks
		// ABCDE --> AB BC CD DE EB BC
		// Count the number of BC on this 
		
		for ( int i = 0; i < str.length(); i++) {
			
			String twoChar = str.substring(i,i+2);
			
			System.out.println(twoChar);
				
		
	}
}
}
