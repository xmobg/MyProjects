package IfStatements;

import java.util.Scanner;

public class adventure1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstOption,secondOption,thirdOption;
		System.out.println("WELCOME TO GEORGE'S TINY ADVENTURE!");
		System.out.println();
		System.out.println("You are in a creepy house!Would you like to go \"upstairs\" or into the \"kitchen\"");
		System.out.println(">");
		firstOption = sc.nextLine();
		if(firstOption.equals("kitchen")) {
			System.out.println("There is a long countertop with dirty dishes everywhere.Off to one side");
			System.out.println("there is,as you'd expect,a refrigerator.You may open the \"refrigerator\"");
			System.out.println("or look in a \"cabinet\"");
			System.out.println(">");
		}
		secondOption = sc.nextLine();
		
		if(secondOption.equals("refrigerator")) {
			System.out.println("Inside the refrigerator you see food and stuff.It looks pretty nasty");
			System.out.println("Would you like to eat some of the food?(\"yes\" or \"no\")");
			}
		System.out.println(">");
		thirdOption=sc.nextLine();
		if(thirdOption.equals("yes")) {
			System.out.println("You eat the food and develop a stomach ache.");
		}else {
			System.out.println("You die of starvation... eventually.");
		}
		 if(firstOption.equals("upstairs")) {
			System.out.println("Upstairs you see a hallway.At the end of the hallway is the master");
			System.out.println("\"bedroom\".There is also a \"bathroom\" off the hallway.Where would you like to go?");
			secondOption = sc.nextLine();
		}
	}

}
