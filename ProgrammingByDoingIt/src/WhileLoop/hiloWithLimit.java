package WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class hiloWithLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        Random r = new Random();
        
        int number = 1 + r.nextInt(100);
        
        System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses." );
        System.out.print( "First guess: " );
        int guess = sc.nextInt();
        int tries = 1;
        
        while ( guess != number && tries < 7 ) {
            if ( guess > number ) {
                System.out.println( "Sorry, your guess is too high." );
            }
            
            if ( guess < number ) {
                System.out.println( "Sorry, your guess is too low." );
            }
            
            tries++;
            
            System.out.print( "Guess #" + tries + ":" );
            guess = sc.nextInt();
        }
        
        if ( guess != number ) {
            System.out.println( "Sorry, you didn't guess it in 7 tries. You lose." );
        }
        
        if ( guess == number ) {
            System.out.println( "Wow, you got it in only " + tries + " tries! What are the odds!" );
        }
        
    }
	}
