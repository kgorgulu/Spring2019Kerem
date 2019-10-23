package day40CustomClassess_BluePrintForTheObject;

public class Computer {
		//TEMPLATE FOR COMPUTER(Object Class)
		// instance variables/fields
		// get default value if it's not specified
		// in template class 
		
		// default values can be changed
		// in template class by providing value
		// in template class itself while declaring the filed
		
		// changing default value from null to unknown
		String type ; 
		int ram ; 
		double screenSize ; 
		String color; 
		String OS; 
		boolean isPersonal ; 
		
		public static void main(String[] args) {
			
			Computer iMac = new Computer();
			System.out.println(iMac.type);
		
		// It's highly not recommended to have "main method directly "
	// inside your template class--> use different class to create object

	}
}
