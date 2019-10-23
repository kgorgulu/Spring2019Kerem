package day28;

public class WarmuUpRev {
	public static void main(String[] args) {
		
		String str = "Sunday Perfect Day to start coding" ; 

        // coding start to Day Perfect Sunday

     

     String reversed = " " ;

             

    String [] str1 = str.split(" ");

     for ( int i=str1.length-1 ; i>=0 ; i-- ) {

         reversed += str1[i] + " "    ;

                 

     }

     System.out.println(reversed);
	}
}
