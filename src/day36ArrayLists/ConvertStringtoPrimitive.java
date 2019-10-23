package day36ArrayLists;

public class ConvertStringtoPrimitive {
	public static void main(String[] args) {
		
		String count = "432";
		int iCount = Integer.parseInt(count);  // convert string to int
			
		System.out.println(iCount/2);
		
		String str = "The Price is 45.75"; // i want to call 45.75 from the string
		String [] sp = str.split(" "); // split the array
		
		double price = Double.parseDouble(sp[3]); // call the index
		
		System.out.println(price);
	
		String etsyResult= " 'wooden spoon' (13,950 results)";
		
		String[] etsyArray = etsyResult.split(" ");
		
		String strSpoonsCount = etsyArray[2].replace("(", "").replace(",", "");
		int woodenSpoons = Integer.parseInt(strSpoonsCount);
		
		System.err.println(woodenSpoons);
		
		
		
		
		
	}
	

}
