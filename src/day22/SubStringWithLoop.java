package day22;

public class SubStringWithLoop {
	public static void main(String[] args) {
		
		//TASK 2	  0123456789
		String str = "ABCDEFGHIJ";
		// print 2 letter at a time compared to one from previous tasks
		// ABCDEFGH --> AB CD EF GH
		
		for (int i = 0; i< str.length(); i+=2) {
			
			if (i!=str.length()-1) 
				System.out.println(str.substring(i,i+2) + " ");
			else 
				System.out.println(str.substring(i));
				
			}
			System.out.println();
			
			for (int i = 0; i< str.length(); i+=3) {
				
				if (i!=str.length()-2) 
					System.out.println(str.substring(i,i+3) + " ");
				else 
					System.out.println(str.substring(i));
			
			}
		//System.out.println(str.substring(0,2) + " ");
		//System.out.println(str.substring(2,4) + " ");
		//System.out.println(str.substring(4,6) + " ");
		//System.out.println(str.substring(6,8) + " ");
		//System.out.println(str.substring(8,10) + " ");
	}
}

