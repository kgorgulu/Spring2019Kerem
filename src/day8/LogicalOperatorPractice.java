package day8;

public class LogicalOperatorPractice {
	public static void main(String[] args) {
		
		int score = 10;
		
		boolean result1 = score > 4;
		boolean result2 = score > 4 && score <11;
		
		boolean result3 = score > 14;
		boolean result4 = score > 14 || score <11;
		
		//boolean result5 = score++ > 10 && score <12; 10>10 && 11<12;
		//boolean result5 = ++score > 10 && score <12; 11>10 && 11<12;
		//boolean result5 = score++ > 10 || score <12; 10>10 && 11<12;
				
		//boolean result5 = score++ > 10 || score <12; //10>10 
		boolean result5 = score++ > 10 && ++score <13; 
		
		System.out.println("the value of score right now : " +score);
						
				System.out.println("result is " + result1);
				System.out.println("result is " + result2);
				System.out.println("result is " + result3);
				System.out.println("result is " + result4);
				System.out.println("result is " + result5);

	}
}
