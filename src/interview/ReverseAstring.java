package interview;

public class ReverseAstring {
	
	public static void main(String [] args) {
		
		
/*
		String word = "Kerem Gorgulu";
		
		String reversed= new StringBuilder(word).reverse().toString();
		System.out.println(reversed);
	System.out.println();	
	}
		
	*/	

String str1 = "eracecare now";

String reversed= " ";

for (int i = str1.length()-1; i>=0; i--) {
	reversed+= str1.charAt(i);
	
}
	System.out.println(reversed);
	
}
	
}
