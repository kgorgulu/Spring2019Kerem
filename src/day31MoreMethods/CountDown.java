package day31MoreMethods;

public class CountDown {
	public static void main(String[] args) {
		countFrom1To10();

		  System.out.println();

		  CountDown(1);

		}



		public static void CountDown(int n) {

		  for (int i = 10; i >= n; i--) {

		    System.out.print(i + " ");

		  }    

		}

		public static void countFrom1To10() {

		  int num = 10;

		  for (int i = 1; i <= num; i++) {

		    System.out.print(i + " ");

		  }
	}
}
