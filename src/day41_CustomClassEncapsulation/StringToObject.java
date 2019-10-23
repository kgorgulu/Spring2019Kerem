package day41_CustomClassEncapsulation;

import java.util.Arrays;

public class StringToObject {
	public static void main(String[] args) {
		
		
		String data = "Bruno Magli, 9.5";
		
		String [] arrData= data.split(",");
		
		// System.out.println(Arrays.toString(arrData));
		
		Shoes shoes=new Shoes();
		
		shoes.brand=arrData[0];
		shoes.size= Double.parseDouble(arrData[1]);
		
		System.out.println(shoes.getShoesData());
	}
}
