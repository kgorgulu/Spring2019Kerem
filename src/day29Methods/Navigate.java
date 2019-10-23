package day29Methods;

public class Navigate {
	public static void main(String[] args) {
		navigateToEtsy();
		searcForWoodenSpoons();
		printResults("agile"); // if you want method write String parameter
		
	}
	public static void navigateToEtsy() {
	System.out.println("Launch Chrome Browser");
	System.out.println("Navigate to www.etsy.com");
	}
	public static void searcForWoodenSpoons() {
		System.out.println("Type 'Wooden Spoon' ");
		
	}
	public static void printResults(String topic) { // whenever you specify parameter as String, int etc. go to top method and type it inside
		System.out.println("Wooden Spoons 14,745 Results ");
		
	}
}
