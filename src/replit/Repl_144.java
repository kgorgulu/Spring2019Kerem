package replit;
import java.util.Scanner;

public class Repl_144 {
	
	
	public static void plus_minus(int[] arr){
		
	
		  int countP=0; int countN=0; int countZ=0;
		   for(int i=0; i<arr.length; i++){
		     if(arr[i]<0)
		     countN++;
		     else if(arr[i]>0)
		     countP++;
		     else
		     countZ++;
		   }
		   System.out.println("positives:"+countP+", "+"negatives:"+countN+
		   ", "+"zeros:"+countZ);
		   
		 } 
		  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    int size = inp.nextInt();
		    int[] arr = new int[size];
		    for(int i=0 ;i<=size-1;i++)
		    {
		     arr[i]=inp.nextInt();
		    }
		  
		    plus_minus(arr);
		  }//end main
	  
}
	  
	

	

