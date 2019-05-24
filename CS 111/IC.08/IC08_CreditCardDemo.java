/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC08
* LAST MODIFIED: 4/5/2019
********************************************/
/*****************************************************************************
* IC08_CreditCard
*****************************************************************************
* PROGRAM DESCRIPTION:
* To demonstrate that your class performs as specified by instantiating at least 
* one new CreditCard object in the main method and testing each of the mutator 
* (setter) methods
*****************************************************************************
* ALGORITHM:
* 1. Make two testCards and fill out all their info
* 2. Test the equals and print the cards
* 3. Test the modifiers by changing the cards to be the same
* 4. Print the new cards to the screen
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public class IC08_CreditCardDemo {
	
	public static void main (String args[]) {
		
		CreditCard testCard1 = new CreditCard("Matthew Soldano", "11/12", "Visa", "2345678901234567", "123");
		CreditCard testCard2 = new CreditCard("John Soldano", "11/12", "Visa", "2345678901234567", "123"); 
		System.out.println("Cards equal? " + testCard1.equals(testCard2));
		
		System.out.println(testCard1);
		System.out.println();
		System.out.println(testCard2);
		System.out.println();
		System.out.println("EDITED");
		System.out.println();
		testCard1.setCardHolder("John Soldano");
		System.out.println(testCard1);
		System.out.println();
		System.out.println(testCard2);
		System.out.println("Cards equal? " + testCard1.equals(testCard2));
	}
}

