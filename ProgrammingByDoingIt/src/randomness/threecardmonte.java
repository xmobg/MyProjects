package randomness;

import java.util.Random;
import java.util.Scanner;

public class threecardmonte {

	public static void main(String[] args) {
		Random x = new Random();
		Scanner sc =new Scanner(System.in);
		int playerCard;
		int cardAce=1+x.nextInt(3);
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lay down three cards");
		System.out.println();
		System.out.println("Which one is the ace?");
		System.out.println("   ##   ##  ##");
		System.out.println("   ##   ##  ##");
		System.out.println("   1    2   3");
		System.out.println(">");
		playerCard=sc.nextInt();
		if(cardAce==playerCard) {
			System.out.println("You nailed it!Fast Eddie reluctantly hands over your winnings,scowling.");
		}
		else {
			System.out.println("Ha!Fast Eddie wins again!The was card number "+cardAce);
		}
		if(cardAce==1) {
			System.out.println("   AA   ##  ##");
			System.out.println("   AA   ##  ##");
			System.out.println("   1    2   3");
		}
			else if(cardAce==2) {
				System.out.println("   ##   AA  ##");
				System.out.println("   ##   AA  ##");
				System.out.println("   1    2   3");
			}
			else if(cardAce==3) {
				System.out.println("   ##   ##  AA");
				System.out.println("   ##   ##  AA");
				System.out.println("   1    2   3");
		}
	}

}
