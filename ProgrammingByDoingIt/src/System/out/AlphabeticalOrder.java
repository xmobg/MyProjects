package System.out;

import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String lastName;
		System.out.println("What is your last name?");
		lastName=sc.nextLine();
		if(lastName.compareTo("Carswell")<0) {
			System.out.println("you don't have to wait long");
		}
		if(lastName.compareTo("Jones")>0) {
			System.out.println("that's not bad");
		}
		if(lastName.compareTo("Smith")>0) {
			System.out.println("looks like a bit of a wait");
		}
		if(lastName.compareTo("Young")<0) {
			System.out.println("Its gonna be a while");
		}

	}

}
