package day24_Array;


public class ArrayCreationPr {
	public static void main(String[] args) {
		
		//decelare an array can store 5 items
		
		//int [] numbers = new int[5];
		
		// another way to create an array is int [] numbers = new int[]{23,34,45,56,67};
		 int [] numbers = {23,34,45,56,67};
		/*
		 * numbers[0]=23;
		 
		numbers[1]=34;
		numbers[2]=45;
		numbers[3]=56;
		numbers[4]=67;
		*/
			System.out.println(numbers[2]);
			
			numbers[2]=99;
			System.out.println(numbers[2]);
			
			char [] grades = new char [] {'A','B','C','D','E'};
			char [] grades2 = {'A','B','C','D','E'};
			
			// print first item
			
			char myGrade = grades[1];
			char myGrades = grades2[1];
						
			System.out.println(myGrade +" " + myGrades);
			
			 String [] cities = new String []{"Miami","New York", "Dallas"};
			 
			 String city= cities[1];
			 
			 System.out.println(city);
			 
			 
			/*
			 * String [] cities;
			 cities = new String [3];
			 */
			 
			 
			 
			 
	}
}
