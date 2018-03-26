package IfStatements;

import java.util.Scanner;

public class littleQuiz {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int answer1;
		int answer2;
		int answer3;
		int score=0;
		System.out.println("Are you ready for quiz?");
		sc.next();
		System.out.println("Okay,here it comes!");
		System.out.println("Q1)What is the capital of Alaska?");
		System.out.println("1)Melbourne");
		System.out.println("2)Anchorage");
		System.out.println("3)Juneau");
		System.out.println();
		System.out.println(">");
		answer1=sc.nextInt();
		if(answer1==3) {
			System.out.println("That`s right!");
			score++;
		}
		else{
			System.out.println("Sorry,Jeneau is the right answer ");
		}
		System.out.println("Q2)Can you store the value \\\"cat\\\" in a variable of type int?");
		System.out.println("1)yes");
		System.out.println("2)no");
		System.out.println(">");
		answer2=sc.nextInt();
		if(answer2==2) {
			System.out.println("That`s right!");
			score++;
		}
		else {
			System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
		}
		System.out.println("Q3)What is the result of 9+6/3?");
		System.out.println("1)5");
		System.out.println("2)11");
		System.out.println("3)15/3");
		System.out.println(">");
		answer3=sc.nextInt();
		if(answer3==2) {
			System.out.println("That`s correct");
			score++;
		}
		else {
			System.out.println("Sorry wrong answer!");
		}
		System.out.println("Overall,you got " + score + " out of 3 correct");
		System.out.println("Thanks for playing!");
	}

}
