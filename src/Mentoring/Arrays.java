package Mentoring;

public class Arrays {
	public static void main(String[] args) {
		
			
		String sentence = " Java is the best coding language " ;
		
	//	how to Store these words separately in the array?  
		
		String[] newWords = sentence.split("");
		System.out.println(Arrays.toString(newWords));

		//String [] newWords = sentence.split(" ");
		//	String [] newWords = sentence.split("");		
		//	System.out.println(Arrays.toString(newWords));
		// in order to print every word from new line
		
		for (String s: newWords) {
			System.out.println(s);
		}
		
		int[] numbers = {23,325,23,52,64,43,26,46};
		
		int amountOfSpaces = 0;
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i)==' ') {
				amountOfSpaces++;
				
			
		}
		
		}
		
	}
}
