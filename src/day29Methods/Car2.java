package day29Methods;

public class Car2 {

	int modelYear;

	String modelName; // create Car2 class attributes

	

	// create a class constructor to initialize object attributes

	public Car2(int year, String name) {

		modelYear = year;

		modelName = name;

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Car2 myCar = new Car2(1999, "Mustang");

		System.out.println(myCar.modelYear + " " + myCar.modelName);

	}
}
