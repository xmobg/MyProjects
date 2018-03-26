package Arrays;

import java.util.Random;

public class GradesInAnArray {

	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[6];
		System.out.println("Here are your randomly-selected grades(hope you pass) :");
			for(int i = 1;i<array.length;i++) {
				array[i]=10+r.nextInt(90);
				System.out.println("Grade "+i+":"+array[i]);
			}

	}

}
