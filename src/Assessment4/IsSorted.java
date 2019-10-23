package Assessment4;
import java.util.*;

public class IsSorted {


	  public static boolean isSort(int[] nums) {
	  {
	    
	   
	  
		// Our strategy will be to compare every element to its successor.
		// The array is considered unsorted
		// if a successor has a greater value than its predecessor.
		// If we reach the end of the loop without finding that the array is unsorted,
		// then it must be sorted instead.

		// Note that we are always comparing an element to its successor.
		// Because of this, we can end the loop after comparing 
		// the second-last element to the last one.
		// This means the loop iterator will end as an index of the second-last
		// element of the array instead of the last one.
		    for (int i = 0; i < nums.length - 1; i++) {
		        if (nums[i] > nums[i + 1]) {
		            return false; 
		            // It is proven that the array is not sorted.
		        
		    }

		    return true; 
		    // If this part has been reached, the array must be sorted.
		
	    }
	  }
	return false;
	  }
}


	