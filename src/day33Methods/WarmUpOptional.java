package day33Methods;

public class WarmUpOptional {
	public static void main(String[] args) {
		
		/* create a method that take one String parameter as sentence 

		 * return first character for 
	
		 * first word and all characters of last word except first char

		 * example : Love Java --> Lava 			
		 * Hold the door --? Hdoor
		 */
		String sentence = "Hold the Door"; //"Love java";
		
		String firstChar = sentence.substring(0,1);
		String [] allWords = sentence.split("");
		String lastWord = allWords[allWords.length-1];
		
		String targetWord = firstChar + lastWord.substring(1);
		
		System.out.println(targetWord);
	}
	
		public static String getMyString(String sentence) {
			
			return null;
			
		}
			
		}
	

