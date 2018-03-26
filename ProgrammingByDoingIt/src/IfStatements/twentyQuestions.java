package IfStatements;

import java.util.Scanner;

public class twentyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("TWO QUESTIONS!");
System.out.println("Think of an objecy,and I`ll try to guess it.");
String question1,question2;
System.out.println("Question 1) Is it animal,vegetable,or mineral?");
System.out.println(">");
question1=sc.nextLine();
System.out.println("Question 2) Is it bigger than a breadbox?");
System.out.println(">");
question2=sc.nextLine();
if(question1.equals("animal")   && question2.equals("yes") ) {
	System.out.println("My guess is that you are thinking of a moosee");
	System.out.println("I would ask you if I'm right,but I don't actually care.");
}
	else if (question1.equals("animal") && question2.equals("no") ) {
		System.out.println("My guess is that you are thinking of a squirrel");
		System.out.println("I would ask you if I'm right,but I don't actually care.");
	}
	else if(question1.equals("vegetable") && question2.equals("yes") ) {
		System.out.println("My guess is that you are thinking of a watermelon");
		System.out.println("I would ask you if I'm right,but I don't actually care.");
	}
	else if(question1.equals("vegetable") && question2.equals("no")) {
		System.out.println("My guess is that you are thinking of a carrot");
		System.out.println("I would ask you if I'm right,but I don't actually care.");
	}
	else if(question1.equals("mineral") && question2.equals("no") ){
		System.out.println("My guess is that you are thinking of a paper clip");
		System.out.println("I would ask you if I'm right,but I don't actually care.");
	}
	else if(question1.equals("mineral") && question2.equals("yes")) {
		System.out.println("My guess is that you are thinking of a Camaro");
		System.out.println("I would ask you if I'm right,but I don't actually care.");
	}
	}
}
	


