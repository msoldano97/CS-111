/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC03
* LAST MODIFIED: 2/8/2019
********************************************/
/*****************************************************************************
* IC03_DateFormat
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java console application that reads a string for a date in the 
* U.S. format MM/DD/YYYY and displays it in the European format DD.MM.YYYY 
*****************************************************************************
* ALGORITHM:
* 1. Prompt the user to enter the current date and include the forward slashes
* 2. Use String operations to rearrange the numbers and replace the slashes with periods
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
*****************************************************************************/
import java.util.Scanner;

public class IC03_DateFormat {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String date;
		
		System.out.println("Please enter the date (format MM/DD/YYYY) and include the forward slashes: ");
		date = keyboard.nextLine();
		
		String dayPart = date.substring(3,5);
		String monthPart = date.substring(0,2);
		String yearPart = date.substring(6);
		
		System.out.println("\nThis date in Europe would be written as: \n" + dayPart + "." + monthPart + "." + yearPart);
		
	}
}

