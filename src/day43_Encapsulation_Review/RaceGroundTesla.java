package day43_Encapsulation_Review;

public class RaceGroundTesla {
	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle();
		
		//this.setmake();
		
	    car1.setMake ("Tesla");
	    car1.setModel ("Model X");
	    car1.setSpeed(100);
	    
	    //
	    
	    System.out.println(car1.getMake());
	    System.out.println(car1.getModel());
	    
	    car1.increaseSpeed(6);
	    

	    Vehicle car2 = new Vehicle();
	    car2.setMake ("BMW");
	    car2.setModel ("M6");
	    car2.setSpeed(10);
		
	    System.out.println(car2.getMake());
	    System.out.println(car2.getModel());
	}
}
