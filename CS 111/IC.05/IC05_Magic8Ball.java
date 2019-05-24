/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC05
* LAST MODIFIED: 3/1/2019
********************************************/
/*****************************************************************************
* IC05_Magic8Ball
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a program that simulates the Magic 8 Ball game. There should be an equal 
* chance for any one of the eight responses to come up.  The program should ask 
* the user if he or she would like to repeat the program and loop if the user opts 
* to repeat.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to ask a question 
* 2. Use the random number generator and a switch case statement to provide a 
* random answer
* 3. Ask if the user if they would like to ask another question
* 4. Use a do/while loop to allow the user to ask as many questions as they would
* like, and have the ability to exit the program whenever they would desire
* 5. Put a thank you message at the end of the code.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.util.Random
* *****************************************************************************/
import java.util.Scanner;
import java.util.Random;

public class IC05_Magic8Ball {
	
	public static void main (String args[]) {
		String question, repeat;
		int answer; //number from 1 to 8 
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		do {
		System.out.println("What question would you like to ask the Magic 8 Ball?");
		question = keyboard.nextLine();

		answer = rng.nextInt(8) + 1;
		
		System.out.println("The answer is: "); //use switch statement to determine message
		switch (answer)
		{
		case 1:
			System.out.println("It is certain");
			break;
		case 2:
			System.out.println("It is decidedly so");
			break;
		case 3:
			System.out.println("Most likely");
			break;
		case 4:
			System.out.println("Signs point to yes");
			break;
		case 5:
			System.out.println("Reply hazy, try again");
			break;
		case 6:
			System.out.println("Ask again later");
			break;
		case 7:
			System.out.println("Don't count on it");
			break;
		default:
			System.out.println("My sources say no");
			break;
		}
		System.out.println("Would you like to ask another question (type Y or N)?");
		repeat = keyboard.nextLine();
	} while (repeat.equalsIgnoreCase("y"));
	//as long as ??? is true
		System.out.println("\nThank you for playing Magic 8 Ball.");
		
	}
}

