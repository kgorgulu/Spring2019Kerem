package Assessment4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStringinArrayList {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        String[] yesNo = {"no", "yes", "no", "yes","no", "yes","no", "yes","no", "yes","no", "yes"};
        
        String [] nums= {"1","2", "3", "4", "5","6","7", "8", "9", "10" };
        
       // ArrayList<String> arr = new ArrayList<String>(Arrays.asList(yesNo));
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(nums)); 
        removeEveryOther(arr);
        
        
    }
    
    public static void removeEveryOther(ArrayList<String> list){
    // add your code here   
        
        for (int i = 0; i < list.size(); i++) {
			list.remove(i-1);
			i--;
		}
       System.out.println(list);
        }
}
