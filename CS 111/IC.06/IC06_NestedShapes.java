/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC06
* LAST MODIFIED: 3/8/2019
********************************************/
/*****************************************************************************
* IC06_NestedShapes
*****************************************************************************
* PROGRAM DESCRIPTION:
* Create a Java console application that uses loops (nested for loops) 
* to produce 5 shapes.
*****************************************************************************
* ALGORITHM:
* 1. Use for nested for loops to print the different rows in sequence to 
* create the desired picture
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/

public class IC06_NestedShapes {
	
	public static void main (String args[]) {
		for (int r = 1; r <= 4; r++)
		{
			for (int s = 1; s <= 4; s++)
				{
				System.out.print("*");
			}
	System.out.println();
}
	System.out.println();
	for (int r = 1; r <= 4; r++)
	{
		for (int n = 1; n <= 4; n++)
		{
			System.out.print(r);
		}
		System.out.println();
	}
	System.out.println();
	for (int r = 1; r <= 4; r++)
	{
		for (int s = 1; s <= r; s++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println();
	for (int r = 1; r <= 4; r++)
	{
		for (int n = 1; n <= r; n++)
		{
			System.out.print(r);
		}
		System.out.println();
	}
	System.out.println();
	
	for (int r = 1; r <= 6; r++)
	{
		for (int b = 1; b <= ((r - 1) * 2); b ++)
		{
			System.out.print("\\");
		}
		for (int e = 1; e <= 22 - ((r - 1) * 4); e ++)
		{
			System.out.print("!");
		}
		
		for (int f = 1; f <= ((r - 1) * 2); f ++)
		{
			System.out.print("/");
		}
		System.out.println();
	}		
	//to build
//    1
//   22
//  333
// 4444	
System.out.println();

	for (int r = 1; r <= 4; r++)
	{
		for (int spaces = 1; spaces <= 4-r; spaces++)
		{
			System.out.print(" ");
		}
		for (int n = 1; n <= r; n++)
		{
			System.out.print(r);
		}
		System.out.println();
	}
		//Use a nested loop for each different character, spaces come first
		//numbers next
	
	
	
	}
}

