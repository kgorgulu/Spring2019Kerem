package day28;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		
		String sentence = "you are very smart person";
		//split by space
		
		String [] arrSentence= sentence.split(" ");
		
		System.out.println("Number of words:  " +arrSentence.length);
		System.out.println(Arrays.toString(arrSentence)	);
		
		String reversed = "";
		
		for (int i =arrSentence.length-1;i>=0 ; i--) {
			
			//System.out.println(arrSentence[i]);
			
			reversed+= arrSentence[i]+" ";
						
		}
		reversed = reversed.trim();
		System.out.println(reversed);
	}
}
