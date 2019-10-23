package day41_CustomClassEncapsulation;

public class Coffee {
	
	String name;
	String size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		
		String info = name.toUpperCase() + " " + size.toUpperCase()+ "  $" + price+ " "+ calories+" CAL";
		
				
		System.out.println(info);

	}
	public void setName(String newName) {
		name=newName;
		
	}
	public void setSize(String newSize) {
		size=newSize;
		
	}
	public void setPrice(double newPrice) {
		price=newPrice;
		
	}
	public void setCal(int newCalories) {
		calories=newCalories;
		
	}
}
