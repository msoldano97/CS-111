/********************************************
* AUTHOR: Matt Soldano
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
* toString for a quesadilla
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Quesadilla extends TacoStand{

	private String mMeat;
	private boolean mGuac;
	private boolean mSCream;
	
	public Quesadilla(double price, String name, String meat, boolean guac, boolean sCream)
	{
		super(price, name);
			mMeat = meat;
			mGuac = guac;
			mSCream = sCream;
	}
		public String getMeat()
		{
			return mMeat;
		}
		

		
		
		public boolean getGuac()
		{
			return mGuac;
		}
		public boolean getSCream()
		{
			return mSCream;
		}
		
		public void setMeat(String newMeat)
		{
			mMeat = newMeat;
		}
		public void setGuac(boolean newGuac)
		{
			mGuac = newGuac;
		}
		public void setSCream(boolean newSCream)
		{
			mSCream = newSCream;
		}
		
		public boolean equals(Quesadilla other)
		{
			if (!super.equals(other) || 
			(!mMeat.equals(other.mMeat)) || mGuac != other.mGuac || mSCream != other.mSCream)
			
			return false;
			
			return true;
		}
		
		public String toString()
		{
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			String output = mName + "\nA quesadilla with: -" + mMeat + "- " +
			(mGuac ? " -guacamole- " : "") + 
			(mSCream ? " -sour cream- " : "") + "\tPrice: " + 
			currency.format(mPrice);
			
			return output;
		}
		
		 
}

