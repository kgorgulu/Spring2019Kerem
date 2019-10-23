package day22;

import java.util.*;
public class FindaWordInSentence {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String a = s.nextLine();
		
		  
			String name= "alejandro";
			   if (a.indexOf("alejandro")!=-1){
				   
				   System.out.println("read this mail");
			   }else{
				   System.out.println("dont read");
			   }
			
			   if(a.equalsIgnoreCase("alejandro")) {
				     
				     if(a.contains("alejandro") && a.contains("project"))
				        
				        System.out.println("read this email");
				    }else{
				      System.out.println("don't read");
				    }
			

			
		}

	}

