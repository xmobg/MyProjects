package IfStatements;

import java.util.Scanner;

public class Twomorequestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String questionOne;
		String questionTwo;
		System.out.println("TWO MORE QUESTIONS,BABY");
		System.out.println();
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println();
		System.out.println("Question 1) Does it stay inside or outside or both?");
		questionOne=sc.nextLine();
		System.out.println("Question 2) Is it a living thing?");
		questionTwo=sc.nextLine();
		if(questionOne.equals("inside") && questionTwo.equals("yes")) {
			System.out.println("Then What else could you be thinking of beside a houseplant?!?");
		}
		if(questionOne.equals("inside") && questionTwo.equals("no") ) {
			System.out.println("Then i quess its a shower");
		}
		if(questionOne.equals("outside") && questionTwo.equals("yes")) {
			System.out.println("Then I'm thinking of bison.");
		}
		if(questionOne.equals("outside") && questionTwo.equals("no")) {
			System.out.println("Guess its a billboards");
		}
		if(questionOne.equals("both") && questionTwo.equals("yes")) {
			System.out.println("Thats a dog");
		}
		if(questionOne.equals("both") && questionTwo.equals("no")) {
			System.out.println("Ts a cell phone");
		}
		
	}

}
