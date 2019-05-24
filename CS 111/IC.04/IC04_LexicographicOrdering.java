/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC04
* LAST MODIFIED: 2/28/2019
********************************************/
/*****************************************************************************
* IC04_LexicographicOrdering
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java console application that reads 3 strings from the keyboard (one word per line).  
* Display the strings (one per line) in lexicographic order.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to enter three separate strings
* 2. Figure out how to rearrange in lexicographic ordering
* 3. Start with comparing the largest values first
* 4. Use compare.To arguments to rearrange the order to correct lexicographic ordering
* 5. b.compareTo(a) if a > b return = (1);
* 6. Use that formula to create integers to print in order.
* VERY CONFUSING AT FIRST
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
*****************************************************************************/
import java.util.Scanner;

public class IC04_LexicographicOrdering {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner (System.in);
		String string1, string2, string3;
		System.out.println("Please enter three seperate strings (in any order):");
		string1 = keyboard.nextLine();
		string2 = keyboard.nextLine();
		string3 = keyboard.nextLine();
		
		System.out.println("In lexicographic ordering, the strings you entered are:");
		//search "ordering strings in compareto java
		if ((string2.compareTo(string1) > 0) && (string3.compareTo(string1) > 0))
		{System.out.println(string1);
			if (string3.compareTo(string2) > 0)
				{
				System.out.println(string2);
				System.out.println(string3);
			}
				else
				{
				System.out.println(string3);
				System.out.println(string2);
			}
		}
		else if ((string1.compareTo(string2) > 0) && (string3.compareTo(string2) > 0))
		{System.out.println(string2);
			if (string3.compareTo(string1) > 0)
				{
				System.out.println(string1);
				System.out.println(string3);
			}
				else
				{
				System.out.println(string3);
				System.out.println(string1);
			}
		}
		else if ((string1.compareTo(string3) > 0) && (string2.compareTo(string3) > 0))
		{System.out.println(string3);
			if (string2.compareTo(string1) > 0)
				{
				System.out.println(string1);
				System.out.println(string2);
			}
				else
				{
				System.out.println(string2);
				System.out.println(string1);
			}
			
		}
			
		
	}
}

