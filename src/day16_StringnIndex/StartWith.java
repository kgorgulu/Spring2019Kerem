package day16_StringnIndex;

public class StartWith {
	public static void main(String[] args) {

		//str.indexOf("bc")==0   ====>>> str.startWith("bc") 
		
		String str = "Busra";
		
		System.out.println(  str.startsWith("B")     );
		System.out.println(  str.startsWith("ABC")     );
		
		boolean b = str.startsWith("Bu"); 
		
		if(b) {
			System.out.println("Successful");
		}else {
			System.out.println("NOT A Bu");
}
	}
}
