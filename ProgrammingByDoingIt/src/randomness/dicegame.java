package randomness;

import java.util.Random;

public class dicegame {

	public static void main(String[] args) {
		Random x=new Random();
		int diceOne=1+x.nextInt(6);
		int diceTwo=1+x.nextInt(6);
		int totalSum;
		System.out.println("HERE COMES THE DICE!");
		System.out.println("Roll#1:" +diceOne);
		System.out.println("Dice #2:" +diceTwo);
		totalSum=diceOne+diceTwo;
		System.out.println("The total is: "+totalSum);
	}

}
