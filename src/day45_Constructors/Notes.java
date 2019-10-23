package day45_Constructors;

public class Notes {
	public static void main(String[] args) {
		/*
		 * // calling a Constructor 
/*
 * Where :   when object is being created 
 * 		a constructor can only be called inside another constructor of same class
 * 		RULE : 
 * 			this(arg...)    use this keyword with () and pass arguments if needed
 * 			1, it has to be in first statement of constructor body 
 * 			2, ONLY ONE Call(of any consrtuctor) is allowed inside one constructor 
 * 			3 , recursive constructor call is not allowed --- COMPILER ERROR
 	
				 public Caller() {
					
						this(100); 
						System.out.println("calling no arg");
						
					}
					
				public Caller(int x ) {
						
						this(); 
						System.out.println("calling 1 arg");
						
				}
				
		METHOD  VS CONSTRUCTOR 
			
 		METHOD -- has return type can have any name and can take certain action 
 					and can be called upon request 
 		Constructor  -- has NO return type has same name as class name 
 				will be called each time an object is being created 
 				only a constructor can call another constructor of same class
using this(args...)

HELLO!



Encapsulation: is processes of hiding data.

What do we use? we use getter and setter to manipulate with instance variables.

We make our instance variables private. so they are not accessible from outside.



we have different access modifiers: public > protected > default (there is no keyword) > private



public - visible everywhere.

protected - visible in the same package, if inherited - visible everywhere.

default - visible only within a same package.

private - visible only within a same class



private - most strict. 

public - less strict.



we can apply these access modifiers on methods and variables. 

in order to encapsulate data, we need to make it private.

class Student{

	private String name;

	protected int age;  



	//this method has a return type int.

	//so it will return int.

	//method parameters data type is no supposed to match return type.

	private int calculateAge(String dob){

		//some code

		int age = ////;

		return age;

	}

	//WHAT IS THIS???????

	//this refers to the current object

	//we use this keyword when we are calling instance variables.

	public void setAge(int age){

		this.age = age;

	}



}

access modifier doesn't affect on the return type.



Constructors: what do we know???



Is it a method?

Is it a bird? (don't take it serious.)



Constructor is a special kind of method. 

What is does?

Constructor helps to create an object.

Constructor gets called automatically, when we create an object.



How many default constructors do we have?



only one.



We can create more....



Default one doesn't have  any parameters.

ClassName(){



	}

We can create multiple constructors.



Constructor syntax: not return type, no void, no other class names.

Class name must match current class name.

We cannot have 2 or more constructors with same parameters.

	

ClassName(){		ClassName(){ 



	}				}



Illegal ! same parameters, will cot compile. 





ClassName(){		ClassName(String name){ 

						this.name=name;

	}				}

	

Legal! Different parameters!





										    //ClassName means some kind of custom class

public ClassName doSomething(String name){ // IT'S NOT A CONSTRUCTOR, NOT EVEN CLOSE. 

	ClassName object = new ClassName();

	return object;						  // return type is set to ClassName,

										 // so we need to return an object of this class.
										  
	*We can set values with a constructor.
But, we cannot retrieve them.
That mean - we cannot read their values.
We need getters to get values.
Or at least toString() method that will print all info about object.

@Override this is an annotation that identifies that method was overridden.

Override means change method implementation. 
Since all classes in Java inherit from Object class, we can override (change implementation, or change body, or change behavior of the method.)

toString() method exists inside a Object class.

WHY WE NEED toString() method? in order to convert object info into string that is readable by humans.

Constructor chaining. 

What is this??? It's when we call one constructor inside another one.

How it's possible? we use this keyword.

//BREAK TILL 9:18

Methods cannot cal constructors!

this() should be referred to the no args constructor inside other constructor.
constructor can be called only on the first line
we cannot call multiple constructors inside one constructor.
Recursion is illegal!

		*/
	}
}
