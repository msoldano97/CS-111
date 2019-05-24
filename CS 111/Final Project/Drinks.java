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
* toString for drinks
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;
	
	public class Drinks extends TacoStand {
	private String mFlavor;
	private String mSize;
	private String mIce;
	
	
	public Drinks(double price, String name, String flavor, String size, String ice) {
		super(price, name);
		
		mFlavor = flavor;
		mSize = size;
		mIce = ice;
	}
	
	public String getFlavor() {
		return mFlavor;
	}
	public String getSize() {
		return mSize;
	}
	public String getIce() {
		return mIce;
	}
	
	public void setFlavor(String flavor) {
		mFlavor = flavor;
	}
	
	public void setSize(String size) {
		mSize = size;
	}
	
	public void setIce(String ice) {
		mIce = ice;
	}
	
	public boolean equals(Drinks other)
	{
		if (!super.equals(other) || !mFlavor.equals(other.mFlavor) || !mSize.equals(other.mSize) ||
		!mIce.equals(other.mIce))
		return false;
		return true;
	}
		
	public String toString() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = mName + "\n" + mSize + ", " + mFlavor + " with " + ((mIce.equalsIgnoreCase("yes")) ? "ice" : "no ice") +
		"\t Price: " + currency.format(mPrice);
		return output;
		

	}
	
}

