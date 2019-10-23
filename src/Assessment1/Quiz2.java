package Assessment1;

import java.util.*;

public class Quiz2 {
	public static void main(String[] args) {
					  
		    Scanner s = new Scanner(System.in);
		    		    
		    
		    int num1 = s.nextInt();
		    int num2 = s.nextInt();
		    int num3 = s.nextInt();
		    if (num1 > num2 && num1 > num3) {
		    	
                System.out.println("num1 is bigger");
            }
            else if (num2 > num1 && num2 > num3) {
                System.out.println("num2 is bigger");
            }
            else if (num3 > num2 && num3 > num1) {
                System.out.println("num3 is bigger");
            }

	}
}
