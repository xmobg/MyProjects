package FileInput¿ndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFile {

	public static void main(String[] args) throws FileNotFoundException {
		String file;
		System.out.println("Which file would you like to read numbers from: ");
		Scanner sc = new Scanner(System.in);
		int total=0;
		file = sc.nextLine();
		Scanner fileIn = new Scanner(new File(file));
		System.out.println("Reading numbers from \"" + file + "\"" );
		while(fileIn.hasNextLine()) {
			int n =fileIn.nextInt();
		System.out.print(n+" ");
		total = n + total;
		}
		System.out.println();
		System.out.println("Total is "+total);
		fileIn.close();
	}

}
