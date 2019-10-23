package day28;

import java.util.Arrays;


import day7.incrementdecrementreview;


public class TwoDArrayPractice {
	public static void main(String[] args) {
		
		String [][] teams = new String[2][6];
		
		teams[0][0]="Irina";
		teams[0][1]="Zarif";
		teams[0][2]="Cihan";
		teams[0][3]="Hatich";
		teams[0][4]="Adel";
		teams[0][5]="Bojan";
		teams[1][0]="Olimjon";
		teams[1][1]="Mirshod";
		teams[1][2]="Usman";
		teams[1][3]="Nursultan";
		teams[1][4]="Roman";
		teams[1][5]="Dimitri";
		
		System.out.println(teams[0][0]);
		System.out.println(teams[0][3]); //Habib
		System.out.println("Number of rows: "+teams.length);
		System.out.println("People of in first team: " + teams[0].length );
		System.out.println("People of in second team: " + teams[1].length );
		System.out.println(Arrays.deepToString(teams) );
		
		int[][] nums= new int[3][4]; // 3 Rows and 4 Columns
		
		for (int i = 0; i < teams.length; i++) {
			System.out.print(teams[i].length+"-");
			System.out.println(Arrays.toString(teams[i]));
		}
		
		for (String [] name : teams) {
			System.out.print(name.length+ "-");
			System.out.println(Arrays.toString(name));
			
			
		}
		for (String [] groups : teams) {
			
			for(String names : groups) {
				System.out.print(names+ ",");
				
			}
			
			System.out.println();
		}
	}
	

	}

