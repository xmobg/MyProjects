package keyboardinputing;

import java.util.Scanner;

public class moreUserInputofData {

	public static void main(String[] args) {
	System.out.println("Please enter the followint information so i can sell it for profit!");
	Scanner sc = new Scanner(System.in);
	String nameFirst;
	String nameLast;
	String grade;
	String studentId;
	String loginId;
	String GPA;
	System.out.print("First name:");
	nameFirst=sc.nextLine();
	System.out.print("Last name:");
	nameLast=sc.nextLine();
	System.out.print("Grade(9-12):");
	grade=sc.nextLine();
	System.out.print("Student ID:");
	studentId=sc.nextLine();
	System.out.print("Login:");
	loginId=sc.nextLine();
	System.out.print("GPA(0.0-4.0):");
	GPA=sc.nextLine();
	System.out.println("Your information:");
	System.out.println("Login: "+loginId);
	System.out.println("Student ID: " +studentId);
	System.out.println("Name: " + nameFirst+" ," + nameLast);
	System.out.println("GPA(0.0-4.0): " +GPA);
	System.out.println("Grade(9-12): " +grade);
	
	}

}
