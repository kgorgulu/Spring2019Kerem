package officehours;

import java.util.Arrays;

public class April8Arrays {
	public static void main(String[] args) {
		
		String[] words= {"Apple", "Orange", "Pear"};
		String[] words2= new String[]{"Apple", "Orange", "Pear"};
		String[] words3= new String[3];
		words3[0] = "Apple";
		words3[1] = "Orange";
		words3[2] = "Pear";
		
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		
		String sentence = "Java is the best coding language";
		
		// how to store those words separately in the array?
		String [] newWords = sentence.split(" ");
	//	String [] newWords = sentence.split("");		
		System.out.println(Arrays.toString(newWords));
		
		for (String s: newWords) {
			System.out.println(s);
		
	}
}
}
