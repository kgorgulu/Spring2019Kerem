package day24_Array;

import java.util.Arrays;

public class ArrayReverseSentence {
	public static void main(String[] args) {
		
		
			// Please reverse the given string

			String str = "As 300 spartans, we shall find the perfect job";

			String[] arr = str.split(" ");
			System.out.println(Arrays.toString(arr));
			
			String reversed= "";
			for (int i = arr.length - 1 ; i >= 0 ; i--) {

                reversed += arr[i]+",";
			}
				System.out.print(reversed);

				

	}
}
