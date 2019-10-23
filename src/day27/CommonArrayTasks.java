package day27;
import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.Mac;
public class CommonArrayTasks {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers");

		int[] numbers = { input.nextInt(), input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt() };

		System.out.println(Arrays.toString(numbers));
		
		int sum = 0;
		for (int each : numbers) {

			sum += each;
		}
		System.out.println("Sum is : "+sum);
		
		int max = numbers[0];
		
		for (int eachNum : numbers) {

			if (eachNum>max) {
				max= eachNum;
				
			}
		}
		System.out.println("Max is : "+max);
		
		
		int min = numbers[0];
		
		for (int eachNum : numbers) {

			if (eachNum<min) {
				min= eachNum;
				
			}
		}
		System.out.println("Min is : "+min);

	}
}
