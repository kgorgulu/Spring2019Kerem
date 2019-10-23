package day43_Encapsulation_Review;


public class TeslaDealer {
	public static void main(String[] args) {
		
		Tesla tesla= new Tesla();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: " + tesla.getModel());
		System.out.println("Range: " + tesla.getRange());
		System.out.println("Zero to 60: " + tesla.getZeroTo60());
		System.out.println("Price: " + tesla.getPrice());
		System.out.println("Self Driving: " + tesla.isSelfDriving());
		
		System.out.println(tesla);
	}
	
}
