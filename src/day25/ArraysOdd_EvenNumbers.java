package day25;
import java.util.Arrays;
public class ArraysOdd_EvenNumbers {
	public static void main(String[] args) {
		System.out.println("-----------------------------------1 to 100 numbers");

		int arr[] = new int[50];

		for ( int i = 0; i<50; i++) {

			arr [i]=i+1;

		}

		System.out.println(Arrays.toString(arr));

		

System.out.println("-----------------------------------1 to 100 even numbers");	



		for (int i = 0; i < 50; i++) {

			arr[i] = (i + 1) * 2;

		}

		System.out.println(Arrays.toString(arr));

		

System.out.println("-----------------------------------1 to 100 even numbers");	



		for (int i = 0; i < 50; i++) {

			arr[i] = i*2 + 1;

		}

		System.out.println(Arrays.toString(arr));

	}

}


