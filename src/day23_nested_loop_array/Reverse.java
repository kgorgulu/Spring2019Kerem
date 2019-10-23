package day23_nested_loop_array;

public class Reverse {
	public static void main(String[] args) {
		
		//			  012345	
		String str = "Goksel";
		String str1 = "As 300 spartans, we shall find the perfect job";
		
		for(int i=str.length()-1; i>=0 ; i--){
			
			System.out.print(i);
		}
			
		//	for(int i=str.length()-1; i>=0 ; i--){
				
			//	System.out.print(i);
			
			for(int j=str1.length()-1; j>=0 ; j--){
				
				System.out.print(str1.substring(j,j+1));
			
				
		}
}
}


