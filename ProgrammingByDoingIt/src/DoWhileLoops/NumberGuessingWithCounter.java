package DoWhileLoops;

import java.util.Scanner;

public class NumberGuessingWithCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int secretNumber=6;
		int guessNumber;
		int counter=1;
		System.out.println("I have chosen a number between 1 and 10.Try to guess it.");
		System.out.println("Your guess: ");
		guessNumber=sc.nextInt();
		do {
			System.out.println("That is incorrect.Guess again.");
			guessNumber=sc.nextInt();
			counter++;
		}while(secretNumber != guessNumber);
		System.out.println("That's right!You're a good guesser.");
		System.out.println("Its look like you tried " +counter+ " times");
	}
	

	}


