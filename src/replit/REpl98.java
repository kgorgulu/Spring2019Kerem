package replit;
import java.util.Scanner;
public class REpl98 {
	public static void main(String[] args) {
		/*
		 * Example:

			input: We study java not python

			output: true


			Example:

			input: What's the difference between java, javascript and python?

			output: false
		 * 
		 */
		
			
			Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	    int javaCount = 0 ;

	    int pythonCount = 0 ;

	    do {

	    	 if (sentence.contains("java")) {

	 			javaCount++;

	 			sentence = sentence.replaceFirst("java", "");

	 		}

	 	    if(sentence.contains("python")) {

	 			pythonCount++;

	 			sentence = sentence.replaceFirst("python", "");



	 		}

		} while (sentence.contains("java") || sentence.contains("python")  );

	   

	    

	    System.out.println(javaCount == pythonCount);
	}
}
