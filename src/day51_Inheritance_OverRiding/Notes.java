package day51_Inheritance_OverRiding;

public class Notes {
	public static void main(String[] args) {
		
		/*
		 * // What we can have inside one Class 
	Also see -- Tuesday notes 


// Inheritance 
	
	a class can use fields and methods from another class 
	by extending it, instead of creating everything from scracth 

	IS-A Relationship 
		Student IS-A Person 
		LocalStudent IS-A Student 
		Car - Vehicle 

	What keyword to build relationship 
			public class Student extends Person{

			}

	How many class a class can extends directly 
		a class can only extend one another class directlt 
		BAD : 
		public class Student extends Person, Human, Robot{} 


	Child--> Parent--> GrandParent--> Object (class)
	
	Child c1 = new Child() ; 
	c1.everyVisibleFieldsAndMethod.....


	What's inherited from super class 
		All visible fields / methods from super class 
		Constructor IS NOT INHERITED 	

	Visibility : 
		private : ----> in same class 
		default : ----> same package 
		protected: ---> same package+sub classes outside package
		public : -----> everywhere 


	Constructor : 
		how can we call other constructors of same class
			this(arg...) 
				 it has to be first statement 
				 it can only be called once 
				 recursive calls should be avoided 
				 	-- you call me , i call you --compiler error

		how can we call super class constructor 
			super(arg...)
				 it has to be first statement 
				 it can only be called once
				 if no constructor call is made already 
				 	super() will be inserted in first line 
				 super() and this() can not show up together 
				 	in same constructor 
				 CAN NOT CALL A CONSTUCTOR that we dont have 


	super(args..)




 go to canvas ->  Quize - > asseessment test#1  
 	you have 45 minutes to finish 1 quize and 4 repls 

 	due:    11:45 am


 	class starts: at 12 pm



Inheritance 

	what's inherited from super class ? 
		All visible fields and methods 
		including static fileds and instance fields 


	
	Constructors are not inherited 
		but can be accessible using super(arg..)


	this(args)  
		this is used to call current class's other constructor

	super(args)
		this is used to call super class's other constructor



	Method overriding : 
		we can override the inherited instance methods from super class in sub class to define sub class version of the method . 

		 it has to have same method name 
		 it has to have same parameter list 
		 it has to have same return type --at this moment 

		 it has to have same or more visibility 


	we have been already overriding the toString() method 
	from Object class to avoid getting hashcode 

	public String toString(){
		return "your own message"; 
	}


	Create Animal class 

		with single method called 
		makeNoise accept no parameter return nothing 
		it print out general noise

	Create 2 sub classes 
		Horse 
			override makeNoise method 
			print --> Horse --- Nai Nai Nai

		Dog 
			override makeNoise method 
			print --> Dog --- Woof Woof Woof
	Create a class with main called AnimalTalentShow 

	Create 3 objects of Animal , Dog , Horse 
		 let them make noise
		 */

	}
}
