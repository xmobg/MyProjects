package FileInput¿ndOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File highScore = new File("score.txt");
		FileWriter fw = new FileWriter(highScore);
		PrintWriter pw = new PrintWriter(fw);
		System.out.println("You got a high score!");
		System.out.println("Please enter your score:");
		System.out.println();
		int score = sc.nextInt();
		pw.println(score);
		System.out.println("Please enter your name:");
		String name = sc.next();
		String lastName= sc.next();
		pw.println(name);
		pw.println(lastName);
		System.out.println("Data stored into "+highScore);
		pw.close();
	}

}
