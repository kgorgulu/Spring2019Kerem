package day32_MethodWReturnType;

public class MethodWReturn {
	public static void main(String[] args) {
		System.out.println(giveMeYourName());
		String myName= giveMeYourName();
		
		System.out.println(myName);
		
		
	}
		
		public static String giveMeYourName() {
				
			String name="Muradil";
			
			return name;
		}
			
			
		
}
