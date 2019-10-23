package day26;

import java.util.Arrays;

public class SplittingTheStrings {
	public static void main(String[] args) {
		
		
		//String str = "Java is fun, java is challenging";
		String email = "kerem@yahoo.com@";
		String[] words= email.split("@");
		 
		int count = 0;
		  
		for (int i = 0; i < email.length(); i++) {
		    if (email.charAt(i) == '@') {
		    	count++;
		    }
		}
		     if (count !=1) {
					System.out.println("invalid email");
				}else {
					
		System.out.println("Email id: " + words[0]);
		System.out.println("Email domain: "+ words[1]);
		
		}
		/*String[] parts= str.split("a");
		
		System.out.println(Arrays.toString(parts));
		
		String[] parts2= str.split("is");
		
		System.out.println(Arrays.toString(parts2));
		*/
		    }
		    
		}
		
	
		    		
		    		
		    		
		    		
