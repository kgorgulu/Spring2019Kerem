package aElementaryJavaCourse;

import java.util.Scanner;

public class LoanCalculation {
	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("Enter the annual interest rate:");
		double yearlyInterest= enter.nextDouble() ;
		
		System.out.println("Enter the number of years:");
		int numberOfYears = enter.nextInt();
		
		System.out.println("Enter the loan amount:");
		long loan = enter.nextLong();
		
		double monthlyInt = yearlyInterest/1200;
		
		double monthlyPayment = (loan*monthlyInt)/(1-(1/Math.pow(1+monthlyInt,numberOfYears*12)));
		
		double totalLoan= monthlyPayment*12*numberOfYears;
		
		
		System.out.println("Monthly payment: " + (int)monthlyPayment*100/100.0);
		
		System.out.println("Total Loan: "+(int)totalLoan*100/100.00);

	}
}
