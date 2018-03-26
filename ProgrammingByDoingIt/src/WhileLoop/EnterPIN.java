package WhileLoop;

import java.util.Scanner;

public class EnterPIN {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int pin =49002;
	System.out.println("WELCOME TO THE BANK OF AMERICA");
	System.out.println("ENTER YOUR PIN: ");
	int entry=sc.nextInt();
	while(entry!=pin) {
		System.out.println("INCORECT PIN!TRY AGAIN!");
		System.out.println("ENTER YOUR PIN: ");
		entry=sc.nextInt();
	}
	System.out.println("PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}

}
