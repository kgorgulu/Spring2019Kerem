package day23_nested_loop_array;

public class ArrayIntro {
	public static void main(String[] args) {
		
		
		//and we assigned and int array object
		
	//	int[] nums = new int[5];// that has capacity of 5 
		int[] numbrs = {10,20,30,40,50};
		
		
		System.out.println(numbrs[3]);
		
		for (int i = 0; i < numbrs.length; i++) {
			System.out.print(numbrs[i]+"");
		}
		
		//ASSIGNING VALUE to array
	
		/*
		 numbers[0]=10;
		 
		numbers[1]=15;
		numbers[2]=28;
		numbers[3]=20;
		numbers[4]=3;
	//	System.out.println(numbers);
		*/
		String [] names= {"john","jo","jane","james", "jovani"};
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+ " ");
		}
		
		for(String name: names) {  //for each string name in the names
			System.out.println(name);
		}
				
		
		int [] nums= {4,6,3,1,4};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
