package day12;

public class SwithcDataTypeRestriction {
	public static void main(String[] args) {
		// What data types are supported for switch variables 
		
				// char , byte , short , int , String 
				char myChar = 'c' ; 
				
				switch (myChar) {
				case 'a':
					System.out.println("you selected a");
					break;
				case 'b':
					System.out.println("you selected b");
					break;
				case 'c':
					System.out.println("you selected c");
					break;

				}
				
				byte b1 = 12 ; 
				
				switch (b1) {
				case 11:
					System.out.println("you selected 11");
					break;
				case 12:
					System.out.println("you selected 12");
					break;
				case 13:
					System.out.println("you selected 13");
					break;

		}
	}
}
