package Arrays;

import java.util.Scanner;

public class BasicArrays2 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<array.length;i++) {
			array[i]=sc.nextInt();
			
		}
		for(int j = 0;j<array.length;j++) {
			System.out.println("Slot " + j +" contains a " +array[j] );
		}
	}

}
