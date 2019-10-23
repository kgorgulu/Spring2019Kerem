package day41_CustomClassEncapsulation;

public class Shoes {
	
	String brand;
	double size;
	
	
	public void setShoesData(String brand, double nSize) {
		
		brand = "newBrand";
		size = nSize;
		
	}
	public String getShoesData() {
		return brand + " | "+size;
		
	}
}
