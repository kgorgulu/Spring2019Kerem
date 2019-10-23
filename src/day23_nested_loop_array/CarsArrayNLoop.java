package day23_nested_loop_array;

public class CarsArrayNLoop {
	public static void main(String[] args) {
		
		
		String [] cars= new String[] {"Audi" , "Porsche", "BMW", "Honda", "Tesla", "Kia", "Acura", "Fiat"} ;
		
			
		System.out.println(cars.length);
		
	//	int i = 0;
	//	System.out.println(cars[i]);
		//i++;
		//System.out.println(cars[i]);
		
		// print all values using a for loop
		
		for (int j = 0; j < cars.length; j++) {  // when you want to print out all the car names from the list
			
			System.out.println(cars[j]);
			
		}
		System.out.println("------------FOR EACH LOOP----------");
		//print all values using a for EACH Loop
		
		for (String car: cars) {
			System.out.print(car+" - ");
		}
		
	}
}
