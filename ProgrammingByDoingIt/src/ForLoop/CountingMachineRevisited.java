package ForLoop;

import java.util.Scanner;

public class CountingMachineRevisited {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from:");
		int from=sc.nextInt();
		System.out.print("Count to:");
		int to=sc.nextInt();
		System.out.print("Count by:");
		int by = sc.nextInt();
		int n;
		for(n=from;n<=to;n=n+by) {
			System.out.print(n+" ");
		}

	}

}
