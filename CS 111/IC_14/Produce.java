/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/16/2019
********************************************/
/*****************************************************************************
*  Java Project Name: IC14_FoodJournal
*****************************************************************************
* PROGRAM DESCRIPTION:
* This is the other concrete child (derived) class.  Here are the specifications:
*****************************************************************************
* ALGORITHM:
* 1. Create instance variable for organic (boolean).  (true represents organic produce, 
* false represents non-organic)
* 2. Create accessor/mutator for organic
* 3. Create a constructor with 4 parameters (name, calories, carbohydrates, organic).  
* Initialize all instance variables.
* 4. Override the equals() method to compare all instance variables for equality.
* 5. Override the toString() method that displays all fields in the following format:
* '[Organic] Produce:  name, calories, carbohydrates, '
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/

public class Produce extends PaleoFood{
	
	private boolean mOrganic;
	
	public Produce(String name, int calories, int carbs, boolean organic)
	{
		super(name, calories, carbs);
		mOrganic = organic;
		
	}
	
	public boolean getOrganic()
	{
		return mOrganic;
	}
	
	public void setOrganic(boolean newOrganic)
	{
		mOrganic = newOrganic;
	}
	
	public boolean equals(Produce other)
	{
		if (!super.equals(other) || mOrganic != other.mOrganic)
		return false;
		
		return true;
		
	}
	
	public String toString()
	{
		String output = (mOrganic) ? "Organic Produce: " + mName + ", " + 
		mCalories + " calories, " + mCarbs + "g carbs" : "Produce: " + mName + ", " + 
		mCalories + " calories, " + mCarbs + "g carbs";
		
		return output;
	}
	
	
}

