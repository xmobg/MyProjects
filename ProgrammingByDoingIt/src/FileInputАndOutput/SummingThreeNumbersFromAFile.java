package FileInput¿ndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersFromAFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn= new Scanner(new File("3nums.txt"));
		int num1 = fileIn.nextInt();
		int num2 = fileIn.nextInt();
		int num3 = fileIn.nextInt();
		int sum = num1+num2+num3;
		System.out.println(num1+"+"+num2+"+"+num3+"="+sum);
		
	}

}
