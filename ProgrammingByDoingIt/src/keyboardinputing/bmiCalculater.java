package keyboardinputing;

import java.util.Scanner;

public class bmiCalculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double yourHeight;
		double yourWeight;
		double bmiPerson;
		System.out.println("Your height in m:");
		yourHeight=sc.nextDouble();
		System.out.println("Your weight in kg:");
		yourWeight=sc.nextDouble();
		bmiPerson= yourWeight/(yourHeight*yourHeight);
		System.out.println("Your BMI is : " + bmiPerson);
	}

}
