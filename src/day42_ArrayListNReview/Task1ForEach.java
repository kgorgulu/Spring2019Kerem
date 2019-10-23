package day42_ArrayListNReview;

import java.util.*;


public class Task1ForEach {
	public static void main(String[] args) {
		
		ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15)  ) ; 
	    
	    
	    int i = 10 ; 
	    int j = i ;
	    j = 100 ; 
	    
	    System.out.println(i);
	    
	    for (Integer each : list4) {
	      each = 100 ; 
	      //System.out.println("Item : " + each);
	    }
	    
	    for (int x = 0; x < list4.size(); x++) {
	    	// copying value of item
	      
	      Integer each = list4.get(x); 
	      // chaning the value of copy not original
	      each = 100 ; 
	    //  System.out.println("Item : " + each);
	      
	    }
	    
	    
	    
	    
	    
//    for (int x = 0; x <list4.size(); x++) {
	//  
//      System.out.println();
	//
//	    }
	    
	}
}
