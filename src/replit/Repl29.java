package replit;
import java.util.Scanner;


public class Repl29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers a and b");
	    int a = s.nextInt();
	    int b = s.nextInt();
	    
	   
	    if (a>b)
	      System.out.println(a +" is bigger");
	      else if (a<b){
	        System.out.println(b + " is bigger");

	}
}
}
