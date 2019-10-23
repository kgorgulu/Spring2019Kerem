package day36ArrayLists;

import java.util.ArrayList;

public class ArrayListWithType {
	public static void main(String[] args) {
		
		//NO PRIMITIVE TYPE AS ALLOWED AS TYPE
		// ArrayList<int> numList;
		
		// array list can store only integer
		ArrayList<Integer> numList = new ArrayList<>();  // it will store only Whole Numbers
		
		//numList.add("ABC");
		
		Integer i  = 100; 	// auto boxing to Integer Object
		numList.add(i);
		
		numList.add(200);
		
		numList.add(300);
		numList.add(i+ 300);
		
		//GETTING SINGLE ITEM FROM ARRAYLIST
		// We call get(index) of ArrayList
		
		Integer i1= numList.get(0);
		
		int i2 = numList.get(1); // auto unboxing happen here
		
		System.out.println(i1);		
		System.out.println(i2);
		System.out.println(numList.get(2));
		
		// we can directly print 
	}
}
