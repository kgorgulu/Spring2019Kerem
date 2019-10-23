package day32_MethodWReturnType;

public class CharCount {
	
	public static void main(String[] args) {
		string();
	}
	public static int string() {

		
		String str= "Java love you";
		int charCount= str.length();
		System.out.println(charCount);
		System.out.println(str.substring(12,13));
		return charCount;
		
	}
}
