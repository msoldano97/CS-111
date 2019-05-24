/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC08
* LAST MODIFIED: 4/9/2019
********************************************/
/*****************************************************************************
	* IC08_QuizTracker
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java program that allows a user to enter the number of quizzes they have 
* taken this semester. Declare a new array to store the quiz scores. Prompt the user 
* to enter their score on each of the quizzes in a loop, then display statistics about 
* the data entered in the array, including:

The largest value in the array
The smallest value in the array
The sum of all values in the array
The average of the values in the array
A print out of the sorted quiz scores in ascending order
*****************************************************************************
* ALGORITHM:
* 1. Prompt the user to enter how many quiz scores they want to enter
* 2. Store that number as the amount of nunmbers in the array
* 3. Have a for loop for all the quiz scores to be enterd 
* 4. Sort the array
* 5. Print the highest quiz score stat
* 6. Print the lowest quiz score stat
* 7. Use a function and the print the average quiz score
* 8. Lastly use the sorted arrays and then print them in ascending order
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* import java.util.Arrays
* import java.text.DecimalFormat
* *****************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class IC08_QuizTracker {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat oneDP = new DecimalFormat("0.0");
		int quiz;
		double[] quizScores;
		System.out.println("~~~Quiz Tracker Version 1.0~~~");
		System.out.print("Enter number of quizes taken: ");
		quiz = keyboard.nextInt();
		System.out.println();
		quizScores = new double[quiz];
		double sum = 0.0, average = 0.0;
		for (int q = 0; q < quiz; q++)
		{
			System.out.print("Please enter score for Quiz #" + (q + 1) + ": ");
			quizScores[q] = keyboard.nextDouble();
			sum += quizScores[q];
			
		}
		Arrays.sort(quizScores);
		average = sum / quizScores.length;
		System.out.println("~~~Quiz Statistics~~~");
		System.out.println("The highest quiz score is: " + quizScores[quizScores.length-1]);
		System.out.println("The lowest  quiz score is: " + quizScores[0]);
		System.out.println("The average quiz score is: " + oneDP.format(average));
		
		System.out.println("~~~All Quiz Scores (in ascending order)~~~");
		
		for (int q = 0; q < quiz; q++)
		{
		System.out.println(quizScores[q]);
	}
	}
	
}

