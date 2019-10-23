package day41_CustomClassEncapsulation;

public class MyCoffees {
	public static void main(String[] args) {

		Coffee coffee1 = new Coffee();
		
		coffee1.name= "Iced caramel Macchiato";
		coffee1.size= " Grande";
		coffee1.calories = 250;
		coffee1.price= 4.75;
		
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("JAVA CHIP");
		coffee2.size= "Venti";
		coffee2.calories = 375;
		coffee2.price= 5.75;
		
		coffee2.getCoffeeInfo();
	}
}
