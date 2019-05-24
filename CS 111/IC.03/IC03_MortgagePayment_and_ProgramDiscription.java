/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC03
* LAST MODIFIED: 2/8/2019
********************************************/
/*****************************************************************************
* IC03_MortgagePayment
*****************************************************************************
* PROGRAM DESCRIPTION:
* This program will calculate the amount of currency towards the interest and the principle of 
* a monthly payment towards a mortgage.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user for mortgage payment
* 2. Prompt user for amount outstanding
* 3. Calculate interest --> interest = amount outstanding * interest rate / 12
* 4. Calculate principle --> principal = mortgage payment - interest
* 5. Display interest and principal formatted as currency
* 6. Maybe add a current balance at the end
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
* import java.text.NumberFormat;
*****************************************************************************/

import java.util.Scanner;
import java.text.NumberFormat;
public class IC03_MortgagePayment_and_ProgramDiscription {
	
	public static void main (String args[]) {
		double monthlyFee, outstanding, interest, principal, tax;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.print("Please enter your mortgage payment: $");
		monthlyFee = keyboard.nextDouble();
		System.out.print("Please enter outstanding balance on mortgage: $");
		outstanding = keyboard.nextDouble();
		
		tax = .04;
		interest = outstanding * tax / 12;
		principal = monthlyFee - interest;
		
		System.out.print("\nOf your " + currency.format(monthlyFee) + " mortgage payment:\n");
		System.out.println(currency.format(interest) + " goes to interest.\n" +
		(currency.format(principal)) + " goes to principle.");
	}
}

