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
* This is the abstract parent (base) class of the other two.  Here are the specifications:
*****************************************************************************
* ALGORITHM:
* 1. Make PaleoFood an abstract class (cannot be instantiated).\
* 2. Create instance variables for name (String), calories (int) and carbohydrates (int).   
* **Be sure that all instance variables can be inherited by the two child classes**
* 3. Create accessors/mutators for all instance variables.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public abstract class PaleoFood {
	
	protected String mName;
	protected int mCalories;
	protected int mCarbs;
	
	protected PaleoFood(String name, int calories, int carbs)
	{
		mName = name;
		mCalories = calories;
		mCarbs = carbs;
	}
	
	public String getName()
	{
		return mName;
	}
	public int getCalories()
	{
		return mCalories;
	}
	public int getCarbs()
	{
		return mCarbs;
	}
	
	public void setName(String newName)
	{
		mName = newName;
	}
	public void setCalories(int newCalories)
	{
		mCalories = newCalories;
	}
	public void setCarbs(int newCarbs)
	{
		mCarbs = newCarbs;
	}
	
	public boolean equals(PaleoFood other)
	{
		if (!mName.equals(other.mName) || mCalories != other.mCalories ||
		mCarbs != other.mCarbs)
		return false;
		
		return true;
	}
	
	
}

