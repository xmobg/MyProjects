package WhileLoop;

import java.util.Scanner;

public class keepguessing {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int secretNumber=6;
		int guessNumber;
		System.out.println("I have chosen a number between 1 and 10.Try to guess it.");
		System.out.println("Your guess: ");
		guessNumber=sc.nextInt();
		while(secretNumber != guessNumber) {
			System.out.println("That is incorrect.Guess again.");
			guessNumber=sc.nextInt();
		}
		System.out.println("That's right!You're a good guesser.");
	}

}
