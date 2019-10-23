package day27;
import java.util.Arrays;
public class ArraysCopyof2 {
	public static void main(String[] args) {
		
					
				String[] heroes = {"Superman", "Batman", "Aquaman", "Wonder Woman", "The Flas", "Green Lantern"};
				
				System.out.println(Arrays.toString(heroes));
				
				String [] copyOf2 = Arrays.copyOf(heroes,2);
				
				String [] copyOf6 = Arrays.copyOf(heroes,6);
				
				String [] copyOf0 = Arrays.copyOf(heroes,0);
				
				String [] copyOf10 = Arrays.copyOf(heroes,10);
				
				System.out.println(Arrays.toString(copyOf2));
				System.out.println(Arrays.toString(copyOf0));
				System.out.println(Arrays.toString(copyOf6));
				System.out.println(Arrays.toString(copyOf10));
				
				
	}
}
