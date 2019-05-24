/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC04
* LAST MODIFIED: 2/28/2019
********************************************/
/*****************************************************************************
* IC04_ValidDate
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java console application that reads a string from the keyboard and tests 
* whether it contains a valid date.  Display the date and a message that indicates whether 
* it is valid.  If it is not valid, also display a message explaining why it is NOT valid.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to enter month, day and year.
* 2. Use parsing to separate the month value, day value and year value.
* 3. Use switch and case methods for the month to make the valid statements and
* within the valid statements make rules for the invalid statements.
* 4. Use a default case to make the rule for invalid month and multiple invalid statements.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
*****************************************************************************/

import java.util.Scanner;

public class IC04_ValidDate {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String inputdate, monthPart, dayPart, yearPart;
		int month, day, year;
		
		
		System.out.println("Please enter date in for form MM/DD/YYYY: ");
		inputdate = keyboard.nextLine();
		monthPart = inputdate.substring(0,2);
		month = Integer.parseInt(monthPart);
		dayPart = inputdate.substring(3,5);
		day = Integer.parseInt(dayPart);
		yearPart = inputdate.substring(6);
		year = Integer.parseInt(yearPart);
		
		switch (month) {
			case 1:
			case 3:
			case 5: 
			case 7: 
			case 8: 
			case 10:
			case 12: 
		if ((day > 0 && day < 32) && (year < 10000 && year > 999))
		{	System.out.println("The date you entered is valid!");	
		}
		if (day < 0 || day >= 32)
		{	System.out.println("Invalid day.");
		}
		if (year > 10000 || year < 999)
		{	System.out.println("Invalid year");
		}
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
		if ((day > 0 && day < 31) && (year < 10000 && year > 999))
		{	System.out.println("The date you entered is valid!");
		}
		if (day < 0 || day >= 31)
		{	System.out.println("Invalid day.");
		}
		if (year > 10000 || year <= 999)
		{	System.out.println("Invalid year");
		}
		break;
		case 2:
		if ((day > 0 &&  day < 29) && (year < 10000 && year > 999))
		{	System.out.println("The day you entered is valid!");
		}
		if (day < 0 || day >= 29)
		{	System.out.println("Invalid day.");
		}
		if (year > 10000 || year <= 999)
		{	System.out.println("Invalid year.");
		}
		break;
		default:	
		{
			System.out.println("Invalid month.");
		if ((day < 0 || day >= 31))
			System.out.println("Invalid day.");
		if (year > 10000 || year <= 999)
			System.out.println("Invalid year.");
		}
}



}
}
