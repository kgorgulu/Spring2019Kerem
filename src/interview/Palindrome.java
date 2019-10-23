package interview;

public class Palindrome {
	public static void main(String[] args) {
		
		String str1 = "racecar";
		
			String reversed= "";
			
			for (int i = str1.length()-1; i>=0; i--) {
				reversed+= str1.charAt(i);
				
			}
				System.out.println(str1.equals(reversed));
	}
}
