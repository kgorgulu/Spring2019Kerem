package day23_nested_loop_array;

public class WarmUp {
	public static void main(String[] args) {
		/*
		 * write a program to get unique characters from a string  
		 * : aaabbccc —> abc
		 * */
		String str = "aaabbccc" ; 
		String uniqueStr = "" ; // we just need to create another string to store what we want
		
		for (int i = 0; i < str.length(); i++) {
			
			String eachChar = str.substring(i, i+1) ;  //we need to go through each character to store if we had 
													//already stored then move to next character
			//System.out.println(eachChar);
			
			if(! uniqueStr.contains(eachChar) ) {
				uniqueStr += eachChar ; 
				
			}
		}
		System.out.println(uniqueStr);

}
}

