package replit;
import java.util.Scanner;
public class Repl43Ex {
	public static void main(String[] args) {
		
		    String action, weather;
		    System.out.println("how is the weather: ");
		    Scanner scan=new Scanner(System.in);
		    weather=scan.next();
		    
		    action= weather.equalsIgnoreCase("sunny")? "go out" :
		        weather.equalsIgnoreCase("rainy") ?"take your rain coat"   : 
		        weather.equalsIgnoreCase("snowy") ?"wear snow pants" :
		        weather.equalsIgnoreCase("windy") ?"wear your hat" :"stay home";        
		System.out.println(action);
		  

	}
}
