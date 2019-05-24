/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC06
* LAST MODIFIED: 3/8/2019
********************************************/
/*****************************************************************************
* IC06_BitcoinTrackerFullVersion
*****************************************************************************
* PROGRAM DESCRIPTION:
* Your task is to write a Java console application that loops through one of the
* files (start with lite, then move to full) and calculates the following statistics 
* about Bitcoin from 2014 - 2018:
* 
* The exact number of Bitcoin prices in the file (count)
* The average Bitcoin price over this time period
* The lowest Bitcoin price over this time period
* The highest Bitcoin price over this time period
*****************************************************************************
* ALGORITHM:
* 1. Use the try, catch and file.io statements to call for the bitcoin statistics file
* 2. Use an while statement to call for information while there is a next double
* 3. Then use an if statement to cath the highs and the lows
* 4. Close the file before calling to the screen any information
* 5. Display the information requested by the project
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
* import java.txt.NumberFormat;
* import java.io.File;
* import java.io.FileNotFoundException;
* *****************************************************************************/


import java.util.Scanner;
import java.text.NumberFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;




public class IC06_BitcoinTrackerFullVersion {
	
	public static void main (String args[]) {
		try {
			Scanner fileScanner = new Scanner(new File("bitcoin_prices_full.txt"));
			double sum = 0, low = 999999999, high = -999999999, quote = 0;
			int count = 0;
			NumberFormat decimals = NumberFormat.getCurrencyInstance();
			DecimalFormat commas = new DecimalFormat ("###,###,###,###,###");
			
			//memorize this
			while (fileScanner.hasNextDouble())
			//memorize this
			{
				quote = fileScanner.nextDouble();
				//know what this is for
				if (low > quote)
				{
					low = quote;
				}
			if (quote > high)
			{
				high = quote;
			}
			sum += quote;
			// really understand this
			count++;
			
		} //now always remember to close the file
		
		fileScanner.close();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
						   "Bitcoin Statistics: Dec 2014 - Jun 2018\n" +
						   "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		double average = sum / count;
		System.out.println("Number of price quotes: " + commas.format(count) + "\n" +
						   "Average price: " + decimals.format(average) + "\n" +
						   "Lowest price: " + decimals.format(low) + "\n" +
						   "Highest price: " + decimals.format(high));
		// get the decimal format shit down
		
		
	}
		
		
		
		catch (FileNotFoundException e)
		{
			System.err.print("File cannot be found.");
			System.exit(0);
		}
		
	}
}

