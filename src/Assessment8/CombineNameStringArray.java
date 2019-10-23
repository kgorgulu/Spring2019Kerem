package Assessment8;

public class CombineNameStringArray {
		
				    public static String[] combineNames(String[] first_names, String[] last_names)
		    {
		      int a=first_names.length;
		        String[] newarr=new String[a];
		        for(int i=0;i<newarr.length;i++)
		        {
		          newarr[i]=first_names[i]+" "+last_names[i];
		        }
		        return newarr;
		    }
		    
		    public static void main(String[] args)
		    {
		        //feel free to test code here
//		      first_names = {"bob","joe"};
		// last_names = {"jones","smith"};
		    }
		}

	
