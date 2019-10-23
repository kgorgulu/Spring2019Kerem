package day46_ConstructorCont;

public class Notes {
	public static void main(String[] args) {
		/*
		 * Static keyword and initializer block
initializer block is mostly need for OCA exam)
Review===>
===^_^===>>> Constructor is a 
--->>> a block of code that runs when object is made
--->>> it has same nams as class name
--->>> it has no return type
--->>> public Person(){}
--->>> public Person(String name){}
 
===^_^===>>> Default behavior of compiler;
--->>> if we don't have any contructor;
---->>> compiler will provide one
---->>> it is no-arg constructor with empty body
---->>> it is a default constructor
--->>> if we have any contructor;
---->>> compiler will not provide the default constructor
===^_^===>>> What is constructor mostly used for?
---> creating object with initial state
---> initialize all field value along with the creation
===^_^===>>> Some keywords; ---> to create an object
---> instantiating a class
---> create instance of a class
===^_^===>>> Constructor chaining
---> Where can we call a constructor?
it can only be called in another constructor of a same class
using this(args...)
---> Calling one constructor in another constructor
---> Rules in chaining
1- this(args...) has the be the first stamement in constructo body
2- can be called only once in one constructor
3- recursive call should be avoided or it will not compile
* you call me, I call you ==> recurse
* public Student(){
*this("spartan") bad call!!!
* sysout 
}
* public Student (String name){}
===^_^===>>> Purpose of using constructor chaining
---> Dry principle -- do not repeat yourself
---> code reusability and maintainability
		 * 
		 */
		

	}
}
