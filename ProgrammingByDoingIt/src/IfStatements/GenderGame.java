package IfStatements;

import java.util.Scanner;

public class GenderGame {

	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
		String gender;
	    String first;
	    String last;
	    String married=null;
	    int age;

	    System.out.println("What is your gender? (\"M\" or \"F\"?)");
	    gender = keyboard.nextLine();

	    System.out.println("First name: ");
	    first = keyboard.nextLine();

	    System.out.println("Last name: ");
	    last = keyboard.nextLine();

	    System.out.println("Age: ");
	    age = keyboard.nextInt();

	    if ((gender.equals("m") && (age < 20))) {
	        System.out.println("Then I shall call you " + first + ".");
	    }

	    else if ((gender.equals("m") & (age >= 20))) {
	        System.out.println("Then I shall call you Mr. " + last + ".");
	    }

	    if ((gender.equals("f") && (age >= 20))) {
	        System.out.println("Are you married " + first
	                + "? (\"y\" or \"n\"?)");
	    married = keyboard.nextLine();
	    married = keyboard.nextLine();
	    }

	    if ((gender.equals("f") && (age >= 20) && (married.equals("y")))) {
	            System.out.println("Then I shall call you Mrs. " + last + ".");
	    }

	    else if ((gender.equals("f") && (age >= 20) && (married.equals("n")))) {
	            System.out.println("Then I shall call you Ms. " + last + ".");
	        }
	    else if ((gender.equals("f") && (age <=20))){
	        System.out.println("Then I shall call you Ms. " + last + ".");
	    }
	}
		
	}


