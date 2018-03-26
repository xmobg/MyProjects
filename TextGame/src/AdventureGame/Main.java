package AdventureGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//System object
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		
		//Game variable
		String[] enemies = {"Skeleton","Zombie","Warrior","Assasin"};
		int maxEnemyHealth = 100;
		int enemyAtackDamage=25;
		
		
		
		//player variable
		int health=100;
		int atackDamage=50;
		int numHealthPotions=3;
		int healthPotionHealAmount=30;
		int healthPotionDropChance=35; //Percentage
		
		
		boolean running = true;
		System.out.println("Welcome to the Dungeon!");
		GAME:
		while(running) {
			System.out.println("-----------------------------------------------------");
			int enemyHealth=rand.nextInt(maxEnemyHealth);
			String enemy=enemies[rand.nextInt(enemies.length)];
			System.out.println("\t# "+enemy+" appeared!#/n");
			while(enemyHealth>0) {
				System.out.println("\tYour HP "+health);
				System.out.println("\t"+enemy+"'s HP: "+enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1.Atack");
				System.out.println("\t2.Drink health potion");
				System.out.println("\t3.Run");
				String input = in.nextLine();
				if(input.equals("1")) {
					int damageDealt=rand.nextInt(atackDamage);
					int damageTaken=rand.nextInt(enemyAtackDamage);
					enemyHealth-=damageDealt;
					health-=damageTaken;
					System.out.println("\t>You strike the "+enemy+" for "+damageDealt+" damage");
					System.out.println("\t>You recieve "+damageTaken+" in relatiation");
					if(health<1) {
						System.out.println("\t>You take too much damage");
						break;
					}
				}
				else if(input.equals("2")) {
					if(numHealthPotions>0) {
						health+=healthPotionHealAmount;
						numHealthPotions--;
						System.out.println("\t>You drink a health potion,healing yourself for "+healthPotionHealAmount
								+"\n\t>You have now have "+health+" HP"
								+ "\n\t>You have "+numHealthPotions+" health potions left.");
					}
					else {
						System.out.println("\t>You have no health potions left!Defeaat enemies for a chance to get one!\n");
					}
				}
				else if(input.equals("3")) {
					System.out.println("\t You run away from "+enemy+"!");
					continue GAME;
				}else {
					System.out.println("\tInvalid command!");
				}
			}
			
			if(health<1) {
				System.out.println("You limp out of battle,weak from battle");
				break;
			}
			System.out.println("---------------------------------------------------------------------");
			System.out.println(" $ "+enemy+" was defeated! # ");
			System.out.println("You have "+health+" HP left. #");
			if(rand.nextInt(100) < healthPotionDropChance ) {
				numHealthPotions++;
				System.out.println(" # The "+enemy+" dropped a health potion #");
				System.out.println("# You now have "+numHealthPotions+" health potions");
				System.out.println("--------------------------------------------------------------");
				System.out.println("What would you like to do now?");
				System.out.println("1.Continue fighting");
				System.out.println("2.Exit dungeon");
				String input = in.nextLine();
				while(!input.equals("1") && !input.equals("2") ) {
					System.out.println("Invalid command");
					input = in.nextLine();
				}
				if(input.equals("1")){
					System.out.println("You continue on your adventure");
				}
				else if(input.equals("2")) {
					System.out.println("You exit succesful from the dungeon");
					break;
				}
			}
			System.out.println("Thanks for playing");
		}
		
	}

}
