/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC05
* LAST MODIFIED: 3/1/2019
********************************************/
/*****************************************************************************
* IC05_IncaQuipu
*****************************************************************************
* PROGRAM DESCRIPTION:
* To construct an Inca Quipu in software, such that a user may type any number 
* from 0 to 999 (inclusive) and the value will be expressed in a visual quipu. 
* If the user types in a number < 0 or > 999, an error message should be displayed.
*****************************************************************************
* ALGORITHM:
* 1. 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* *****************************************************************************/
import java.util.Scanner;

public class IC05_IncaQuipu {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int number, hundreds, tens, ones;
		System.out.print("Enter a number between 0 and 999: ");
	    number = keyboard.nextInt();
	  
		if (number > 0)
		{
		hundreds = number/ 100;
	    System.out.println("\nHundreds = " + hundreds);
	    
		tens = number % 100 /10;
	    System.out.println("Tens = " + tens);
	    
	    ones = number % 100 % 10;
	    System.out.println("Ones = " + ones);
	    
	    System.out.println("\nAs an Inca Quipu, " + number + " is expressed as: ");
	    System.out.print("|---");
	    	
			for (int h = 0; h < hundreds; h ++)
	    {
			System.out.print("*");
	}
	System.out.print("---");
		for (int t = 0; t < tens; t++)
		{
		System.out.print("*");
	}
	System.out.print("---");
	for (int o = 0; o < ones; o++)
	{
		System.out.print("*");
	}
	System.out.println("---|");


}
		else 
		{
			System.err.println("Error. Number must be between 0 and 999.");
		
	}
}
}

