package Arrays;

import java.util.Scanner;

public class ParallelArrays {

	public static void main(String[] args) {
		String[] arr1= {"Mitchell","Ortiz","Luu","Zimmerman","Brooks"};
		double[] arr2 = {99.5,78.5,95.6,96.8,82.7};
		int[] arr3 = {123456,813225,823669,307760,827131};
		for(int i = 0;i<arr3.length;i++) {
			System.out.println();
			System.out.print(arr1[i]+"\t");
			System.out.print(arr2[i]+"\t");
			System.out.print(arr3[i]+"\t");
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("ID number to find: ");
		int iD = sc.nextInt();
		int slot;
		for(int j = 0;j<arr3.length;j++) {
			if(arr3[j]==iD) {
				System.out.println("Found in slot "+j);
				slot=j;
				for(int k=0;k<arr1.length-4;k++) {
					System.out.print("Name: "+arr1[slot]);
				}
				System.out.println();
				for(int m=0;m<arr2.length-4;m++) {
					System.out.println("Average: "+arr2[slot]);
				}
				for(int k=0;k<arr3.length-4;k++) {
					System.out.println("ID: " +arr3[slot]);
				}
			}
		}
	}

}
