/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC09
* LAST MODIFIED: 4/5/2019
********************************************/
/*****************************************************************************
*  IC09_iSleepy
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java console program that will monitor how much sleep you obtained 
* each night last week and store the data (number of hours) into an array.  
* After all 7 days have been entered, be sure to display the total number of 
* hours slept in the week, the average number of hours slept last week, how 
* many nights were of "Recommended" sleep, how many "May be Appropriate" and 
* how many were "Not Appropriate".  Then, based on average number of hours 
* slept per night, determine the person's overall sleep health category (e.g. 
* "Recommended", "May be Appropriate" or "Not Recommended").  ***Note: for 
* regular credit - make the sleep health category determination based on your 
* age group***  The Hacker Challenge will include a prompt for age.
*****************************************************************************
* ALGORITHM:
* 1. prompt the user to enter the amount of sleep the user has slept for each
* day of the week
* 2. make a method for categorizing the hours of sleep as recommended, not recommended
* or appropriate.
* 3. count the total hours of slept on the week
* 4. print the average number of hours slept per night
* 5. print the amount of nights that were recommended, not recommended, or appropriate.
* 6. Check the average amount of hours slept per night and see what category the amount
* of sleep the average is and print it.
* 7. display the amount of hours slept that week
* 8. display the average hours slept that week
* 9. display how many days the NSF would rate the sleep in each category
* 10. display the average NSF rating for the average amount of sleep
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.text.DecimalFormat
* *****************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class IC09_iSleepy {
	
	public static void main (String args[]) {
		
		String[] days = {"Sunday" ,"Monday", "Tuesday", "Wendesday", "Thursday", "Friday", "Saturday"};
		double[] hours = new double[days.length];
		
		Scanner keyboard = new Scanner(System.in);
		double total = 0.0;
		int app = 0, rec = 0, notRec = 0;
		DecimalFormat twoD = new DecimalFormat("###.##");
		
		
		for (int i = 0; i < days.length; i++)
		{
			System.out.print("Enter number of hours slept on " + days[i] + ": ");
			hours[i] = keyboard.nextDouble();
			total += hours[i];
			
			if (hours[i] >= 7 && hours[i] <= 9)
			rec++;
			else if (hours[i] < 6 || hours[i] > 10 )
			notRec++;
			else
			app++;
		}
		double average = total / days.length;
		System.out.println();
		System.out.println("Total number of hours slept last week  : " + twoD.format(total));
		System.out.println("Average number of hours slept per night: " + twoD.format(average));
		System.out.println();
		
		System.out.println("According to the NSF, last week, you slept:");
		System.out.println(rec + ((rec == 1) ? " night " : " nights ") + "of \"recommended\" sleep.");
		System.out.println(app + ((app == 1) ? " night " : " nights ") + "of \"appropriate\" sleep.");
		System.out.println(notRec + ((notRec == 1) ? " night " : " nights ") + "of \"not recommended\" sleep.");
		System.out.println();
		
		//do the average
		// if else statements
		if (average >= 7 && average <= 9)
			System.out.println("Overall, your sleep health (on average) is \"Recommended\"");
			else if (average < 6 || average > 10 )
			System.out.println("Overall, your sleep health (on average) is \"Not Recommended\"");
			else
			System.out.println("Overall, your sleep health (on average) is \"Appropriate\"");
		//System.out.println("Overall, your sleep health (on average) is ");
	}
		
	}
