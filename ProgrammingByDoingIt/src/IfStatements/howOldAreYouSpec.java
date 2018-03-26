package IfStatements;

import java.util.Scanner;

public class howOldAreYouSpec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		String firstName;
		System.out.println("Hey,whats your name?(Sorry,I keep forgetting.)");
		firstName=sc.nextLine();
		System.out.println("Okay, " +firstName+", how old are you?");
		age=sc.nextInt();
		if(age<16) {
			System.out.println("You cant drive!");
		}
		else if(age<=17) {
			System.out.println("You can drive,but you cant vote!");
		}
		else if(age<=24) {
			System.out.println("You can vote,but cant rent a car!");
		}
		else if(age>=25) {
			System.out.println("You can do pretty much anything!");
		}
	}
}
