package Assessments2;

class MainAppears_twice {
	public static void main(String[] args) {
		/*
		 * Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.

Examples:

Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.

Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.
		 */

			  /**
		 * @param target - string that you need to check.
		 * @param sentence - string where you need to lookup for the target string.
		 * @return 
		 */
		public static boolean appearsTwice(String target, String sentence) {


			
			int count = 0;
	    for(int i=0; i<=sentence.length()-target.length();i++)
	    {
	      if(sentence.substring(i,i+target.length()).equalsIgnoreCase(target)){
	        //i+=target.length()-1;
	        count++;
		
	}
}
}
	}
	
				