package day19_dowhileLoops;

import java.util.Scanner;


public class WarmUp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String theSentence = "";
		
		while (!theSentence.contains("java") ) { 
		System.out.println("Enter the sentence");
		theSentence = scan.nextLine();
		
			}
	System.out.println("END");
	}
}
