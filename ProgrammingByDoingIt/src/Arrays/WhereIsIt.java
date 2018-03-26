package Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i = 0;i<array.length;i++) {
			array[i]=1+r.nextInt(50);
		}
		System.out.print("Array: ");
		for(int j =0;j<array.length;j++) {
			System.out.print(" "+array[j]);
		}
		System.out.println();
		System.out.println("Value to find: ");
		int value = sc.nextInt();
		boolean isFind=false;
		for(int k=0;k<array.length;k++) {
			if(array[k]==value) {
				isFind=true;
				System.out.println(value+" is in slot "+k);
			}
			}
		if(!isFind) {
			System.out.println(value+" is not in the array");
		}
		
		}
		
	}


