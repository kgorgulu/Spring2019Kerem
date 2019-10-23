package Assessment6;

import java.util.Arrays;

public class Switch_elements {
			
	public static main(String[] args)
	{
		int[][] a = {
			{1,1,1},
			{1,1,1},
			{1,1,1}
		};
		private static boolean magicSquare(int[][] a){
			   
			  //calculate the sum of the first row and assign it to n
			      int n = sumOfRow(a[0]);
			       
			      for (int[] row : a)
			      {
			         int sum = sumOfRow(row);        
			         if (sum != n)
			         return false;   
			      }
			      int sum = 0;
			       
			      //rows
			     for (int i = 0; i < a.length; i++){
			         sum = 0;
			         for (int j = 0; j < a.length; j++){
			             sum += a[i][j];
			         }
			         if(sum != n){
			            return false;
			         }
			     }
			      // columns
			      
			      for(int i =0; i < a.length; i++){
			          sum = 0;
			           
			          for(int j = 0; j< a.length; j++){
			              sum += a[j][i];
			          }
			          if(sum != n){
			              return false;
			          }
			      }
			      //diagonal from top left corner to bottom right corner
			      sum = 0;
			      for (int i = 0; i < a.length; i++)
			      {
			         sum += a[i][i];
			      }
			      if (sum != n)
			         return false;
			          
			      sum = 0;
			      // top right to bottom left diagonal
			      for (int i = 0; i < a.length; i++)
			      {
			         sum += a[i][a.length - 1 - i];
			      }
			      if (sum != n)
			         return false;
			      return true;
			       
			   } 
			   
			  //returns the sum of the elements in the row
			  int sumOfRow(int[] row){
			     int sum = 0;
			     for(int el : row){
			        sum += el;
			     }
			     return sum;
			  }
		System.out.println(isMagic(a)); //true
		int[][] b = {
			{1,1,2},
			{3,2,3},
			{1,4,1}
		};
		return true;
		System.out.println(isMagic(b)); //false
		int[][] c = {
			{1,1,1},
			{2,2,2}
		};
		return false;
		System.out.println(isMagic(c)); //false
		int[][] d = {
			{8,1,6},
			{3,5,7},
			{4,9,2}
		};
		return false;
		System.out.println(isMagic(d)); //true
	}
	public static boolean isMagic(int[][] array)
	{
		return true;
		
	}
}
