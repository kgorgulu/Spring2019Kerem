package interview;

import java.util.Scanner;

public class FibonacciCalculator {
	//public static void main(String[] args) {
		
		/*
		 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. We prepare for cross questions like using iteration over recursion and how to optimize the solution using caching and memoization.
		
		
		*/
	public static void main(String[] args) 
    {
        int maxNumber=10;
        int previousNumber= 0;
        int nextNumber= 0;
        int sum=1;
        
        
      //  Scanner s = new Scanner(System.in);
      //  System.out.print("Enter value of n:");
    //    n = s.nextInt();
        System.out.print("Fibonacci Series for the first: " +maxNumber + " numbers are ");
        for(int i = 1; i <= maxNumber; i++)
        {
            
        	
        	previousNumber = nextNumber;
            nextNumber = sum;
            sum = previousNumber + nextNumber;
            System.out.print(previousNumber+" ");
        }
    }
}
