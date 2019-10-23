package day32_MethodWReturnType;

import java.util.*;


public class B10GuessTheNumber {
	
	public static void main(String[] args) {
		playGuessNumCompterOnly();
		
	}
		//playGuessNumCompterOnly();
		//playGuessNUmLimit(int limit);
		//playGuessNUmCompterVsMe(int secretNum);
	public static void main(){
		
	}
		public static void playGuessNumCompterOnly() {
			Random random = new Random();
			int secretNumber = random.nextInt(21);
			
			
			do {
				System.out.println("Guess the secret number:");
				int guessNumber=random.nextInt(21);
				
				System.out.println("Guessing:" + guessNumber);
				//check if secretNumber matches guessNumber
				if(guessNumber== secretNumber) {
					System.out.println("You won! Guessed the right number!");
					break;
				}else {
					
					System.out.println("Wrong! Try again");
				}
		}while(true);
			
		}
}

