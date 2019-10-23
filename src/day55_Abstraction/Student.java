package day55_Abstraction;

public abstract class Student {
	
	// abstract class are not meant to be instantiated
	// abstract class are meant to be a super class
	// to provide a general idea, without providing implementation
	// using abstract method
	// you can have everything else a normal class can have!
	
	int id;
	String nameString;
	
	public abstract void attendClass() ;
	
		
	
	//public void attendClass() {
	//	System.out.println("IMPLEMENT IN SUB CLASSES");
		
	//}
		
	}

