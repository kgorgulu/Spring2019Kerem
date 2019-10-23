package day31MoreMethods;

import java.util.Arrays;

public class MethodWithStrings {

	public static void main(String[] args) {
		
	countWords("Java is fun");
	countWords("Life is great and beatiful 9");
	}
	public static void  countWords(String  sentence) {
			
		//String sentence = "Java is fun" ;
			String [] words= sentence.split(" ");
	
		System.out.println("Words in this sentence" + Arrays.toString(words));
		System.out.println("Number of words: " +words.length);
	}
	
}
