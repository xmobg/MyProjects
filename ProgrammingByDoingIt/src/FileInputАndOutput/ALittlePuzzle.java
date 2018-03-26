package FileInput¿ndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ALittlePuzzle {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Open which file :");
		Scanner sc = new Scanner(System.in);
		String file = sc.nextLine();
		File fileIn = new File(file);
		Scanner input = new Scanner(fileIn);
		String txt = input.nextLine();
		input.close();
		for(int i = 0 ; i<txt.length();i++) {
			if((i+1)%3==0) {
				System.out.println(txt.charAt(i));
			}
			
		}
		System.out.println();
	}

}
