/********************************************
* AUTHOR: Chandler Ott
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
* 1. Make a simple class with a constructor, getters, setters, equals, and
* toString for a side
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Sides extends TacoStand{
	
	private char mSSize;
	
	public Sides(double price, String name, char sSize)
	{
		super(price, name);
		mSSize = sSize; //size of side...small, medium, large beans, rice, chips etc.
	}
	public void setSSize(char newSSize)
	{
		mSSize = newSSize;
	}
	public char getSSize()
	{
		return mSSize;
	}
	//In demo, when accepting user input, make it upper case and have
	//an error case if they put in something besides S,M or L!
	
	public boolean equals(Sides other)
	{
		if (!super.equals(other) || mSSize != other.mSSize)
		return false;
		
		return true;
	}
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = "[Item: " + mName + ", Size: " + mSSize + "\t Price: " + currency.format(mPrice) + "]";
		return output;
	}
	
	
	
}
