/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC03
* LAST MODIFIED: 2/8/2019
********************************************/
/*****************************************************************************
* IC03_JoiningNames
*****************************************************************************
* PROGRAM DESCRIPTION:
* To develop a program that uses the Scanner class to read 3 strings from the user:
* Please enter your first name:
* Please enter your middle initial:
* Please enter you last name:
* Then to calculate the characters in the names
* Finally to reagrange the names to Last, First, MI
*****************************************************************************
* ALGORITHM:
* 1. Prompt the user to enter the previously mentioned information
* 2. Use String operations to calculate the length, and rearrange the names.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
*****************************************************************************/
import java.util.Scanner;

public class IC03_JoiningNames {
	
	public static void main (String args[]) {
		String firstName, middleInitial, lastName;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your first name: " );
        firstName = keyboard.nextLine();
        System.out.print("Please enter your middle initial: " );
        middleInitial = keyboard.nextLine();
        System.out.print("Please enter your last name: " );
		lastName = keyboard.nextLine();
		
		System.out.print("\n\n" + firstName + " (length = " + firstName.length() + ")");
		System.out.print("\n" + middleInitial + " (length = " + middleInitial.length() + ")");
		System.out.print("\n" + lastName + " (length = " + lastName.length() + ")");
		
		System.out.println("\n\n" + lastName + ", " + firstName + ", " + middleInitial);
		
		
	}
}

