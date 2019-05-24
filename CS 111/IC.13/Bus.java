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
* This one of the concrete child (derived) classes.  The following are the specifications:
*****************************************************************************
* ALGORITHM:
* 1. Create instance variable for route (int) and an accessor/mutator for it.
* 2. Create a constructor with 5 parameters (provider, route, baseFare, 
* allStops, currentStop).  Initialize all instance variables in the constructor.
* 3. Override the equals() method to compare all instance variables for equality.
* 4. Override the toString() method that displays all fields in the following format:
* Bus [provider, route, baseFare, allStops, currentStop]
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.text.NumberFormat;
* *****************************************************************************/
import java.text.NumberFormat;

public class Bus extends PublicTransport{
	
	private int mRoute;
	
	public Bus(String provider, double baseFare, String[] allStops, int currentStop, int route)
	{
		super(provider, baseFare, allStops, currentStop);
		mRoute = route;
	}
	
	public int getRoute()
	{
		return mRoute;
	}
	
	public void setRoute(int newRoute)
	{
		mRoute = newRoute;
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
	public boolean equals(Bus other)
	{
		if (!super.equals(other) || mRoute != other.mRoute)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
	
		String output = "Bus [" + mProvider + ", Route " + mRoute + ", " + currency.format(mBaseFare) + " base fare, Stops: [";
		
		for (int i = 0; i < mAllStops.length; i++)
		{
			output += (i < (mAllStops.length - 1)) ? mAllStops[i] + ", " : mAllStops[mAllStops.length - 1];
		}
		
		output += "], Current Stop: " + mAllStops[mCurrentStop] + "]";
		
		return output;
		
	} 
}

