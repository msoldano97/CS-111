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
* toString for a tamale
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Tamales extends TacoStand{
	
	private String mFilling;
	
	public Tamales(double price, String name, String filling)
	{
		super(price, name);
		mFilling = filling;
	}
	public void setFilling(String newFilling)
	{
		mFilling = newFilling;
	}
	public String getFilling()
	{
		return mFilling;
	}
	
	public boolean equals(Tamales other)
	{
		if (!super.equals(other) || !mFilling.equals(other.mFilling))
		return false;
		
		return true;
	}
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = "[Item: " + mName + ", Filling: " + mFilling + "\t Price: " + 
		currency.format(mPrice) + "]";
		return output;
	}
	
}
