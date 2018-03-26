package keyboardinputing;

import java.util.Scanner;

public class theForgetfulMmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner (System.in);
			System.out.println("Give me a word!");
			sc.nextLine();
			System.out.println("Give me second word!");
			sc.nextLine();
			System.out.println("Great,now your favorite number?");
			sc.nextInt();
			System.out.println("And your second-favorite number...");
			sc.nextInt();
			System.out.println("Whew!Wasnt that fun?");
	}

}
