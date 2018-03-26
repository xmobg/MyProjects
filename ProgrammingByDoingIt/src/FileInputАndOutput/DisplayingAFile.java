package FileInput¿ndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayingAFile {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Open which file: ");
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
		Scanner fileIn = new Scanner(new File(file));
		while(fileIn.hasNextLine()) {
			System.out.println(fileIn.nextLine());
		}
		
	}
}
