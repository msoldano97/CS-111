/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC06
* LAST MODIFIED: 3/8/2019
********************************************/
/*****************************************************************************
* IC06_BitcoinTracker
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
* import java.util.Scanner
* *****************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//Also need to import File data type
import java.text.NumberFormat;

public class IC06_BitcoinTracker {
	
	public static void main (String args[]) {
		try {
		Scanner fileScanner = new Scanner(new File("bitcoin_prices_lite.txt"));
		double sum = 0, low = 9999999, high = -9999999, quote;
		int count = 0;
		NumberFormat decimals = NumberFormat.getCurrencyInstance();
		fileScanner.nextLine();
		//ask what the purpose of this is... think it is to skip the first line
		//but it may also be to initialize fileScanner
		
		while (fileScanner.hasNextDouble())
		{
			//Read quotes (price) from next line
			quote = fileScanner.nextDouble();
			
			if (quote < low)
	{
		low = quote;
	}
	if (quote > high)
	{
		high = quote;
	}
			
		// add quote to the sum
		sum += quote;
		//add 1 to the count
		count++;
		
	}
	//here is where we are done reading the file! (after loop)
	//when you are done, make sure to close the file
	fileScanner.close();
	//Display the statistics
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
					   "Bitcoin Statistics: Dec 2014 - Jun 2018\n" +
					   "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Number of price quotes: " + count);
	double average = (sum/count);
	System.out.println("Average price: " + decimals.format(average));
	
	
	System.out.println("Lowest price: " + decimals.format(low));
	System.out.println("Highest price: " + decimals.format(high));
	
	}
	catch (FileNotFoundException e)
	{
	System.err.println("File could not be found.");
	System.exit(0);
	
}	
		//There could be "file not found exception
		//we have to check for it
		
	}
}

