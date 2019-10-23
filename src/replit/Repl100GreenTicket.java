package replit;
import java.util.Scanner;
public class Repl100GreenTicket {
	public static void main(String[] args) {
		
		

		   Scanner scan = new Scanner(System.in);

			    int prize = 0;

			    int a = scan.nextInt();

			    int b = scan.nextInt();

			    int c = scan.nextInt();

			    int d = scan.nextInt();

			    int maxCount = 0;

			    int[] arr = {a,b,c,d};

			    

			    for (int i = 0; i < arr.length; i++) {

				    int count = 0;



					for (int j = i; j < arr.length; j++) {

						if (arr[i] == arr[j]) {

							count++;

						}

					}

					if (count > maxCount) {

						maxCount = count;

					}

				}

			    switch (maxCount) {

				case 4:prize = 30;break;

				case 3:prize = 20;break;



				case 2:prize = 10;break;



				case 1:prize = 0;break;



				default:System.out.println("Invalid Data!!");

					break;

				}

			    System.out.println(prize);

			

	}
}
