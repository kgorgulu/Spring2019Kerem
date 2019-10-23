package day29Methods;


public class Cooking {
	public static void main(String[] args) {
		
		
		cookingNow("Steak");
		youWillNeed("Meat, oil, salt, pepper");
		cookFor(30, "bbq");
		ready();
		
			
	}
	

		public static void cookingNow(String foodName) {
		 
			System.out.println("Today we are cooking " + foodName+ ".");
		 
	 }
		public static void youWillNeed(String items) {
		 
			System.out.println("We need following items:  " + items + ".");
	 }
	 
		public static void cookFor(int minutes, String wayOfCooking) {
		 
			System.out.println("You need to cook for " + minutes+ " minutes by "  + wayOfCooking + ".");
		 
	 }
	 	public static void ready() {
	 		System.out.println("Meal is ready! Enjoy!");
		}
}
