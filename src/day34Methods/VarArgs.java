package day34Methods;

public class VarArgs {
	public static void main(String[] args) {
		
		
		
		add2Numbers(10,12);
		add3Numbers(10,12, 24);
		anyManyNumbers(new int[] {1,4,66,33});
		addManyNumbers2(1,3,5,6,8,9,100,124,5678);		//you can put same type as many as you want
		/*
		 *  System.out.println("-----VAR ARGS---------- ");

    addManyNumbers2 (1,4,5,6,7,8,9,90);

    addManyNumbers2 (1,4,5);

    addManyNumbers2 (1,4,5,6,7);

    addManyNumbers2 (1,4);

    addManyNumbers2 (1,4,111,222,0,3,44,55,666,77,8,88,9999);

    addManyNumbers2 (1);

    

    // varArgs -- is used to create a method  

      // that can take variable numbers of argument of same type

      // when being called

    

    // varArg parameter is represented by using 

    // ... after method parameter data type 

    // and IT CAN ONLY BE USED HERE !!!


		 */
		
		
	}
		public static void addManyNumbers2(int... manyNums) {
			// VARARGs are seen exactly the same 

		    // as an array inside method body
			
			int sum=0;
			
			for (int eachNums : manyNums) {
				
				sum +=eachNums;
			
			System.out.println(sum);
			}
			
	}
	
		public static void add2Numbers(int num1 , int num2) {
		
			System.out.println(num1 + num2);
}
		
		public static void add3Numbers(int num1 , int num2, int num3) {
			
			System.out.println(num1 + num2+ num3);
}
		public static void anyManyNumbers(int [] manyNums) {
			int sum=0;
			
			for (int eachNum : manyNums) {
				
				sum +=eachNum;
				
			}
				
			
			System.out.println(sum);
		
}
		
		
}
