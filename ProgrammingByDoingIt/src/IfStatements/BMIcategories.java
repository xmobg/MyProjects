package IfStatements;

import java.util.Scanner;

public class BMIcategories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double personHeight;
		double personWeight;
		double bmiPerson;
		System.out.println("Your weight in m:");
		personWeight=sc.nextDouble();
		System.out.println("Your height in m:");
		personHeight=sc.nextDouble();
		bmiPerson=personWeight/(personHeight*personHeight);
		System.out.println("Your BMI is: " +bmiPerson);
		if(bmiPerson<15.0) {
			System.out.println("very severely underweight");
		}
		if(bmiPerson>=15.0 && bmiPerson>=16.0) {
			System.out.println("Severely underweight");
		}
		if(bmiPerson>=16.1 && bmiPerson <=18.4 ) {
			System.out.println("underweight");
		}
		if(bmiPerson>=25.0 && bmiPerson<=29.9) {
			System.out.println("overweight");
		}
		if(bmiPerson>=30.0 && bmiPerson<=34.9) {
			System.out.println("moderately obese");
		}
		if(bmiPerson>=35.0 && bmiPerson<=39.9) {
			System.out.println("severely obese");
		}
		if(bmiPerson>=40.0) {
			System.out.println("morbidly obese");
		}
	}

}
