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
* 1. Make Abstract Class
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public abstract class TacoStand {
	

	protected double mPrice;
	protected String mName;
	protected static int sCOUNT = 0;
	protected TacoStand(double price, String name) {
		mPrice = price;
		mName = name;
		sCOUNT++;
	}
	
	public double getPrice()
	{
		return mPrice;
	}
	public String getName()
	{
		return mName;
	}
	
	public void setPrice(double newPrice)
	{
		mPrice = newPrice;
	}
	public void setName(String newName)
	{
		mName = newName;
	}
	
	
	public boolean equals(TacoStand other)
	{
		if (mPrice != other.mPrice || !mName.equals(other.mName))
		return false;
		
		return true;
	}
	
}



