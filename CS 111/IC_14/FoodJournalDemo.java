/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/16/2019
********************************************/
/*****************************************************************************
*  Java Project Name: IC14_FoodJournal
*****************************************************************************
* PROGRAM DESCRIPTION:
* in this demo, write a public static void main(String[ ] args) method that performs the following:
*****************************************************************************
* ALGORITHM:
* 1. Maintains an array of PaleoFood[ ]
* 2. Prompt the user with 3 options to record a new Meat (option 1) or 
* Produce (option 2) entry in the food journal.  Option 3 is to exit. Use a 
* switch statement
* 3. case 1: the user enters option 1 (Meat), prompt for name, calories, type 
* (1 for animal, 2 for seafood) and cooking temperature.  Create a new Meat 
* object and add it to the array.
* 4. case 2: the user enters option 2 (Produce), prompt for name, calories, 
* carbohydrates and organic (1 for organic, 0 for non-organic).  
* Create a new Produce object and add it to the array.
* 5. case 3: the user enters option 3 (quit), do the following:
* Loop through the array of PaleoFood and print each object (Meat or Produce) to the console.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* java.util.Scanner
* *****************************************************************************/
import java.util.Scanner;

public class FoodJournalDemo {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		PaleoFood[] entries = new PaleoFood[100];
		int count = 0;
		int decision = 0;
		do {
			System.out.println("~~~Welcome to the Food Journal~~~");
			System.out.println("Enter (1) to record meat\n" +
							   "Enter (2) to record produce\n" +
							   "Enter (3) to quit and display");
			decision = keyboard.nextInt();
			keyboard.nextLine();
							   
			switch (decision)
			{
				case 1:
				MeatType type;
				System.out.print("What is the name of the meat eaten? ");
				String mName = keyboard.nextLine();
				System.out.print("How many calories was it? ");
				int mCalories = keyboard.nextInt();
				keyboard.nextLine();
				System.out.print("Enter (1) for meat or (2) for seafood: ");
				int iType = keyboard.nextInt();
				keyboard.nextLine();
				if (iType == 1)
				type = MeatType.MEAT;
				
				else
				type = MeatType.SEAFOOD;
				
				System.out.print("Enter the cooking temperature: ");
				int cookingTemp = keyboard.nextInt();
				keyboard.nextLine();
				System.out.println();
				entries[count++] = new  Meat(mName, mCalories, type, cookingTemp);
				
				break;
				case 2:
				boolean organic = true;
				System.out.print("What is the name of the produce eaten? ");
				String pName = keyboard.nextLine();
				System.out.print("How many calories was it? ");
				int pCalories = keyboard.nextInt();
				keyboard.nextLine();
				System.out.print("How many carbohydrates ");
				int carbs = keyboard.nextInt();
				keyboard.nextLine();
				System.out.print("Enter (1) for organic or (2) for non-organic: ");
				int iOrganic = keyboard.nextInt();
				keyboard.nextLine();
				if (iOrganic == 1)
				organic = true;
				
				if (iOrganic == 2)
				organic = false;
				System.out.println();
				entries[count++] = new Produce(pName, pCalories, carbs, organic);
				
				break;
				
				default:
				System.out.println("Please enter a valid number");
				break;
			}
		}
			while (decision != 3);
		
		if (decision == 3)
		{
			System.out.println();
			System.out.println("~~~Food Recorded in Journal~~~");
			for (int i = 0; i < count; i++)
			{
				System.out.println(entries[i]);
			}
			return;
		}
		
		
		
}
}

