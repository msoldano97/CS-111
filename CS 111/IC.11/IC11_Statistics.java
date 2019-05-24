/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC11
* LAST MODIFIED: 4/26/2019
********************************************/
/*****************************************************************************
*  IC11_Statistics
*****************************************************************************
* PROGRAM DESCRIPTION:
* In this assignment, you will be using arrays to calculate common statistics in a data set. 
* Please create one class (e.g. IC11_Statistics)
* 
* Write a method called stdev that returns the standard deviation of an array of integers. 
* Standard deviation is computed by taking the square root of the sum of the squares of 
* the differences between each element and the mean, divided by one less than the number 
* of elements. 
*****************************************************************************
* ALGORITHM:
* 1. Create classes to perform standard deviation and the median
* 2. Prompt the user to find the amount of numbers desired to use the program
* 3. Prompt the user in a for loop to enter the numbers
* 4. Store those numbers in an array
* 5. find the standard deviation and median of the numbers in the array
* 6. print the results
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* java.lang.Math
* java.text.DecimalFormat
* java.util.Scanner
* *****************************************************************************/
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IC11_Statistics {
	
	public static double stdev(int[] array)
	{
		double stdev = 0, avg = 0, sum = 0, summation = 0, sqr = 0, division = 0;
		
		if (array.length < 2)
		return -1;
		
		for (int i = 0; i < array.length; i++)
		{
		sum += array[i];
	}
		avg = sum / array.length;
		
		for (int j = 0; j < array.length; j++)
		{
			sqr = array[j] - avg;
			summation += Math.pow(sqr, 2);
			
		}
		division = summation / (array.length - 1);
		
		stdev = Math.sqrt(division);
		
	return stdev;
		
	}
	
	public static int median(int[] array)
	{
		int median = 0;
		ArrayUtils.selectionSort(array);
		median = array[array.length/2];
		
		
		
		return median;
	}
	
	public static void main (String args[]) {
		
		DecimalFormat Ds = new DecimalFormat("###.###");
		Scanner keyboard = new Scanner(System.in);
		int numbers = 0;
		
		
		System.out.print("Please enter the amount of numbers you wish to enter(must be an odd amount): ");
		numbers = keyboard.nextInt();
		System.out.println();
		int[] array = new int[numbers];
		System.out.println("Please enter the all the numbers(between 0 and 99 inclusively): \n");  
		for (int i = 0; i < numbers; i++)
	{
		
		array[i] = keyboard.nextInt();
	}
	System.out.println();
		double standardD = stdev(array);
		System.out.println("The Standard Deviation for this set of numbers is: " + Ds.format(standardD));
		
		System.out.println("The Median for this set of numbers is: " + median(array));
		
		
		
		
		
	}
}
