package WhileLoop;

import java.util.Scanner;

public class numberGussingWithCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int secretNumber=6;
		int guessNumber;
		int counter=1;
		System.out.println("I have chosen a number between 1 and 10.Try to guess it.");
		System.out.println("Your guess: ");
		guessNumber=sc.nextInt();
		while(secretNumber != guessNumber) {
			System.out.println("That is incorrect.Guess again.");
			guessNumber=sc.nextInt();
			counter++;
		}
		System.out.println("That's right!You're a good guesser.");
		System.out.println("Its look like you tried " +counter+ " times");
	}
	}


