package replit;
import java.util.*;
public class Repl_126_Shortest_Array {
	public static void main(String[] args) {
		
		
	 //   Scanner scan = new Scanner(System.in);
		    String[] str = {"java", "cable","red","vivid","remedy","grace"};
		                    
		    int min = str[0].length();
			int index=0;
			for (int i = 0; i < str.length; i++) {
				if (str[i].length() < min) {
					min = str[i].length();
					index=i;
				}
							}
			System.out.println(str[index]);
		  }
}
