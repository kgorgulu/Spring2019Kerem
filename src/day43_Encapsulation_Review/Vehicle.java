package day43_Encapsulation_Review;

public class Vehicle {
	
/*
 * Create a class called Vehicle 
with few private fields model , make , speed 
create getters and setters for all those private fields 

create methods : 
	increaseSpeed : it accepts one parameter increaseBy as int 
	and increase the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->11->12->13->14->15->

	decreaseSpeed  : 
	it accepts one parameter decreaseBy as int 
	and decrease the speed to new speed. 
	if your current speed is 10 and you pass 5 to this method , outcome should be  ---> 10->9->8->7->6->5->
 */
	 // <this> keyword can be used to address 
	  // the current object|instance being worked on 

	  
	  private String make;
	  private int speed;
	  private String model;

	  public void increaseSpeed(int increaseBy) {

	    // speed = speed + increaseBy;
	    for (int i = 1; i <= increaseBy; i++) {

	      speed++ ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }
	  
	  public void decreaseSpeed(int decreaseBy) {
	    
	    for (int i = 1; i <= decreaseBy; i++) {

	      speed-- ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	
	 
	    
//	    speed = 0 ;      // direct way
	    this.speed = 0 ; // using this keyword
//	    setSpeed(0);
//	    this.setSpeed(0);
			
		}
	}

