package replit;
import java.util.Scanner;
public class Repl109ArraySubstring {
	public static void main(String[] args) {
		
		
		
				Scanner input = new Scanner(System.in);
				String[] arr = new String[5];
				for (int i=0;i<5;i++)
				{
					arr[i] = input.nextLine();
				}
				//leave above alone!  write your code below
				
					for (int i = 0; i < arr.length; i++) {

					System.out.println(arr[i].substring(0, 3));
			}
			
	}
}



