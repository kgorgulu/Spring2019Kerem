package replit;
import java.util.Scanner;
public class Repl120ArraysReverseSentence {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String sentence = input.nextLine();
		
	   
	        
	    String[] reverse = sentence.split(" ");

	    for (int i = reverse.length - 1; i >= 0 ; i--) {

	    	System.out.println(reverse[i]);
	}
}
}
