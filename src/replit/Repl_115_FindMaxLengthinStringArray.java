package replit;

import java.util.*;

public class Repl_115_FindMaxLengthinStringArray {
	public static void main(String[] args) {
		
			//    Scanner input = new Scanner(System.in);
				String[] words = {"john", "kerem", "mal", "salime", "selimcan"};
				
		//  Scanner input = new Scanner(System.in);
		//	String[] words = new String[5];
	//		for(int i = 0; i < words.length;  i++) {
			  
			//  words[i] = input.nextLine();
			  
		//	}
			
			//write your code below
			
			int max = words[0].length();
					int index = 0;
					
					for (int i = 1; i < words.length; i++) {

						if (words[i].length() > max) {
							max = words[i].length();
							index = i;
						}
					}
					System.out.println(words[index]);

		
}
}
