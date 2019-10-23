package day12;

import java.util.Scanner;

import day10.Ifelsebankapp;


public class TernaryOp1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String weather, action;
		System.out.println("How is weather today?");
		
		weather = scan.next();
		
		//if (weather.equals("sunny||NICE||warm"))
		if (weather.equalsIgnoreCase("sunny"))
			action = "go out";
		else 
			action = "stay home";
			
		
		// action=(weather.equals("sunny"))? ("go out") : ("stay home") ;
		
		System.out.println("Take an action accrording to the weather is : " +action);
	}
}
