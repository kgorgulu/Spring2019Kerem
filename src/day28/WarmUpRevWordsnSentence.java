package day28;

public class WarmUpRevWordsnSentence {
	
	public static void main(String[] args) {
		
		String str = "Sunday Perfect Day to start coding";
		
		// Reverse above sentence to generate below
		// coding start to Day Perfect Sunday
		// optional : reverse word + reverse each char of the words
	
		String[] str1 = str.split(" ");

		 char[] sentenceChars = str.toCharArray(); 

		 String school = " ";

			    



		 for(int x =0 ; x<str1.length; x++) {

			    

			    for (int y = str1[x].length()-1; y >=0; y--) {

			    	school =school + str1[x].charAt(y);

}

			   school += " ";

		 }  

		 System.out.print(school);	    

	}
}
