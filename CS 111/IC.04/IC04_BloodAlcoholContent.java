/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC04
* LAST MODIFIED: 2/22/2019
********************************************/
/*****************************************************************************
* IC04_BloodAlcoholContent
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a program that calculates the blood alcohol content of someone drinking 
*  Jagerbombs.  Assume that there are 1.5 ounces of alcohol in one Jagerbomb.  
*  Ask the user to input values for number of drinks and weight.  
*  Output the blood alcohol content value and whether or not the person would be 
*  legally intoxicated.  In the state of California, a person is legally intoxicated 
*  if their BAC is >= 0.08.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to enter drinks
* 2. Prompt user to enter weight
* 3. Use given equation to calculated BAC
* 4. Use a if/else decision to declare to the user whether or not the user is good to drive
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
* import java.text.DecimalFormat;
*****************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class IC04_BloodAlcoholContent {
	//Declare any needed constants
	public static final double BAC_LIMIT = 0.08;
	
	
	public static void main (String args[]) {
		double drinks, weight, bac;
	    DecimalFormat amountBac = new DecimalFormat("0.00");
	    Scanner keyboard = new Scanner(System.in);
	    
		System.out.print("Enter the number of alcoholic beverages consumed: ");
		drinks = keyboard.nextDouble();
		System.out.print("Please enter your weight in lbs: ");
		weight = keyboard.nextDouble();
		
		bac = (4.136 * drinks) / weight;
		System.out.println("\nYour BAC is: " + amountBac.format(bac));
		
		if (bac >= BAC_LIMIT)
		{
			System.out.println("According to the state of California, you are intoxicated. DO NOT DRIVE.");
		}
		else
		{
			System.out.println("You are not legally intoxicated, but please drive safely");
		}
		System.out.println("\n*One drink is 1.5 ounces of alcohol");
	}
}

