/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/16/2019
********************************************/
/*****************************************************************************
*  IC13_PublicTransport
*****************************************************************************
* PROGRAM DESCRIPTION:
* This is the other concrete child (derived) class.  The follwoing are the specifications:
*****************************************************************************
* ALGORITHM:
* 1. Create instance variable for number (int) and an accessor/mutator for it.
* 2. [4 points] Create a constructor with 5 parameters (provider, number, baseFare, 
* allStops, currentStop).  Initialize all instance variables in the constructor.
* 3. Override the equals() method to compare all instance variables for equality.
* 4. Override the toString() method that displays all fields in the following format:
* Train [provider, number, baseFare, allStops, currentStop]
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.text.NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Train extends PublicTransport{
	
	private int mNumber;
	
	public Train(String provider, double baseFare, String[] allStops, int currentStop, int number)
	{
		super(provider, baseFare, allStops, currentStop);
		mNumber = number;
	}
	
	public int getNumber()
	{
		return mNumber;
	}
	
	public void setNumber(int newNumber)
	{
		mNumber = newNumber;
	}
	
	public boolean equals(Train other)
	{
		if (!super.equals(other) || mNumber != other.mNumber)
		return false;
		
		return true;
	}
	
	public boolean goToNextStop()
	{
		
		for (int i = 0; i < mAllStops.length; i++)
		{
			if (mAllStops[mCurrentStop].equals(mAllStops[mAllStops.length - 1]))
		return false;
	}
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = "Train [" + mProvider + ", " + mNumber + ", " + currency.format(mBaseFare) +
		" base fare, Stops: [";
		
		for (int i = 0; i < mAllStops.length; i++)
		{
			output += (i < (mAllStops.length - 1)) ? mAllStops[i] + ", " : mAllStops[mAllStops.length - 1];
		}
		
		output += "], Current Stop: " + mAllStops[mCurrentStop] + "]";
		
		return output;
	}
}

