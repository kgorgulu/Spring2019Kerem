package Assessment10;
import java.util.Scanner;
public class Quiz {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	      System.out.print("In:");
	       double max = inp.nextInt();
	       if (isPrime(max)) {
	           System.out.println("prime");
	       } else {
	           System.out.println("not prime");
	       }
	   }

	private static boolean isPrime(double max) {
		// TODO Auto-generated method stub
		return false;
	}
	   }
	   