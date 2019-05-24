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
* Design and implement the Java code for a class to represent a credit card.  

Its attributes (member or instance variables) are:

network - An String consisting of one of the 4 major networks (Amex, Discover, Mastercard or Visa)
number - The credit card number (String) 
cardHolder - The name of the credit card holder (owner) (String)
expirationDate - The expiration date of the credit card (String)
securityCode - The security code associated with the card (int)

*****************************************************************************
* ALGORITHM:
* 1. Create a new CreditCard (given a network, card holder name, number, expiration date and security
* code) [constructor]
* 2. Make the follwing methods:
* 3. GetCardHolder
* 4. GetExpirationDate
* 5. getNetwork
* 6. getNumber
* 7. setCardHolder
* 8. equals [method to check if one CreditCard is the same as another]
* 9. toString [method to turn CreditCard into a strong for display].
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public class CreditCard {
	
	private String mCardHolder, mExpirationDate, mNetwork, mNumber, mSecurityCode;
		
		public CreditCard(String cardHolder, String expirationDate, String network, String number, String securityCode)
		{
			mCardHolder = cardHolder;
			mExpirationDate = expirationDate;
			mNetwork = network;
			mNumber = number;
			mSecurityCode = securityCode;
		}

		public String getCardHolder()
		{
			return mCardHolder;
		}
		public String getExpirationDate()
		{
			return mExpirationDate;
		}
		public String getNetwork()
		{
			return mNetwork;
		}
		public String getNumber()
		{
			return mNumber;
		}
		public void setCardHolder(String newCardHolder)
		{
			mCardHolder = newCardHolder;
		}
		public boolean equals(CreditCard other)
		{
			if (!mCardHolder.equals(other.mCardHolder))
			return false;
			if (!mExpirationDate.equals(other.mExpirationDate))
			return false;
			if (!mNetwork.equals(other.mNetwork))
			return false;
			if (!mNumber.equals(other.mNumber))
			return false;
			if (!mSecurityCode.equals(other.mSecurityCode))
			return false;
			else 
			return true;
		}
		
		public String toString()
		{
			String output = "Credit Card[" + mCardHolder+ "," + mNetwork + "," + mExpirationDate + ",";
			int stars = mNumber.length();
			// 16 digits or 15 digits
			// How to print stars for all but the last four digits
			for (int s = 1; s <= stars - 4; s++)
			output += "*";
			
			// now need to append the last four digits
			output += mNumber.substring(stars - 4);
			output += "]";
			
			return output;
		}
}

