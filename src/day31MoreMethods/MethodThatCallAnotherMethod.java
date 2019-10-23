package day31MoreMethods;

	public class MethodThatCallAnotherMethod {
	
		public static void main(String[] args) {
		
		/*
		 * step1: boil the water
		 * step2: add pasta to the water
		 * step3:add some olive oil
		 * step4:add some salt
		 * step5: add mix it and taste it
		 */

		
	//	prepare();
		
	//	addIngridient();
		
	//	tasteAndBringtoTheTable();
		
			AskSposeToPrepareMeal();
		
		}
	
	public static void AskSposeToPrepareMeal() {
	
		prepare();
		
		addIngridient();
		
		tasteAndBringtoTheTable();
	}
	
		 public static void prepare() {
			 
			 System.out.println("step1: boil the water");
			 System.out.println("step2: add pasta to the water");
			
		}
		 public static void addIngridient() {
			 
			 System.out.println("step3: add some olive oil");
			 System.out.println("step4: add some salt");
	}

		 public static void tasteAndBringtoTheTable() {
			 
			 System.out.println("step5: add mix it and taste it");
			 
		 }
		 
	}
	
			