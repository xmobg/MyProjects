package DoWhileLoops;

import java.util.Scanner;

public class SafeSquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("SQUARE ROOT!");
		System.out.println("Enter a number:");
		number = sc.nextInt();
		double n=Math.sqrt(number);
		while(number<=0) {
			 System.out.println( "You can't take the square root of a negative number, silly." );
	            System.out.print( "Try again: " );
	            number = sc.nextInt();
	             n=Math.sqrt(number);
		}
		System.out.println("The square root of " + number + " is " + n + ".");
		
		
		
		

	

	}
}
