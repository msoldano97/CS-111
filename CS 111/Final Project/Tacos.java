/********************************************
* AUTHOR: Elijad Pichler
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
* 1. Make a simple class with a constructor, getters, setters, equals, and
* toString for a taco
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Tacos extends TacoStand{
	private String mMeat;
	private String mShell;
	private String mCheese;
	private String mHotSauce;
	
	public Tacos(double price, String name, String meat,
	String shell, String cheese, String hotSauce) {
		super(price, name);
		mMeat = meat;
		mShell = shell;
		mCheese = cheese;
		mHotSauce = hotSauce;
		
	}
	
	public String getMeat() {
		return mMeat;
	}
	
	public String getShell() {
		return mShell;
	}
	
	public String getHotSauce() {
		return mHotSauce;
	}
	
	public String getCheese() {
		return mCheese;
	}
	
	public void setMeat(String newMeat) {
		mMeat = newMeat;
	}
	
	public void setShell(String newShell) {
		mShell = newShell;
	}
	
	public void setHotSauce(String newHotSauce) {
		mHotSauce = newHotSauce;
	}
	public void setCheese(String newCheese)
	{
		mCheese = newCheese;
	}
	
	public boolean equals(Tacos other)
	{
		if (!super.equals(other) || !mMeat.equals(other.mMeat) || !mShell.equals(other.mShell) ||
		!mHotSauce.equals(other.mHotSauce) || !mCheese.equals(other.mCheese))
		return false;
		
		return true;
	}
	
	public String toString() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output =  mName + "\n" + mShell +" shell, " + mMeat + ", taco with " + mHotSauce +
		" sauce and " + ((mCheese.equalsIgnoreCase("Yes")) ? " with cheese" : " with no cheese") + 
		"\t Price: " + currency.format(mPrice); 
		
		return output;
	}
}   


