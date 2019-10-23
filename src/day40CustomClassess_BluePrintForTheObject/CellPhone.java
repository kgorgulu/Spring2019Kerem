package day40CustomClassess_BluePrintForTheObject;

public class CellPhone {
	
	String brand;
	double screensize;
	String color;
	double price;
	
	public void call() {
		
		System.out.println("Calling");
	}
	
	public static void main(String[] args) {
		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		cell1.call();
	}

	}

