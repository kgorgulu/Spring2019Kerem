package Assessment4;

import java.util.*;

public class Repl2 {
	
	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         ArrayList <String> one = new ArrayList<String>(Arrays.asList("a","b","c"));
         ArrayList <String> two = new ArrayList<String>(Arrays.asList("d","e","f"));
         ArrayList <String> three = new ArrayList<String>(Arrays.asList("j","h","i"));
         
         ArrayList<ArrayList<String>> letters = new ArrayList<ArrayList<String>>();
         letters.add(one);
         letters.add(two);
         letters.add(three);
         
         if(printList(letters).equals("abcdefjhi"))
             System.out.println("Congrats you are done!");
         else 
             System.out.println("Try again");
         
     }
     
       public static String printList(ArrayList<ArrayList<String>> nestedList) 
       { //Add your code here
         
           String result ="";
           
//         String[] letters = {"a","b","c"};
//         
//         for (String each : letters)
           
           for (ArrayList<String> each: nestedList ) {
               for( String element : each ) {
                   result += element;
               }
               
           }
           
           
           
           
           
//         for(int i=0; i<nestedList.size();i++) {
//             for(int j=0; j < nestedList.get(i).size();j++) {
//                 result += nestedList.get(i).get(j);
//             }
//         }
           
           
           return result;
           
       }
}

