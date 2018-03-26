package FileInput¿ndOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LetterRevisited {

	public static void main(String[] args) throws IOException {
	File letter = new File("letter.txt");
	FileWriter fw = new FileWriter(letter);
	PrintWriter pw = new PrintWriter(fw);
	pw.println("+--------------------------------------------------------------+");
	pw.println("|                                                         #### |");
	pw.println("|                                                         #### |");
	pw.println("|                                                         #### |");
	pw.println("|                                                              |");
	pw.println("|                             Georgi Grozdev                   |");
	pw.println("|                             JK Balik blok 68 ap 12           |");
	pw.println("|                            Dobrich                           |");
	pw.println("|                                                              |");
	pw.println("+--------------------------------------------------------------+");
	pw.close();
	
	}

}
