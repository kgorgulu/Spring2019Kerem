package day32_MethodWReturnType;

public class Task1WOutReturn {
	public static void main(String[] args) {

		
		//Task 1: create method giveMe6DigitSalary that return long
		// then return the number you have in mind
		
		// call this method twice and
		// calculate how much you will be making in 2 years
		
		// giveMe6DigitSalary()---> 1st year salary
		// giveMe6DigitSalary()---> 2nd year salary
		
		
		//long  firstYearSalary = giveMe6DigitSalary();
		
		//long  secondYearSalary = giveMe6DigitSalary();
		
	  //   System.out.println(  firstYearSalary + secondYearSalary);
		

		// Second Year 10% Raise
		
	     long  firstYearSalary = giveMe6DigitSalary();
	     long  secondYearSalary =(long) (firstYearSalary * 1.1);
	     System.out.println(  firstYearSalary + secondYearSalary);
	}
	    
	     public static long giveMe6DigitSalary(){

	    

	    return 200000L; 

	     }

	  


	}
