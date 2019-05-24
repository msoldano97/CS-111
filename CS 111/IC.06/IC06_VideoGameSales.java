/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC06
* LAST MODIFIED: 3/12/2019
********************************************/
/*****************************************************************************
* IC06_VideoGameSales
*****************************************************************************
* PROGRAM DESCRIPTION:
* In this assignment, we are going to use an extraction of the database (named VideoGameSalesGlobal.txt) 
* which lists the global sales figures (in $ millions) for each of the games.  
* This stripped down file has only the sales figures, but not the names of each game.
* To understand this data further and make sense of it, your challenge is to 
* write a Java program processes the above file and determines:
* - The number of video games in the file
* - The total global sales. Basically a sum of all the sales in the file.
* - The average global sales.
* - The max global sales for any particular game (e.g. max value in the file)
* - The min global sales for any particular game (e.g. min value in the file)
*****************************************************************************
* ALGORITHM:
* 1. 
* 2. For a try/ catch statement 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.io.File
* import java.io.FileNotFoundException
* *****************************************************************************/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class IC06_VideoGameSales {
	
	public static void main (String args[]) {
		
		
		
	try 
	{
		Scanner fileScanner = new Scanner (new File("VideoGameSalesGlobal.txt"));
		int count = 0;
		double avg, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		double sum = 0, sales;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		DecimalFormat bigNumber = new DecimalFormat ("###,###,###");
		
		while (fileScanner.hasNextDouble())
	{
			sales = fileScanner.nextDouble();
			if (sales > max)	
	{
			max = sales;
	}
			if (sales < min)
	{		
			min = sales;
	}
			sum += sales;
			count ++;
		
	}
		fileScanner.close();
		
		max = max * 1000000;
		min = min * 1000000;
		sum = sum * 1000000;
		System.out.println("***************************************\n" +
						   "*    Video Game Sales: 1980 - 2017    *\n" +
						   "***************************************");
		System.out.println("Number of Video games reported: " + bigNumber.format(count));
		System.out.println("\nTotal Global Sales = " + currency.format(sum));
		avg = sum / count;
		System.out.println("Average Global Sales = " + currency.format(avg));
		System.out.println("Highest Global Sales = " + currency.format(max));
		System.out.println("Saddest Global Sales = " + currency.format(min));
		
			
	}
	
	
	catch (FileNotFoundException e) {
		System.err.print("File Not Found");
		System.exit(0);
	}
	
	
	
}
}
		
		
	
		
		
		

	


