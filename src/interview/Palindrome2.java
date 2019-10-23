package interview;

public class Palindrome2 {
	public static void main(String[] args) {
		
		String str= "ey edip pide ye";
		
		char [] arr= str.replace(" ","").toCharArray();
		
		System.out.println(arr);
		
		int head =0, tail=arr.length-1, count = 0;
		
		while(head<tail) {
			if ((arr[head]!=arr[tail])) {
				count++;
		
				
			}
		head++;
		tail--;
		
		}
	if (count>0) {
		System.out.println("Not Palindrome");
		
	}else {
		System.out.println("Palindrome");
	}
	
	
		
	}
}
