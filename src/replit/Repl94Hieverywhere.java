package replit;
import java.util.Scanner;

public class Repl94Hieverywhere {
	public static void main(String[] args) {
		
	


		   Scanner scan = new Scanner(System.in);

			    String str = scan.nextLine();	//abc hi how hi

			    String regex = "hi";

			    int i = 0;

			    int count = 0;

			    do {

					if (str.contains(regex)) {

						count++;

						str = str.replaceFirst(regex, "");

					}

					else {

						break;

					}

				} while (!(i == str.length() - 1));

					System.out.println(count);

	}
}
