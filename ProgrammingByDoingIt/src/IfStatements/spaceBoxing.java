package IfStatements;

import java.util.Scanner;

public class spaceBoxing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your current earth weight:");
		double earthWeight=sc.nextDouble();
		System.out.println("I have information for the following planets:");
		System.out.println("1.Venus   2.Mars    3.Jupiter");
		System.out.println("4.Saturn  5.Uranus  6.Neptune");
		System.out.println("Which planet are you visitin?");
		int visitingPlanet = sc.nextInt();
		if(visitingPlanet == 1) {
			 earthWeight = earthWeight * 0.78 ;
			System.out.println("Your weight would be " + earthWeight  + " kilograms on that planet");
		}
		else if(visitingPlanet==2) {
			earthWeight=earthWeight*0.39;
			System.out.println("Your weight would be " + earthWeight  + " kilograms on that planet");
		}
		else if(visitingPlanet==3) {
			earthWeight=earthWeight*2.65;
			System.out.println("Your weight would be " + earthWeight  + " kilograms on that planet");
		}
		else if(visitingPlanet==4) {
			earthWeight=earthWeight*1.17;
			System.out.println("Your weight would be " + earthWeight  + " kilograms on that planet");
		}
		else if(visitingPlanet==5) {
			earthWeight=earthWeight*1.05;
			System.out.println("Your weight would be " + earthWeight  + " kilograms on that planet");
		}
		else if(visitingPlanet==6) {
			earthWeight=earthWeight*1.23;
			System.out.println("Your weight would be " + earthWeight  + " kilograms on that planet");
		}
		else {
			System.out.println("Error");
		}
	}

}
