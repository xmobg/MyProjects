package keyboardinputing;

import java.util.Scanner;

public class nameAgesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Hello.What is your name?");
	String name=sc.nextLine();
	System.out.println("Hi " +name+" !How old are you?" );
	int age = sc.nextInt();
	System.out.println("So you're " +age+" ,eh?That's not old at all!");
	System.out.println("How much do you make, " +name +" ?");
	double salary =sc.nextDouble();
	System.out.println(salary +" !I hope that's per hour and not per year!LOL!");

	
	}

}
