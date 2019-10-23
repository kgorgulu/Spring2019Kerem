package day27;

public class WarmUpArray {
	public static void main(String[] args) {
		
		/*
		 * Saturday WARM UP Tasks : 
		 *



			//Task1 : 

				create an array of int with 5 items , return true if all items are more than 10

				return false if not



			//Task 2 :

			given : 

			String str = "Cybertek Batch Spartan is most hardworking Batch ever";



			use the method your learned to get each words

			and store it into String array: 



			loop through each items -- 

			  in each iteration loop : 

			  	 turn each word into char array 

			  	 print each char out with separated by -

			output : 

				C-y-b-e-r-t-e-k-

				B-a-t-c-h-

				S-p-a-r-t-a-n-

				i-s-

				m-o-s-t-

				h-a-r-d-w-o-r-k-i-n-g-

				o-n-e-

				e-v-e-r-
				*/
				 int[] num ={25,28,23,12,53,67};
				 
		boolean result = true;
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i]<=10) {
				
				result = false;
				
			}
		}


	}
}
