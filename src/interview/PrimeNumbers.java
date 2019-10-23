package interview;
import java.util.Scanner;

public class PrimeNumbers {
	

	
		 public static void main(String args[]){  
			 
			 
		  int i;
		  int m=0;
		  int number=0;    
		  
		  int n=56;//it is the number to be checked 
		  
		  m=n/2;    
		  
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		 
		  }else{
			  
		   for(i=2;i<=m;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not prime number");    
		     number=1;    
		     break;    
		    }    
		   }    
		   if(number==0)  { System.out.println(n+" is prime number"); }
		  }//end of else
		}  
		} 


	

