package day37WrapperClass;

import java.util.ArrayList;

public class ArrayListPractice3 {
	public static void main(String[] args) {
		/*
		 * // CREATE ARRAYLIST OF DOUBLE 
	    // CALL IT priceList 
	    // Add 5 prices  
	    // try to get 3rd items 
	    // iterate over arraylist using both loops 
	    // and print out 
	    
	    // in another loop 
	    // only print out price more than 10 ; 

		ArrayList<Double> priceList = new ArrayList<>();
        
        priceList.add(4.32);
        priceList.add(4.85);
        priceList.add(6.12);
        priceList.add(10.89);
        priceList.add(3.33);
        
        System.out.println(priceList.get(2));
        
        for (int i = 0; i < priceList.size(); i++) {
            System.out.println(priceList.get(i));
        }
        for(Double wow:priceList) {
            System.out.println(wow);
        }
        for (int i = 0; i < priceList.size(); i++) {
            if(priceList.get(i)>10) {
                System.out.println(priceList.get(i));
            }
        }
		 * 
		 */
		
		

     // CREATE ARRAYLIST OF DOUBLE
        // CALL IT priceList
        // Add 5 prices
        // try to get 3rd items
        // iterate over arraylist using both loops
        // and print out
        ArrayList<Double> priceList = new ArrayList<>();
        priceList.add(1.2);
        priceList.add(10.12);
        priceList.add(1.4);
        priceList.add(1.5);
        priceList.add(1.6);

        System.out.println(priceList.get(2));

        System.out.println("PRINT USING FOR LOOP ");
        
        for (int i = 0; i < priceList.size(); i++) {
          System.out.println(priceList.get(i));
        }

        System.out.println("PRINT USING FOR EACH LOOP ");
        for( Double eachDouble : priceList) {
          System.out.println(eachDouble);
        }
        // in another loop
        // only print out price more than 10 ;
        System.out.println("PRINT ONLY PRICE MORE THAN 10 ");
        for( Double eachDouble : priceList) {
          
          if(eachDouble > 10) {
            System.out.println(eachDouble);
          }
          
        }
        
        // in another loop
        // GET THE SUM OF ALL PRICES ;
        
        System.out.println("PRINT SUM ");
        // arithmatic operation only happens for primitives 
        // if you try to add wrapper objects it will be unboxed 
        double sum = 0 ; 
        for (double each : priceList) {
          sum += each ; 
        }
        System.out.println(   sum);
            
        
	}
}
