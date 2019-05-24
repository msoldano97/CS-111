/********************************************
* AUTHOR: Matt Soldano, Elijad Pichler, Chandler Ott, German Gomez
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/16/2019
********************************************/
/*****************************************************************************
*  Final_Project
*****************************************************************************
* PROGRAM DESCRIPTION:
* The capstone team project (2–3 students per team) for this class involves 
* conceptualizing, designing, and developing a Java application for either 
* non-profit or commercial motivations.  The application should meet the set 
* of functional and non-functional requirements described below.  Teams will 
* follow a managed development process that results in well-designed, 
* well-documented software, as outlined below.
*****************************************************************************
* ALGORITHM:
* 1. Prompt user to select which item
* 2. Prompt user to add, update or remove an item
* 3. Successfully add, update or remove items and store them in an array
* 4. Once completed with one item return to main menu
* 5. Have this loop last until the user selects 'done'
* 6. Also have the ability to print the created inventory to the screen
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner
* *****************************************************************************/
import java.util.Scanner;

public class TacoStandDemo {
	
	public static void main (String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		int item;
		TacoStandList tsl = new TacoStandList();
		String meat, name, cheese;
		double price;
		
		System.out.println("~~~Welcome to your Taco Stand inventory!~~~");
		
		do {
		System.out.println("Select the number of an item");
		System.out.println("1. Tacos \n2. Drinks \n3. Breakfast \n4. Quesadillas \n5. Tamales \n6. Sides\n" +
		 "7. Tostadas \n8. Burritos \n9. Display Menu \n10. Done!");
		
		item = keyboard.nextInt();
		System.out.println();
		
		if(item == -1)
			break;
			
		keyboard.nextLine();
		switch (item) {
			case 1:		
			System.out.println("Select a number\n1)Add an Item\n2)Update an Item\n3)Remove an Item\n4)Show all");
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println();
			if (choice == 1) {
				System.out.println("Name of Taco:");
				name = keyboard.nextLine();
				System.out.println("Soft or hard shell?");
				String shell = keyboard.nextLine();
				System.out.println("Meat ~(Steak, chicken, tofu)?");
				meat = keyboard.nextLine();
				System.out.println("Hot sauce ~(hot, medium, mild, none)");
				String hotSauce = keyboard.nextLine();
				System.out.println("Cheese~ (yes or no)");
				cheese = keyboard.nextLine();
				System.out.println("Price:");
				price = keyboard.nextDouble();
				keyboard.nextLine();
				System.out.println();
				tsl.addItem( new Tacos(price, name, meat, shell, cheese, hotSauce));
			} else if (choice == 2) {
				System.out.println("What item do you want to update? Please input the index of the item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				System.out.println("Name of Taco:");
				name = keyboard.nextLine();
				System.out.println("Soft or hard shell?");
				String shell = keyboard.nextLine();
				System.out.println("Meat ~(Steak, chicken, tofu)?");
				meat = keyboard.nextLine();
				System.out.println("Hot sauce ~(hot, medium, mild, none)");
				String hotSauce = keyboard.nextLine();
				System.out.println("Cheese~ (yes or no)");
				cheese = keyboard.nextLine();
				System.out.println("Price:");
				price = keyboard.nextDouble();
				keyboard.nextLine();
				System.out.println();
				Tacos updatedTaco = new Tacos(price, name, meat, shell, cheese, hotSauce);
				tsl.updateItem(index, updatedTaco);
			} else if (choice == 3) {
				System.out.println("What item do you want to remove? Please input index of item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				tsl.removeItem(index);
				System.out.println();
			} else if (choice == 4) {
				for(int i = 0; i < tsl.getCount(); i++) 
					System.out.println(tsl.mList[i]);
					System.out.println();
			} else
			System.out.println("Error.");
			
				break;
				
			case 2:
			System.out.println("Select a number\n1)Add an Item\n2)Update an Item\n3)Remove an Item\n4)Show all");
			choice = keyboard.nextInt();
			keyboard.nextLine();
			if (choice == 1) {
				System.out.println("Name of Drink:");
				name = keyboard.nextLine();
				System.out.println("Sizes ~(Large, Medium, Small)?");
				String size = keyboard.nextLine();
				System.out.println("drinks ~ (Coke, Rootbeer, Horchata, water)");
				String flavor = keyboard.nextLine();
				System.out.println("Ice (yes or no)");
				String ice = keyboard.nextLine();				
				System.out.println("Price of drink:");
				price = keyboard.nextDouble();
				keyboard.nextLine();
				System.out.println();
				tsl.addItem( new Drinks(price, name, flavor, size, ice));
			} else if (choice == 2) {
				System.out.println("What item do you want to update? Please input the index of the item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				System.out.println("Name of Drink:");
				name = keyboard.nextLine();
				System.out.println("Sizes ~(Large, Medium, Small)?");
				String size = keyboard.nextLine();
				System.out.println("drinks ~ (Coke, Rootbeer, Horchata, water)");
				String flavor = keyboard.nextLine();
				System.out.println("Ice (yes or no)");
				String ice = keyboard.nextLine();
				System.out.println("Price of drink:");
				price = keyboard.nextDouble();
				keyboard.nextLine();
				System.out.println();
				tsl.addItem( new Drinks(price, name, flavor, size, ice));
				
			} else if (choice == 3) {
				System.out.println("What item do you want to remove? Please input index of item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				tsl.removeItem(index);
				System.out.println();
			} else if (choice == 4) {
				for(int i = 0; i < tsl.getCount(); i++) 
					System.out.println(tsl.mList[i]);
					System.out.println();
			} else
			System.out.println("Error.");
				
				break;
				
			
			case 3: 
			
			System.out.println("Select a number\n1)Add an Item\n2)Update an Item\n3)Remove an Item\n4)Show all");
			choice = keyboard.nextInt();
			keyboard.nextLine();
			if (choice == 1) {
			System.out.println("Name of Breakfast item:");
			name = keyboard.nextLine();
			System.out.println("Choice of Meat: (Fish, Steak, Chicken, Pork)");
			meat = keyboard.nextLine();
			System.out.println("Eggs (Yes or No)");
			String egg = keyboard.nextLine();
			System.out.println("Potatoes (Yes or No)");
			String potato = keyboard.nextLine();
			System.out.println("Beans (Yes or No)");
			String beans = keyboard.nextLine();
			System.out.println("Salsa (Yes or No)");
			String salsa = keyboard.nextLine();
			System.out.println("Cheese (Yes or No)");
			cheese = keyboard.nextLine();
			System.out.println("Price of Breakfast:");
			price = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println();
			tsl.addItem( new Breakfast(price, name, meat, egg, potato, beans, salsa, cheese));
			} else if (choice == 2) {
				System.out.println("What item do you want to update? Please input the index of the item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
			System.out.println("Name of Breakfast item:");
			name = keyboard.nextLine();
			System.out.println("Choice of Meat: (Ham, Beef, Chorizo, Bacon, Nopal)");
			meat = keyboard.nextLine();
			System.out.println("Eggs (Yes or No)");
			String egg = keyboard.nextLine();
			System.out.println("Potatoes (Yes or No)");
			String potato = keyboard.nextLine();
			System.out.println("Beans (Yes or No)");
			String beans = keyboard.nextLine();
			System.out.println("Salsa (Yes or No)");
			String salsa = keyboard.nextLine();
			System.out.println("Cheese (Yes or No)");
			cheese = keyboard.nextLine();
			System.out.println("Price of Breakfast:");
			price = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println();
			tsl.addItem( new Breakfast(price, name, meat, egg, potato, beans, salsa, cheese));
			} else if (choice == 3) {
				System.out.println("What item do you want to remove? Please input index of item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				tsl.removeItem(index);
				System.out.println();
			} else if (choice == 4) {
				for(int i = 0; i < tsl.getCount(); i++) 
					System.out.println(tsl.mList[i]);
					System.out.println();
			} else
			System.out.println("Error.");

			break;
			
			case 4:
			System.out.println("Select a number\n1)Add an Item\n2)Update an Item\n3)Remove an Item\n4)Show all");
			choice = keyboard.nextInt();
			keyboard.nextLine();
			if (choice == 1) {
			System.out.println("Name of Quesadilla:");
			name = keyboard.nextLine();
			System.out.println("Choice of Meat: (Fish, Steak, Chicken, Pork)");
			meat = keyboard.nextLine();
			System.out.println("Guacamole (Yes or No)");
			boolean guac = keyboard.nextLine().equalsIgnoreCase("yes");
			System.out.println("Sour Cream (Yes or No)");
			boolean sCream = keyboard.nextLine().equalsIgnoreCase("yes");
			System.out.println("Price of Quesadilla:");
			price = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println();
			tsl.addItem( new Quesadilla(price, name, meat, guac, sCream));
			} else if (choice == 2) {
				System.out.println("What item do you want to update? Please input the index of the item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
			System.out.println("Name of Quesadilla:");
			name = keyboard.nextLine();
			System.out.println("Choice of Meat: (Fish, Steak, Chicken, Pork)");
			meat = keyboard.nextLine();
			System.out.println("Guacamole (Yes or No)");
			boolean guac = keyboard.nextLine().equalsIgnoreCase("yes");
			System.out.println("Sour Cream (Yes or No)");
			boolean sCream = keyboard.nextLine().equalsIgnoreCase("yes");
			System.out.println("Price of Quesadilla:");
			price = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println();
			tsl.addItem( new Quesadilla(price, name, meat, guac, sCream));
	
			} else if (choice == 3) {
				System.out.println("What item do you want to remove? Please input index of item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				tsl.removeItem(index);
				System.out.println();
			} else if (choice == 4) {
				for(int i = 0; i < tsl.getCount(); i++) 
					System.out.println(tsl.mList[i]);
					System.out.println();
			} else
			System.out.println("Error.");
				break; 
			case 5:
			System.out.println("Select a number\n1)Add an Item\n2)Update an Item\n3)Remove an Item\n4)Show all");
			choice = keyboard.nextInt();
			keyboard.nextLine();
			if (choice == 1) {
			System.out.println("What do you want the name to be?");
			name = keyboard.nextLine();
			System.out.println("What filling do you want?");
			String filling = keyboard.nextLine();
			System.out.println("What do you want the price to be?");
			price = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println();
			tsl.addItem(new Tamales(price, name, filling));
			} else if (choice == 2) {
				System.out.println("What item do you want to update? Please input the index of the item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				System.out.println("What do you want the name to be?");
			name = keyboard.nextLine();
			System.out.println("What filling do you want?");
			String filling = keyboard.nextLine();
			System.out.println("What do you want the price to be?");
			price = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println();
			tsl.addItem(new Tamales(price, name, filling));
	
			} else if (choice == 3) {
				System.out.println("What item do you want to remove? Please input index of item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				tsl.removeItem(index);
				System.out.println();
			} else if (choice == 4) {
				for(int i = 0; i < tsl.getCount(); i++) 
					System.out.println(tsl.mList[i]);
					System.out.println();
			} else
			System.out.println("Error.");
		
			break;
		
			case 6:
			System.out.println("Select a number\n1)Add an Item\n2)Update an Item\n3)Remove an Item\n4)Show all");
			choice = keyboard.nextInt();
			keyboard.nextLine();
			if (choice == 1) {
				System.out.println("What do you want the name to be?");
			name = keyboard.nextLine();
			System.out.println("What size do you want? Please enter S, M, or L. (Small(S), Medium(M), or Large(L))");
			char sSize = keyboard.nextLine().charAt(0); 
			System.out.println("What do you want the price to be?");
			keyboard.nextLine();
			price = keyboard.nextDouble();
			System.out.println();	
			tsl.addItem(new Sides(price, name, sSize));
			} else if (choice == 2) {
				System.out.println("What item do you want to update? Please input the index of the item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				System.out.println("What do you want the name to be?");
			name = keyboard.nextLine();
			System.out.println("What size do you want? Please enter S, M, or L. (Small(S), Medium(M), or Large(L))");
			char sSize = keyboard.nextLine().charAt(0); 
			System.out.println("What do you want the price to be?");
			keyboard.nextLine();
			price = keyboard.nextDouble();
			System.out.println();
			tsl.addItem(new Sides(price, name, sSize));
	
			} else if (choice == 3) {
				System.out.println("What item do you want to remove? Please input index of item");
				int index = keyboard.nextInt();
				keyboard.nextLine();
				tsl.removeItem(index);
				System.out.println();
			} else if (choice == 4) {
				for(int i = 0; i < tsl.getCount(); i++) 
					System.out.println(tsl.mList[i]);
					System.out.println();
			} else
			System.out.println("Error.");
		
			break;
	
			//case 7: German's Stuff
			//case 8: German's Stuff
			
			case 9:
			for(int i = 0; i < tsl.getCount(); i++) 
		System.out.println(tsl.mList[i]);
			System.out.println();
		break;
		
			case 10:
			System.out.println("Thank you for using our software!");
			return;
		
			default:
				System.out.println("wrong");
			
			
			
		}
	} while(item != -1);

		

		
		
	}
}

