/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC03
* LAST MODIFIED: 2/8/2019
********************************************/
/*****************************************************************************
* IC03_ChangeMaker
*****************************************************************************
* PROGRAM DESCRIPTION:
* To determine the change to be dispensed from the register at a grocery store. The goal
* is to output how many quarters, dimes, nickels, and pennies should be given for an 
* amount between 1 to 99 cents.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to input a whole number from 1 to 99
* 2. Calculate the type and amount of coins needed to fulfill the whole number 'using %'
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
*****************************************************************************/
import java.util.Scanner;

public class IC03_ChangeMaker {
	
	public static void main (String args[]) {
		int wholeNumber, quarters, dimes, nickels, pennies;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a whole number from 1 to 99." + 
		"\nI will find a combination of coins equal that amount of change.");
		wholeNumber = keyboard.nextInt();
		
		System.out.println("\n" + wholeNumber + " cents in coins can be given as:");
		quarters = wholeNumber / 25;
		System.out.println("\n" + quarters + " quarter(s)");
		dimes = (wholeNumber % 25) / 10;
		System.out.println(dimes + " dime(s)");
		nickels = (wholeNumber % 25 % 10) / 5;
		System.out.println(nickels + " nickel(s)");
		pennies = (wholeNumber % 25 % 10 % 5);
		System.out.println(pennies + " penny(ies)");
	}
}

