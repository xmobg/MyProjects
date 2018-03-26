package IfStatements;

public class whatIf {

	public static void main(String[] args) {
				int people = 20;
				int cats = 30;
				int dogs = 15;

				if ( people > cats )
					//if the value of the cats is bigger than the people its print the massege 
				{//the command between the curly braces gonna be activated
					System.out.println( "Too many cats!  The world is doomed!" );
				}

				if ( people > cats )
				{
					System.out.println( "Not many cats!  The world is saved!" );
				}

				if ( people < dogs )
				{
					System.out.println( "The world is drooled on!" );
				}

				if ( people > dogs )
				{
					System.out.println( "The world is dry!" );
				}

				dogs += 5;

				if ( people >= dogs )
				{
					System.out.println( "People are greater than or equal to dogs." );
				}

				if ( people <= dogs )
				{
					System.out.println( "People are less than or equal to dogs." );
				}

				if ( people == dogs )
				{
					System.out.println( "People are dogs." );
				}
			}
	
}
	


