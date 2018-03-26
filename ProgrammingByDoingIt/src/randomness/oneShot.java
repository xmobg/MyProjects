package randomness;

import java.util.Random;
import java.util.Scanner;

public class oneShot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random x = new Random();
		int randomNumber=1+x.nextInt(100);
		int personNumber;
		System.out.println("I'm thinking of a number between 1-100.Try to guess it.");
System.out.print(">");
personNumber=sc.nextInt();
if(personNumber==randomNumber) {
	System.out.println("You guessed it!What are the odds?!?");
	
}
else if(personNumber>randomNumber) {
	System.out.println("Sorry you are too high.I was thinking of "+randomNumber);
}
else if(personNumber<randomNumber) {
	System.out.println("Sorry tou are too low.I was thinking of " +randomNumber);
}
	}

}
