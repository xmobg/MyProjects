package ForLoop;

import java.util.Scanner;

public class AddingValuesWithAForLoop {

	public static void main(String[] args) {
		int n=0;
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:");
		number = sc.nextInt();
		for(int i = 1;i<=number;i++) {
			System.out.print(i+" ");
			n=i+n;
		}
		System.out.println("The sum is " + n);
	}

}
