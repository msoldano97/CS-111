/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC09
* LAST MODIFIED: 4/5/2019
********************************************/
/*****************************************************************************
* IC09_WinningTheLottery
*****************************************************************************
* PROGRAM DESCRIPTION:
* The Fantasy 5 (TM) lottery is a game in which 5 numbers from 1 to 36 are randomly 
* drawn by the State of California.  If you correctly guess all 5 numbers,  you win 
* the jackpot of $75,000.  If you guess 4 out of 5, you win $500.  Finally, if you 
* guess 3 out of 5, you win $15.  No cash prizes are awarded for less than 3 correct guesses.

First, create an array named winningNumbers with space for 5 integer numbers.
* Next, create an array named guessNumbers, also with space for 5 integer numbers.

Randomly generate 5 numbers from 1 to 36 and store each in a different location in the 
* winningNumbers array.  It would be useful to put this code in a static method 
* (e.g. randomlyAssignNumbers), so that it may be reused later. Display the winning 
* lottery numbers to the console, so the user may see what they are.

Now, write a loop that will attempt to guess the winningNumbers by randomly 
* assigning each element in the guessNumbers array a number between 1 to 36.  
* Reuse the randomlyAssignNumbers method to simplify this task.

Create another static method (named howManyCorrect) that takes in two arrays as parameters 
* (inputs).  For example, the method definition might look like: public static int howManyCorrect
* (int[] guessNumbers, int[] winningNumbers).  If the lengths of the two arrays are different, 
* the method should return -1.  Otherwise, the method should count how many of the elements in 
* the guessNumbers array are the same elements in the winningNumbers array and return that value.

If the number correct is 5, your program should output "After 21233 guesses you won Fantasy 5! 
*  5 out of 5 lottery numbers were correct.  You win $75,000"
* Otherwise, keep a counter of guesses (non-winning numbers) and continue to loop 
* (randomlyAssignNumbers to the guessNumbersArray)
*****************************************************************************
* ALGORITHM:
* 1. create an array named winningNumbers with space for 5 integer numbers.
* 2. create an array named guessNumbers, also with space for 5 integer numbers.
* 3. create a for loop to go through all the index in the array
* 4. Randomly generate 5 numbers from 1 to 36 and store each in a different location in the 
* winningNumbers array
* 5. write a loop that will attempt to guess the winningNumbers by randomly
* 6. make a method called howManyCorrect
* 7. compare the lengths of the arrays
* 8. make a variable that counts how many guess numbers are correct
* 9. Check if each position in both arrays are the same
* 10. create a do while loop to see how long it will take to win the lottery
* 11. make a variable on how much money spent
* 12. display the winning numbers
* 13. display how much money would need to be spent before the user wins the lottery
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Random
* import java.util.Arrays
* import java.text.NumberFormat
* *****************************************************************************/
import java.util.Random;
import java.util.Arrays;
import java.text.NumberFormat;

public class IC09_WinningTheLottery {
	
	public static void main (String args[]) {
		
		int[] winningNumbers = new int[5];
		int[] guessNumbers = new int[winningNumbers.length];
		Random rng = new Random();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		for (int i = 0; i < winningNumbers.length; i++)
		{
			winningNumbers[i] = rng.nextInt(36) + 1;
		}
		System.out.println("Today's winning lottery numbers are: " +
		Arrays.toString(winningNumbers));
		
		int money = 0;
		do
		{
			money++;
		for (int i = 0; i < guessNumbers.length; i++)
		{
			guessNumbers[i] = rng.nextInt(36) + 1;
		}	
	}
	while(howManyCorrect(winningNumbers, guessNumbers) < 5);
	
	System.out.println("After spending " + currency.format(money) + ", you won the Fantasy 5 Lottery!\n5 out of 5 lottery numbers were correct. You win $75,000.");
	
	}
	public static int howManyCorrect(int[] array1, int[] array2)
	//could have named it winningNumbers and guessNumbers however it is possible to name them
	//differently and the arrays will still go through the newly named arrays.
	
	//If you can't do a comparison (on length), return -1
	{
	if (array1.length != array2.length)
	return -1;
	
	int correct = 0;
	for (int i = 0; i < array1.length; i++)
	//could use array2 as well
	if (array1[i] == array2[i])
	correct++;
	//if nested like this with one line of code for  the for loop and the if statement then
	//there is no neccessity for the curly braces, the if and for dont need the braces if it is only
	//one command/line of code
	return correct;
	
}
	
}

