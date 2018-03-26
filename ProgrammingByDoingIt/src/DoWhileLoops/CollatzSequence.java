package DoWhileLoops;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		int n;
		int count=0;
		int largestNumber=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while(n != 1) {
			if(n%2==0) {
				n = n/2;
				System.out.println(n);
				count++;
			}else if(n%2 != 0) {
				n = (n*3)+1;
				System.out.println(n);
				count++;
			}
			if(n>largestNumber) {
				largestNumber = n;
			}
		}
		System.out.println(n);
		System.out.println("Terminated after "+count+" steps");
		System.out.println("Largest number is "+largestNumber);
	}

}
