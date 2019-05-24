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
* This is the abstract parent (base) class of bus and train 
*****************************************************************************
* ALGORITHM:
* 1. Make PublicTransport an abstract class.
* 2. Create instance variables for provider (String), baseFare (double), 
* allStops (String[ ]) and currentStop (int).   **Be sure that all instance 
* variables can be inherited by the two child classes**
* 3. and create accessors/mutators for all instance variables.
* 4. Create getters and setters for each instance variable.
* 5. Create an abstract method called goToNextStop that will be implemented 
* in the child classes.  The method should return a boolean which indicates 
* whether the move can be made (true) or (false) if the public transportation 
* is at its last stop.  Note the method is abstract in the parent, only the 
* children will implement it.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/
//Find out about what to do with the array

public abstract class PublicTransport {
	
	protected String mProvider;
	protected double mBaseFare;
	protected String[] mAllStops;
	protected int mCurrentStop;
	
	protected PublicTransport(String provider, double baseFare, String[] allStops, int currentStop)
	{
		mProvider = provider;
		mBaseFare = baseFare;
		mCurrentStop = currentStop;
		mAllStops = allStops;
	}
	
	public String getProvider()
	{
		return mProvider;
	}
	public double getBaseFare()
	{
		return mBaseFare;
	}
	public int getCurrentStop()
	{
		return mCurrentStop;
	}
	public String[] getAllStops()
	{
		return mAllStops;
	}
	
	public void setAllStops(String[] newAllStops)
	{
		mAllStops = newAllStops;
	}
	public void setProvider(String newProvider)
	{
		mProvider = newProvider;
	}
	public void setBaseFare(double newBaseFare)
	{
		mBaseFare = newBaseFare;
	}
	public void setCurrentStop(int newCurrentStop)
	{
		mCurrentStop = newCurrentStop;
	}
	
	public abstract boolean goToNextStop();
	
	public boolean equals(PublicTransport other)
	{
		if (!mProvider.equals(other.mProvider) || (mBaseFare != other.mBaseFare) || (mCurrentStop != other.mCurrentStop)
		|| (!mAllStops.equals(other.mAllStops)))
		return false;
		
		return true;
	}
	
	
	
}

