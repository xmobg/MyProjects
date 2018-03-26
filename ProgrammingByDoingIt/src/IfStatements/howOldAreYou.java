package IfStatements;

import java.util.Scanner;

public class howOldAreYou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nameOne;
		int ageOne;
		System.out.println("Hey,what's your name?");
		nameOne=sc.nextLine();
		System.out.println("Okay, " +nameOne+",how old are you?");
		ageOne=sc.nextInt();
		if(ageOne<16) {
			System.out.println("You cant drive!");
		}
		if(ageOne<18) {
			System.out.println("You cant vote!");
		}
		if(ageOne<25) {
			System.out.println("You cant rent a car!");
		}
		if(ageOne>25){
			System.out.println("You can do anything thats legal!");
		}
	}

}
