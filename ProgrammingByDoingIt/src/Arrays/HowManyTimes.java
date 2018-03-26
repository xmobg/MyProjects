package Arrays;

import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
	int[] array = new int[10];
	for(int i = 0;i<array.length;i++) {
		array[i]=1+r.nextInt(50);
		}
	System.out.print("Array: ");
	for(int j=0;j<array.length;j++) {
		System.out.print(" "+array[j]);
	}
	System.out.println();
	System.out.print("Value to find: ");
	 int number = sc.nextInt();
	 boolean isPresent = false;
	 int count=0;
	for(int k=0;k<array.length;k++) {
		if(array[k]==number) {
			isPresent=true;
			count++;
		}
		}
		if(isPresent) {
			System.out.println(number+" was found "+count+" times");
		}else {
			System.out.println("No such number");
		}
		}
	}
	
		

