/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC11
* LAST MODIFIED: 4/26/2019
********************************************/
/*****************************************************************************
*  IC11_PriceIsRight
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a method priceIsRight that accepts an array of integers bids and an integer price 
* as parameters. The method returns the element in the bids array that is closest in value 
* to price without being larger than price. For example, if bids stores the elements 
* {200, 300, 250, 999, 40}, then priceIsRight(bids, 280) should return 250, since 250 
* is the bid closest to 280 without going over 280. If all bids are larger than price, 
* then your method should return -1.
*****************************************************************************
* ALGORITHM:
* 1. Use the arrayUtils class to sort the numbers in the priceIsRight class
* 2. Use if statements to create the parameters of the numbers
* 3. Use a for loop to find the bid that is closest to the price without 
* going over the price
* 4. Now in the main, prompt the user to enter the amound of bids
* 5. Then enter the bids and use the priceIsRight method to compare the bids 
* to the actual price
* 6. Print the winning bid
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner
* *****************************************************************************/
import java.util.Scanner;

public class IC11_PriceIsRight {
	
	
	public static int priceIsRight(int[]bids, int price)
	{
	ArrayUtils.selectionSort(bids);
	
	
	if (bids[0] > price)
	return -1;

	
	for (int i = 0; i < bids.length; i++)
	{
		if (bids[i] > price)
		return bids[i-1];
		
	}
	return bids[bids.length - 1];
}
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int guesses;
		
		
	System.out.print("How many bids are being made? --> ");
	guesses = keyboard.nextInt();
	int[] bids = new int[guesses];
	System.out.println();
	for (int i = 0; i < guesses; i++)
	{
		System.out.print("Please enter your bids: ");
		bids[i] = keyboard.nextInt();
	}
	System.out.println();
	
	System.out.println("What is the actual price of the item?? ");
	int price = keyboard.nextInt();
	
	System.out.println("The winning bid is: " + priceIsRight(bids, price)); 
	
	}
}
