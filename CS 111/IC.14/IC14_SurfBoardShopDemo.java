/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/17/2019
********************************************/
/*****************************************************************************
*  IC14_SurfboardShopPart2
*****************************************************************************
* PROGRAM DESCRIPTION:
* Demonstrates everything listed below.
*****************************************************************************
* ALGORITHM:
* 1. Creates SurfGearList to store items of SurfGear
* 2. Adds a new Surfboard ("Hobie", "Longboard", 9, 22.5, 2.5, 10, 800) to the list
* 3. Adds a new Wetsuit ("Xcel", "Furnace", "M", "4/3", 5, 250) to the list
* 4. Adds a new Surfboard ("Channel Islands", "Weirdo Ripper", 6, 20.25, 2, 5, 400) to the list
* 5. Adds a new Wetsuit ("Quiksilver", "Radioactive", "L", "5/4", 10, 350) to list
* 6. Displays the list of SurfGear Inventory Items to the console as follows.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/

import java.util.Scanner;

public class IC14_SurfBoardShopDemo {

	public static void main(String[] args) {

		int choice;
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("************************************************************************");
			System.out.println("**                                                                    **");
			System.out.println("**                          WELCOME TO                                **");
			System.out.println("**                      ENCHILADA SURFBOARDS                          **");
			System.out.println("**               \"Where you get the whole enchilada!\"                 **");
			System.out.println("**                                                                    **");
			System.out.println("************************************************************************");
			System.out.println("** Please make a choice from the following options:                   **");
			System.out.println("** 1)  Add a new Surfboard to Inventory                               **");
			System.out.println("** 2)  Remove a Surfboard from Inventory                              **");
			System.out.println("** 3)  Update an existing Surfboard                                   **");
			System.out.println("** 4)  Display all Surfboards in Inventory                            **");
			System.out.println("** 5)  Exit                                                           **");
			System.out.println("************************************************************************");
			System.out.print(">> ");
			choice = keyboard.nextInt();

			// Choice 1: Add new surfboard
			System.out.print("Enter Brand: ");
			System.out.print("Enter Model: ");
			System.out.print("Enter Length: ");
			System.out.print("Enter Width: ");
			System.out.print("Enter Thickness: ");
			System.out.print("Enter Quantity: ");
			System.out.print("Enter Price $");

			// Choice 2: Remove existing surfboard
			System.out.print("\nWhich ID# would you like to remove? (or -1 to cancel) >> ");

			// Choice 3: Update existing surfboard
			System.out.print("Which ID# would you like to update? (or -1 to cancel) >> ");
			System.out.print("Enter Updated Brand: ");
			System.out.print("Enter Updated Model: ");
			System.out.print("Enter Updated Length: ");
			System.out.print("Enter Updated Width: ");
			System.out.print("Enter Updated Thickness: ");
			System.out.print("Enter Updated Quantity: ");
			System.out.print("Enter Updated Price $");

			// Choice 4: Display all surfboards
			System.out.println("~~~Current Surf Gear Inventory~~~\n");

			// Choice 5: Exit
			System.out.println("Aloha, enjoy the ride!");

		} while (choice != 5);

		// Close the scanner
		keyboard.close();
	}

}
