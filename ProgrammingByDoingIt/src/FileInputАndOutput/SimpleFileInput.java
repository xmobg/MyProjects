package FileInput¿ndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileInput {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("name.txt"));
		String firstName = fileIn.next();
		String lastName = fileIn.next();
		int day = fileIn.nextInt();
		int mount = fileIn.nextInt();
		int year = fileIn.nextInt();
		System.out.println("Using my psychic powers (aided by reading data from the file), I have");
		System.out.println("determined that your name is "+firstName+" "+lastName);
		System.out.println("And ur birthday is "+day+" "+mount+" "+year);
		
	}

}
