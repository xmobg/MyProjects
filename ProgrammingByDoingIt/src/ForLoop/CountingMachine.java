package ForLoop;

import java.util.Scanner;

public class CountingMachine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count to:");
		int n=sc.nextInt();
		for(int i = 1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
