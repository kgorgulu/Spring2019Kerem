package day29Methods;


public class B10MethodIntro2 {
	public static void main(String[] args) {
		
		askHowRu();
		reply();
		sayBye();
		sayHelloTo("Kerem");
		
		String nameOfF = " Hatice";
		
		sayHelloTo(nameOfF);
	}
		public static void askHowRu() {
			System.out.println("how are you doing?");
			
		}
		public static void reply() {
			
			System.out.println("I am doing well, how about you?");
		}
		
		public static void sayBye() {
			System.out.println("Good Bye");
		}
		public static void sayHelloTo(String name) {
			
			System.out.println("Hello " + name);
		}
}
