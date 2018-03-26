package Arrays;

import java.util.Random;

public class FindingTheLargestValueInAnArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random r = new Random();
		int max =0;
		System.out.print("Array:");
		for(int i = 0;i<array.length;i++) {
			array[i]=1+r.nextInt(100);
			System.out.print(" "+array[i]);
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("");
		System.out.println("The largest value is "+max);
	}

}
