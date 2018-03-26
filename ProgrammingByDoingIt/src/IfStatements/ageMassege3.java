package IfStatements;

import java.util.Scanner;

public class ageMassege3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	String	nameOfUser;
	int ageOfUser;
	System.out.println("Hey,what's your name?");
	nameOfUser = sc.nextLine();
	System.out.println("And how old are you?");
	ageOfUser = sc.nextInt();
	if(ageOfUser<=15) {
		System.out.println("You can't drive, " +nameOfUser);
	}
	if (ageOfUser<=17 && ageOfUser>=16) {
		System.out.println("You can drive but not vote, " +nameOfUser);
	}
	if(ageOfUser>=18 && ageOfUser<=24) {
		System.out.println("You can vote but not rent a car, "+nameOfUser);
	}
	if(ageOfUser>=25) {
		System.out.println("You can do pretty much anyting, "+nameOfUser);
	}
	}

}
