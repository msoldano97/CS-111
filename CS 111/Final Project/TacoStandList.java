/********************************************
* AUTHOR: Matt Soldano, Elijad Pichler, Chandler Ott, German Gomez
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
* 1. Make a list class for adding, updating, and removing items in the demo
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public class TacoStandList {
	
	protected int mCount;
	protected TacoStand[] mList;
	protected static final int SIZE = 100;
	
	
	public TacoStandList()
	{
		mCount = 0;
		mList = new TacoStand[SIZE];	
	}

	public int getCount() {
		return mCount;
	}
	
	public boolean addItem(TacoStand newItem)
	{
		// If the menu (inventory) is full, can't add new items
		if (mCount >= SIZE)
			return false;
		
		// Otherwise, add the new item
		mList[mCount++] = newItem;
		return true;		
	}
	
	public boolean removeItem(int pos)
	{
		if (pos < 0 || pos>=mCount)
			return false;
			
		mList[pos] = null;
		for (int i = pos; i<mCount; i++)
			mList[i] = mList[i+1];	
		
		mCount--;
		return true;
	}
	
	public boolean updateItem(int pos, TacoStand updatedItem)
	{
		if (pos < 0 || pos>=mCount)
			return false;
			
			mList[pos] = updatedItem;
			return true;
	}
	
	public String toString()
	{
		
		String output = "~~~Taco Stand Menu~~~\n";
		for (int i = 0; i < mCount; i++)
			output += mList[i] + "\n";
			
			return output;
	}
	
}

	
	

