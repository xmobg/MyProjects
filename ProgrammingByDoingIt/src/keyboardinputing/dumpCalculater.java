package keyboardinputing;

import java.util.Scanner;

public class dumpCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double firstNumber;
		double secondNumber;
		double thirdNumber;
		System.out.println("What is your first number?");
		firstNumber = sc.nextDouble();
		System.out.println("What is your second number?");
		secondNumber=sc.nextDouble();
		System.out.println("What is your third number?");
		thirdNumber = sc.nextDouble();
		double finalResult = firstNumber + secondNumber + thirdNumber;
		 System.out.println("("+firstNumber+"+"+secondNumber+"+"+thirdNumber+") /2 is ..."+((firstNumber+secondNumber+thirdNumber)/2));
	}

}
