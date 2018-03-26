package keyboardinputing;

import java.util.Scanner;

public class askingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int age;
		double height;
		double weight;
		System.out.println("How old are you?");
		age=sc.nextInt();
		System.out.println("How tall are you?");
		height=sc.nextDouble();
		System.out.println("How  much do you weight?");
		weight=sc.nextDouble();
		System.out.println("So your " +age+"years old, " + height+" tall and " +weight+" heavy");
	}

}
