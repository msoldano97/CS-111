/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC04
* LAST MODIFIED: 2/22/2019
********************************************/
/*****************************************************************************
* IC04_BasalMetabolicRatePartDeux
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a program that allows the user to input his or her weight in pounds, height in inches, 
* and age in years.  Your program should output two things 1) The number of calories needed to 
* maintain one's weight for only what the user enters (Female or Male) and activity type  
* (Sedentary, Somewhat active, Active or Highly Active) AND  2) The number of chocolate bars 
* that should be consumed to maintain this amount of calories (a typical chocolate bar contains 
* about 230 calories).
*****************************************************************************
* ALGORITHM:
* 1. Copy and paste previous Basal Metabolic Rate code to build off of
* 2. Change wording layout
* 3. Use if/ else if/ else statements to determine activity level equation
* 4. Use a if/ else declaration to choose the male or female message
* 5. Change final message
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
* import java.text.DecimalFormat;
*****************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class IC04_BasalMetabolicRatePartDeux {
	
	public static void main (String args[]) {
		double weight, height, age, calories, cBars;
		int exercise;
		Scanner keyboard = new Scanner(System.in);
		String gender;
		DecimalFormat cals = new DecimalFormat ("0");
		DecimalFormat calBars = new DecimalFormat ("0.0");
				
		
		System.out.print("Enter weight in pounds: ");
		weight = keyboard.nextInt();
		System.out.print("\nEnter height in inches: ");
		height = keyboard.nextInt();
		System.out.print("\nEnter age in years: ");
		age = keyboard.nextInt();
		//to fix problem
		
		keyboard.nextLine();
		
		System.out.print("\nPlease enter male or female: ");
		gender = keyboard.nextLine();
		
		if (gender.equalsIgnoreCase("female")) {
			calories = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
		}
		
		else {
			calories = 66 + (6.23 * weight) + (12.7 * height ) - (6.8 * age);
		}
		
		System.out.print("\nPlease enter the number corresponding with your activity factor:" +
						 "\n1. Sedentary (not active)" +
						 "\n2. Somewhat active (excercise occastionally)" +
						 "\n3. Active (exercise 3-4 times per week)" +
						 "\n4. Highly active (exercise every day)" +
						 "\nPlease enter number here: ");
						 exercise = keyboard.nextInt();
						 
						 
						 
		if (exercise == 1) {
			// make calories go up by 20%
			// new = old * 1.2
			// hacker notation (shorthand) --> calories *= 1.2
			calories *= 1.2;
		}
		else if (exercise == 2){
			calories *= 1.3;
		}
		else if (exercise == 3) {
			calories *= 1.4;
		}
		else {
			calories *= 1.5;
		}
		
		// If gender is female
		// When comparing (strings only) Strings we can use a String method called .equalsIgnoreCase(...)
		if (gender.equalsIgnoreCase("female"))
		{ 
		System.out.print("\nAs a female your BMR x Activity Factor is: " + cals.format(calories));
		cBars = calories / 230;
		System.out.print(" and you need to eat " + calBars.format(cBars) + 
		" chocolate bars to maintain your output of calories.");
		
	}
		// Else gender is male
		else 
		{
		System.out.print("\nAs a male your BMR x Activity Factor is : " + cals.format(calories) + " calories");
		cBars = calories / 230;
		System.out.print(" and you need to eat " + calBars.format(cBars) + 
		" chocolate bars to maintain your output of calories.");
	}
		
		System.out.println("\n\n*BMR is essentially the amount of calories a person \n burns when dormant for a day");
		
		
		System.out.println("\n*A typical chocolate bar contains about 230 calories");
		
		
	}
}

