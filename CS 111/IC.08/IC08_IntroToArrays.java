/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC08
* LAST MODIFIED: 4/5/2019
********************************************/
/*****************************************************************************
	* IC08_IntroToArrays
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java program that allows a user to enter 10 integer values into an array within a loop.  
* The program should then display statistics about the data entered in the array, including:

The largest value in the array
The smallest value in the array
The sum of all values in the array
The average of the values in the array
*****************************************************************************
* ALGORITHM:
* 1. Create a new array
* 2. Use a for loop to ask for numbers to store into the array and at the asme time
* store those values in the array
* 3. Sort the array
* 4. Find the largest and smallest value in the array
* 5. Make a function for the sum of the values of the array
* 6. Make another function for the average
* 7. Print out all the information
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.util.Arrays
* *****************************************************************************/
import java.util.Scanner;
import java.util.Arrays;

public class IC08_IntroToArrays {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int[] values = new int[10];
		//int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
		double sum = 0.0;
		
		for (int p = 0; p < values.length; p++)
		{
			System.out.print("Please enter value #" + (p + 1) + ": ");
			values[p] = keyboard.nextInt();
			sum += values[p];
			
			//if (largest < values[p])
			//largest = values[p];
			
			//if (smallest > values[p])
			//smallest = values[p];
			
		}
		System.out.println();
		
		double average = sum / values.length;
		
		//Find the min and the max (using Arrays.sort())
		// Sort array in ascenting order (least to greatest)
		
		Arrays.sort(values);
		
		System.out.println("The largest value in the array is  :" + values[values.length-1]);//largest);
		
		System.out.println("The smallest value in the array is :" + values[0]);//smallest);
		
		System.out.println("The sum of values in the array is  :" + sum);
		
		System.out.println("The average value in the array is  :" + average);
		
	}
}

