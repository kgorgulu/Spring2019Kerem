package replit;
import java.util.Scanner;
public class Repl53 {
	public static void main(String[] args) {
		/*
		 * First ask user for a screen size. If screen size is equals to 13.3,		add  $200 to the laptop price. 
		If screen size is equals to  15.0 - add  $300 to the laptop price. 
		If screen size is equals to  17.3 - add  $400 to the laptop price. 
		
		Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price. 
		If CPU type equals to i5, add  $250 to the laptop price. 
		If CPU type equals to i7, add  $350 to the laptop price. 
		
		Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. 
		Then, ask user for storage type. There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.
		If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution. 
		
		There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
		
Display message: Select screen size:

input: 13.3 
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
		 */
		//double size=13.3, 15.0, 17.3;
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select screen size:");
		double size = scan.nextDouble();
		System.out.println("Select CPU type:");
		cpu=scan.next();
		System.out.println("Select RAM size:");
		ram=scan.nextInt();
		System.out.println("Select storage type:");
		storageType=scan.next();
		System.out.println("Enter memory size:");
		int memory=scan.nextInt();
		System.out.println("Enter screen resolution:");
		screenType=scan.next();
		//=====================size==============================		
		if(size==13.3){
			price=price+200;}
			else if (size==15.0) {
			price=price+300;}
			else if (size==17.3) {
			price=price+400;}
		//===========================================cpu====================
				
		if(cpu.equals("i3")){
				price=price+150;}
		else if (cpu.equals("i5")) {
				price=price+250;}
		else if (cpu.equals("i7")) {
				price=price+350;}
		
	    //=====================================ram=============================
	
			ram=ram/4;
			price=price+ram*50;
		
		//================================storage=============================
		
		if(storageType.equals("HDD")) {
			memory=memory/500;
			price=price+50*memory;
		}else if(storageType.equals("SSD")) {
			memory=memory/500;
			price=price+100*memory;
		}
		//===============================screen================================
		
		if(screenType.equals("FULLHD")) {
			price=price+100;
		}else if(screenType.equals("4K")) {
			price=price+200;
		}
			System.out.println("Laptop price is:$"+price);
		
		

			
		
	
		
		
		
	}
}
