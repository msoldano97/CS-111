/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC05
* LAST MODIFIED: 3/1/2019
********************************************/
/*****************************************************************************
* IC05_HackerChallenge_Magic8Ball
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

public class IC05_HackerChallenge_Magic8Ball {
	
	public static void main (String args[]) {
		String question, repeat;
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();
		                     //    0              1          2
		String[] certainty = {"Affirmative", "Affirmative", "Affirmative", "Affirmative", 
			"Neutral", "Neutral", "No", "No", "Affirmative", "Affirmative", "Affirmative", 
			"Affirmative", "Affirmative", "Affirmative", "Neutral", "Neutral", "Neutral", 
			"No", "No", "No"};
		
		String[] responses = new String[20];
		responses[0] = "It is certain";	
		responses[1] = "It is decidedly so";
		responses[2] = "Most likely";
		responses[3] = "Signs point to yes";
		responses[4] = "Reply hazy, try again";
		responses[5] = "Ask again later";
		responses[6] = "Don't count on it";
		responses[7] = "My sources say no";
		responses[8] = "Outlook good";
		responses[9] = "Without a doubt";
		responses[10] = "Yes - definitely";
		responses[11] = "You may rely on it";
		responses[12] = "As I see it, yes";
		responses[13] = "Yes";
		responses[14] = "Better not tell you now";
		responses[15] = "Cannot predict now";
		responses[16] = "Concentrate and ask again";
		responses[17] = "Don't count on it";
		responses[18] = "Outlook not so good";
		responses[19] = "Very doubtful";
		
		do {
		System.out.println("What question would you like to ask the Magic 8 Ball?\n");
		question = keyboard.nextLine();

		System.out.print("The answer is: "); 
		
		int answer = rng.nextInt(20);
		// answer = 5 (e.g.)
		
		// repsonses[answer] == responses[5] == "Ask again later"
		System.out.println(responses[answer]);
		
		// certainty[answer] == certainty[5] == 
		System.out.print("In other words: ");
		
		System.out.println(certainty[answer]);
		
		
			
		System.out.println("\nWould you like to ask another question (type Y or N)?");
		repeat = keyboard.nextLine();
	} while (repeat.equalsIgnoreCase("y"));
	//as long as ??? is true
		System.out.println("\nThank you for playing Magic 8 Ball.");
		
	}
}

