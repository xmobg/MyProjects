package randomness;

import java.util.Random;
import java.util.Scanner;

public class aNumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int randomNumber=1+r.nextInt(10);
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess:");
		number=sc.nextInt();
		if(randomNumber==number) {
			System.out.println("That's right!My secret number was " +randomNumber);
		}
		else {
			System.out.println("Sorry,but I was really thinking of " +randomNumber);
		}
		
	}

}
