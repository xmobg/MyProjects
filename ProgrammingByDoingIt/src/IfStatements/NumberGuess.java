package IfStatements;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int secretNumber,number;
		secretNumber=6;
		System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!!");
		System.out.println();
		System.out.println("I'M THINKING OF A NUMBER FROM 1-10. TRY 2 GESS!");
		number=sc.nextInt();
		if(secretNumber == number) {
			System.out.println("LOL!!!U GOT IT! I CANT BELEIVE U GESSED IT WAS "+secretNumber);
		}
		if(secretNumber != number) {
			System.out.println("WOOT! U SUXOR!I PWN JOO!!!");
		}
	}

}
