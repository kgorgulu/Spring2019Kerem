package replit;
import java.util.Scanner;
public class Repl95Shoppinglist {
	public static void main(String[] args) {
		
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
				
		
		String output = "";

		int itemNumber = 1;

		Scanner scan = new Scanner(System.in);


		do {

			System.out.println("Enter Item" + itemNumber + " and its price:");

			item = scan.next();



			price = scan.nextDouble();

			totalPrice += price;



			output += "Item" + itemNumber + ": " + item + " Price: " + price + ", ";

			itemNumber++;

			System.out.println("Add one more item?");

			item = scan.next();



		} while (!(item.equalsIgnoreCase("no")));

		output = output.substring(0, output.length() - 2);

		System.out.println(output);

		System.out.println("Total price: " + totalPrice);

			   
				
				

	}
}
