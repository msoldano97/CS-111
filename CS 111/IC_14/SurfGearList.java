/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/17/2019
********************************************/
/*****************************************************************************
*  IC14_SurfboardShopPart2
*****************************************************************************
* PROGRAM DESCRIPTION:
* This class will be used to add, remove and udate the surfGear array.
*****************************************************************************
* ALGORITHM:
* 1. Download zip file of add and count surfGear
* 2. Create remove surfGear class
* 3. Create update surfGear class
* 4. Create toString surfGear class
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/

public class SurfGearList {

	private int mCount;
	private SurfGear[] mList;
	private static final int SIZE = 100;
	
	public SurfGearList()
	{
		mCount = 0;
		mList = new SurfGear[SIZE];		
	}

	public int getCount() {
		return mCount;
	}
	
	public boolean addSurfGear(SurfGear newGear)
	{
		// If the list (inventory) is full, can't add new gear
		if (mCount >= SIZE)
			return false;
		
		// Otherwise, add the new gear
		mList[mCount++] = newGear;
		return true;		
	}
	
	public boolean removeSurfGear(int pos)
	{
		if (pos < 0 || pos >= mCount)
		return false;
		
		for (int i = pos; i < mCount; i++)
			mList[i] = mList[i+1];
		
		mCount--;
		
		return true;
	}
	
	public boolean updateSurfGear(int pos, SurfGear updatedGear)
	{
		if (pos < 0 || pos >= mCount)
		return false;
		
		mList[pos] = updatedGear;
		
		return true;
		
	}
	// TODO: Write methods for removeSurfGear and updateSurfGear
	public String toString()
	{
		String output = "~~~Surf Gear List~~~\n";
		for (int i = 0; i < mCount; i++)
		{
			output += mList[i] + "\n";
		}
		
		return output;
	}
	
}
