package Variables;

public class MoreVariablesAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String myName,myEyes,myTeeth,myHair;
int myAge,myHeight,myWeight;
myName = "Georgi T. Grozdev";
myAge= 26;
myHeight = 184;
myWeight=84;
myEyes="Hazel";
myTeeth = "White";
myHair="Brown";
System.out.println("Lets talk about "+myName +".");
System.out.println("Hes " + myHeight + " centimetre tall.");
System.out.println("Hes " + myWeight + " kilograms heavy");
System.out.println("His teeth are usually " + myTeeth + " depending on the coffe.");
System.out.println("If i add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight +myWeight) + ".");
	}

}
