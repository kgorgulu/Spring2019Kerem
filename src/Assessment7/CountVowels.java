package Assessment7;

public class CountVowels {
	
		
	
	public static void main(String[ ] args) {

		 String message = "words containig mooooost vowels";
		    String wordWithMostVowel = null;
		    int maxVowelCount = 0;
		    String tests[] = message.split(" ");
		    int totalVowel = 0;
		    for(String test : tests){
		        int vowelCount = 0;
		        test = test.toLowerCase();
		        for(int i=0;i<test.length();i++){
		            switch(test.charAt(i)){
		            case 'a':
		            case 'e':
		            case 'i':
		            case 'o':
		            case 'u':
		            vowelCount++;
		            }
		            if(vowelCount > maxVowelCount){
		                maxVowelCount = vowelCount;
		                wordWithMostVowel = test;
		            }
		        }
		        totalVowel = totalVowel+vowelCount;
		    }
		    System.out.println("total vowels "+totalVowel+" word with max vowel is "+wordWithMostVowel);
		}
	}


