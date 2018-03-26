package DoWhileLoops;

import java.util.Scanner;

public class RightTriangleChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter three integers:");
		System.out.println("Side 1:");
		a=sc.nextInt();
		while(a<=0) {
			 System.out.println( "A side can't be negative. Try again." );
             System.out.print( "Side 1: " );
             a = sc.nextInt();
		}
		System.out.println("Side 2:");
		b=sc.nextInt();
		while(a>b) {
			System.out.println(b+" is smaller than "+a+" .Try again");
			System.out.println("Side 2:");
			b=sc.nextInt();
		}
		System.out.println("Side 3:");
		c=sc.nextInt();
		while(b>c) {
			System.out.println(c+" is smaller than "+b+".Try again");
			System.out.println("Side 3:");
			c=sc.nextInt();
		}
		
		double d = Math.sqrt(a*a+b*b);
		if(d==c) {
			System.out.println( "Those sides make a right triangle!" );
		}else {
			System.out.println( "Nope, not a right triangle" );
		}

	}
}
