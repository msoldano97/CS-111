/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC09
* LAST MODIFIED: 4/16/2019
********************************************/
/*****************************************************************************
*  IC09_Rainfall
*****************************************************************************
* PROGRAM DESCRIPTION:
* Rainfall Statistics  Write a program that lets the user enter the total rainfall 
* for each of 12 months (stored in an array of strings e.g. monthNames) into an array 
* of  doubles (e.g. monthlyRainfall). The program should calculate and display the 
* total rainfall for the year, the average monthly rainfall, and the months with the 
* highest and lowest amounts.  Input Validation: Do not accept negative numbers for 
* monthly rainfall figures.  The goal is to keep an accurate record of rainfall data 
* for scientists to use in prediction models.
*****************************************************************************
* ALGORITHM:
* 1. Declare the first string array to hold all of the months
* 2. make a parallel array with the future inputs of monthly rain
* 3. declare the scanner
* 4. declare and initialize the count for the average
* 5. declare and set up the decimal formatter
* 6. create a for loop to go through each month
* 7. within that loop have the user enter the amount of rainfall for each month
* 8. have if statements to set both the max and the min
* 9. display the total rainfall for the year, average rainfall for the year, max and min
* rainfall for the year
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.text.DecimalFormat
* *****************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class IC09_Rainfall {
	
	public static void main (String args[]) {
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double[] rain = new double[months.length];
		Scanner keyboard = new Scanner(System.in);
		double total = 0, avg = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
		int count = 0;
		DecimalFormat twoDs = new DecimalFormat("##.##");
		
		for (int r = 0; r < months.length; r++)
		{
		System.out.print("Enter rainfall amount (in inches) for " + months[r] + " >> ");
		rain[r] = keyboard.nextDouble();
		total += rain[r];
		count++;
		if (min > rain[r])
		min = rain[r];
		
		if (max < rain[r])
		max = rain[r];
		
	}
	System.out.println("\n");
	System.out.println("Total Rainfall for the Year (in inches): " + twoDs.format(total));
	
	avg = total / count;
	System.out.println("Average Rainfall for the Year (in inches): " + twoDs.format(avg));
	System.out.println("Minimum Monthly Rainfall (in inches): " + min);
	System.out.println("Maximum Monthly Rainfall (in inches): " + max);
	
	
	
	
	
	}
}

