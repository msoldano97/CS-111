/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC05
* LAST MODIFIED: 3/1/2019
********************************************/
/*****************************************************************************
* IC05_CountVonCount
*****************************************************************************
* PROGRAM DESCRIPTION:
* To code the counting process using a for loop.  Please report an error message 
* if the user types in a magic number < 1.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to enter a number
* 2. Use loops to count all the numbers up to the number
* 3. Use a seperate statement for the number itself without a comma following it
* 4. Create an if/ else statement for the whole thing to create an error message
* 5. Use System.err.println to print an error message
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
* *****************************************************************************/
import java.util.Scanner;

public class IC05_CountVonCount {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int day;
		
		System.out.print("Count von Count: What is the magic number of the day? ");
		day = keyboard.nextInt();
		
		if (day <= 0)
		{System.err.println("I'm sorry but the Count von Count only counts positive numbers! Muhahahaha");
			System.exit(0);
		}
		for (int i = 1; i < day; i++)
		{	
			System.out.print(i + ", ");			
	}
			System.out.print(day);
			System.out.println("\n\n" + day + "! " + day + " is the magic number of the day.\n" +
							day + " dancing vegetables are here to celebrate with me! I love dancing vegetables!");
		
	}
}

