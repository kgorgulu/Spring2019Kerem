package interview;

public class SwitchCase {
	public static void main(String[] args) {
		
		int value =10;  // initialized value could change like if else condition
		switch(value)
		{
		   case 10:
		   {
		      System.out.println("Value is 10");
		      break;
		   }

		   case 20:
		   {
		      System.out.println("Value is 20");
		      break;
		   }

		   default: // if it does not match
		   {
		      System.out.println("Default value is 0");
		   }
		}

	}
}
