package Assessment4;

import java.util.*;
public class ArrayPracticeRemoveString {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] arr = {"no", "yes", "no", "yes","no", "yes","no", "yes","no", "yes","no", "yes"};
        String[] arr2= {"no", "no", "no","no","no","no","no","no","no"};
            
 /*
  *    System.out.println(Arrays.toString(arr));    
        
    for (int i = 0; i < arr.length; i++) {
    	
    	if(arr[i].equals("no")) {
    		arr[i]="yes";
    	}
    	
    }
    System.out.println(Arrays.toString(arr));
		
  */
      //convert to String Array list called yesNo 
        ArrayList<String>yesNo= new ArrayList<String>(Arrays.asList(arr2));
        System.out.println(yesNo);
        
	}   
        //write a method that takes ArrayList, removes all "no"'s and returns same Arraylist
	
        public static ArrayList<String> removeNo (ArrayList<String> list) {
        	for (int i = 0; i <list.size() ; i++) {
				if(list.get(i).equals("no")) {
					list.remove(i);
				//i--;
        	}
        	
        } 	
        	return list;
        	
}  	
        
        
     //  System.out.println(removeNo(yesNo));
    
	
    
    
    //add your removeNo method here
	}






