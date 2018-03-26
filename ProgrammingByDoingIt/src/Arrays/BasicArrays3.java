package Arrays;

import java.util.Random;

public class BasicArrays3 {

	public static void main(String[] args) {
		int[] array = new int[1000];
		Random r = new Random();
		
		for(int i = 0;i<array.length;i++) {
			array[i]=10+r.nextInt(90);
		}
		for(int j = 0;j<array.length;j++) {
			System.out.print(array[j]+"\t");
		}
		

	}

}
