package Assessment3;
import java.util.*;
public class ReverseAnArray {
	

			/*
		 * Write the definition of a method reverse, whose parameter is an array of Strings. 
		 * The method reverses the elements of the array. The method returns an array of strings in the reversed order.
		 * Example:

input: ["apple", "pear"]

output: ["pear", "apple"]
		 */
		 /**
		   * Reverses the order of the elements in the specified array
			 * @param arr
			 * @return array of strings
			 */
		public static String [] reverse(String[] arr) {
			
		    for (int i = 0; i < arr.length / 2; i++) {
					  String temp = arr[i];
					  arr[i] = arr[arr.length - 1 - i];
					  arr[arr.length - 1 - i] = temp;
					}
				  		
				return arr;			}
	}
