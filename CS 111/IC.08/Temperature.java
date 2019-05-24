/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC08
* LAST MODIFIED: 4/11/2019
********************************************/
/*****************************************************************************
	* IC08_Temperature
*****************************************************************************
* PROGRAM DESCRIPTION:
* To implement a class named Temperature that represents a temperature in 
* either Fahrenheit or Celsius.  Allow the degrees to have decimal places 
* (e.g. double) and use an String to store the unit. Specifically, the Temperature 
* class has the following member variables (a.k.a. fields or data):

The degrees (double)
The unit (String)
*****************************************************************************
* ALGORITHM:
* 1. Create the private varibles, degrees and units.
* 2. Create the following methods:
* 3. Create a new Temperature (given a value for degrees and unit) [parameterized constructor]
* 4.Create a new Temperature (given no parameters - initialize Temperature to 0.0 degrees Celsius) [default constructor]
* 5. Create a new Temperature (from another Temperature) [copy constructor]
* 6. getDegrees
* 7. getUnit
* 8. setDegrees
* 9. setUnit
* 10. toString - method to turn a Temperature into a string for display, e.g. display as "Temperature [0.0 degrees Celsius]"
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Temperature {
	private double mDegrees;
	private String mUnits; 
	
	public Temperature(double degrees, String units)
	{
		mDegrees = degrees;
		mUnits = units;
	
}
	public Temperature(Temperature other)
	{
		mDegrees = other.mDegrees;
		mUnits = other.mUnits;
	
}
	public Temperature()
	{
		mDegrees = 0.0;
		mUnits = "Celsius";
	}

	public double getDegrees()
	{
		return mDegrees;
	}
	public String getUnit()
	{
		return mUnits;
	}
	public void setDegrees(double newDegrees)
	{
		mDegrees = newDegrees;
	}
	public void setUnits(String newUnits)
	{
		mUnits = newUnits;
	}
	//confused on how to do the covertTo other unit in the parameters Just make a function that 
	//makes the fahreiheit and sees if its essentially the same as the celsius versions??
	public boolean equals(Temperature other)
	{
		if (mUnits.equals("Celsius"))
		{
			mDegrees = mDegrees * (9/5) + 32;
		}
		else if (mDegrees != other.mDegrees)
		return false;
		if (mUnits.equals("Fahrenheit"))
		{
			mDegrees = mDegrees - 32 / (9/5);
		}
			else if (mDegrees != other.mDegrees)
			return false;
			else 
			return true;
		
		
		if (mDegrees != other.mDegrees)
		return false;
		if (!mUnits.equals(other.mUnits))
		return false;
		else 
		return true;
	}
	
	public String toString()
	{
		String output = "Temperature [" + mDegrees + " degrees " + mUnits + "]";
		
		return output;
	}
		
		
	
}

