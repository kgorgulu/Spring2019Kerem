package day39ArrayListMethods;

public class RunnerClass {
	
	public static void main(String[] args) {
		 
	    // local variable  
	    //String s = "abc" ; 
	    
	    Person p1 = new Person(); 
	    p1.name = "Talmurat" ;
	    p1.age = 1 ;
	    p1.gender = 'M' ; 
	    
	    // Creating new Person Object
	    Person p2 = new Person(); 
	    // setting attributes value of object
	    p2.name = "Diana" ;
	    p2.age = 27 ;
	    p2.gender = 'F' ; 
	    
	    Horse spartan = new Horse();
	    
	    spartan.breed = "Mustang";
	    spartan.age = 10;
	    spartan.color = "Black";
	    spartan.height = 8;
	    
	    
	    System.out.println(spartan.breed);
	    
	    System.out.println(p1.name);
	    System.out.println(p2.name);
	}
}
