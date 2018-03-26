package keyboardinputing;

import java.util.Scanner;

public class ageInFiveYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		System.out.print("Hello.What is your name?");
		name=sc.nextLine();
		System.out.print("Hi, "+name +"!How old are you?");
		age=sc.nextInt();
		int ageFive=5+age;
		System.out.println("Did you know that in five years you will be " +ageFive+" years old?");
		int ageOld=age-5;
		System.out.println("And five years ago you were " + ageOld +"!Imagine that!");
		
	}

}
