package day43_Encapsulation_Review;


public class RaceGround {
	public static void main(String[] args) {
		
		int speed = 10;
		int increaseBy = 5;
		
		//11--12--13-
		
	//	for (int i =speed; i <=speed+increaseBy; i++) {
			
	//		System.out.print(i+ "->");
			
	//	}
	//		System.out.println();
	//		System.out.println(speed);
			
		for (int i = 1; i <=increaseBy; i++) {
			speed = speed+1;
			
			System.out.print(speed+ "->");
			
			}
	}
}
