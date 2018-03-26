package Arrays;

import java.util.Random;

public class CopyingArrays {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		Random r = new Random();
		for(int i = 0;i<array1.length;i++) {
			array1[i]=10+r.nextInt(90);
			array2[i]=array1[i];
			array1[9]=-7;
		}
		System.out.print("Array1 :");
		
		for(int j=0;j<array1.length;j++) {
			System.out.print(" "+array1[j]);
			
		}
		System.out.println();
		System.out.print("Array2 :");
		for(int j=0;j<array1.length;j++) {
			System.out.print(" "+array2[j]);
			
		}
	}

}
