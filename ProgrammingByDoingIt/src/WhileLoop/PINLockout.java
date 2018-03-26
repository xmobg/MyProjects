package WhileLoop;

import java.util.Scanner;

public class PINLockout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int pin = 12345;
		int tries=0;
		System.out.println("Welcome to the bank of America");
		System.out.println("ENTER YOUR PIN:");
		int entry=sc.nextInt();
		tries++;
		while(entry!=pin && tries<4) {
			System.out.println("INCORRECT PIN.TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry=sc.nextInt();
			tries++;
		}
		if(entry==pin) 
			System.out.println("PIN ACCEPTED.YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
			else if (tries>=4)
				System.out.println("YOU HAVE RUN OF TRIES.ACCOUNT LOCKED.");
		
	}

}
