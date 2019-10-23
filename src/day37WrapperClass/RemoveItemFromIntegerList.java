package day37WrapperClass;

import java.util.ArrayList;


public class RemoveItemFromIntegerList {
	public static void main(String[] args) {
		
		/*
	     * 
	     * */
	    
	    ArrayList<Integer> lst = new ArrayList<>(); 
	    ArrayList<Double> strings = new ArrayList<>();
	    
		strings.add(3.87);
	    
	    lst.add(1); 
	    lst.add(2); 
	    lst.add(3); 
	    lst.add(4); 
	    
	    lst.remove(2); 
	    //lst.remove( new Integer(2));
	    //lst.remove( Integer.valueOf(2));
	    
	    System.out.println(lst);
	   System.out.println(lst.get(2));
	   System.out.println(lst.size());
	   System.out.println(lst.toString());
	   System.out.println(strings);
	  }


	}

