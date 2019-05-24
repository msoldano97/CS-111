/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC09
* LAST MODIFIED: 4/16/2019
********************************************/
/*****************************************************************************
*  IC09_ManagingTimesheets
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a small Java program that declares a two-dimensional array (size 3 x 5) 
* to manage the hours worked by each of your three employees on a five-day work week.  
*****************************************************************************
* ALGORITHM:
* 1. Declare a string array of the days of the week
* 2. declare variables for the amount of employees and days for the 2D array
* 3. declare the 2D array
* 4. declare and initialize the total and average for later
* 5. use decimal format if needed
* 6. create a nested for loop with the first loop keeping track of the amount of employees
* 7. then have the second loop for the days for each employee
* 8. prompt the user to enter the amount of hours for each day for each employee
* 9. add up the total for each employee in the process
* 10. find the average outside the inside loop and use total and average for each
* of the first loop (the rows) to calculate the average
* 11. Display the total hours and average hours for each employee
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.text.DecimalFormat
* *****************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class IC09_ManagingTimesheets {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		int employ = 3, days = 5;
		double[][] e = new double[employ][days];
		double[] total = new double[employ];
		double[] avg = new double[employ];
		DecimalFormat twoD = new DecimalFormat("###.##");
		
		for(int i = 0; i < employ; i++) {
			for(int j = 0; j < days; j++) {
				System.out.print("Hours worked for employee #" + (i + 1)  + " on " + day[j] + ": ");
				e[i][j] = keyboard.nextDouble();
				total[i] += e[i][j];
				
			}
			avg[i] = total[i] / days;
			System.out.println();
		}
		System.out.println("Total hours worked for employee #1   : " + twoD.format(total[0]));
		System.out.println("Average hours worked for employee #1 : " + twoD.format(avg[0]));
		System.out.println();
		
		System.out.println("Total hours worked for employee #2   : " + twoD.format(total[1]));
		System.out.println("Average hours worked for employee #2 : " + twoD.format(avg[1]));
		System.out.println();
		
		System.out.println("Total hours worked for employee #3   : " + twoD.format(total[2]));
		System.out.println("Average hours worked for employee #3 : " + twoD.format(avg[2]));
		System.out.println();
	}
}

