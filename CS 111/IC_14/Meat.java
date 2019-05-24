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
* This one of the concrete child (derived) classes.  Here are the specifications:
*****************************************************************************
* ALGORITHM:
* 1. Create instance variable for type (enum MeatType) (only options are MEAT or SEAFOOD).
* 2. Create accessor/mutator for type.
* 3. Create instance variable for cookingTemp (the temperature, in Fahrenheit, 
* at which the meat should be cooked before consumption.  Some meat (e.g. sashimi) 
* can be eaten raw, which would be 0 for cookingTemp) (int)
* 4. Create accessor/mutator for cookingTemp
* 5. Create a constructor with 4 parameters (name, calories, type, cookingTemp).  
* Initialize all instance variables.  For Meat, the carbohydrates should be initialized 
* to 0 (no carbs).  Carbohydrates should not appear in the constructor parameter list.
* 6. Override the equals() method to compare all instance variables for equality.
* 7. Override the toString() method that displays all fields in the following format:
* "Type: name, calories, carbohydrates, cookingTemp"

*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public class Meat extends PaleoFood{

	private MeatType mType;
	private int mCookingTemp;
	
	public Meat(String name, int calories, MeatType type, int cookingTemp)
	{
		super(name, calories, 0);
		mType = type;
		mCookingTemp = cookingTemp;
	}
	
	public MeatType getType()
	{
		return mType;
	}
	public int getCookingTemp()
	{
		return mCookingTemp;
	}
	
	public void setType(MeatType newType)
	{
		mType = newType;
	}
	public void setCookingTemp(int newCookingTemp)
	{
		mCookingTemp = newCookingTemp;
	}
	
	public boolean equals(Meat other)
	{
		if (!super.equals(other) || mCookingTemp != other.mCookingTemp ||
		mType != other.mType)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		String output = (mType == MeatType.MEAT) ? ("Meat: " + mName + ", " +
		mCalories + " calories, 0g carbs, " + mCookingTemp + " degrees F")
		: ("Seafood: " + mName + ", " + mCalories + " calories, 0g carbs, " + mCookingTemp + " degrees F");
		
		return output;
	}
	
}

