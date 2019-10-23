package day30MethodsCont;


public class WarmUp {
	/*

	  WARM UP 

	  1, Create a static method 

	  called  sayHello : 

	  this method return nothing 

	  and does not take any parameter



	  and it will greeting spartan 



	  2, Create a static method 

	  called  sayGoodBye : 

	  this method return nothing 

	  and does not take any parameter



	  and it will good bye spartan 



	  3, Create a static method 

	  called  sayHelloTo : 

	  this method return nothing 

	  and take 1 String name as parameter



	  and it will greeting --the Name You passed 

	   */
		
		public static void sayHello() {
			System.out.println("Greeting Spartans");
			
		}
		public static void sayGoodbye() {
			System.out.println("Bye bye Spartans");
			
		}
		
		public static void sayHelloTo(String name) {
			
			System.out.println("Gretting, "+name);
			
		}
		public static void main(String[] args) {
		
		sayHello();
		sayHello();
		
		
		// calling static method
				// ClassName.staticMethodName();
				// if the method is in same class -->staticMethod
		
		WarmUp.sayGoodbye();
		sayHelloTo("300 Spartans");
		sayHelloTo("Jon Snow");
	//	SayHelloTo("300 Spartans");
	//	sayGoodBy();
		
	}
	
		
		public void name() {
		
	}
}
