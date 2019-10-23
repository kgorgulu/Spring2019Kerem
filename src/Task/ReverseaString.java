package Task;


public class ReverseaString {
	public static void main(String[] args) {
		reverse("Kerem");
		reverse("Kanat");
	}
	
	public static void reverse(String text) {
	 String reversed="";
		for(int i=text.length()-1; i>=0; i--) {
			reversed+=text.charAt(i);
		}
		
		System.out.println(reversed);
		
	}
	
	
}
