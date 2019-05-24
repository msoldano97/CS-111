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
* 1. Make a simple class with a constructor, getters, setters, equals, and
* toString for a breakfast burrito
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Breakfast extends TacoStand {
	
	private String mMeat;
	private String mCheese;
	private String mPotato;
	private String mBeans;
	private String mSalsa;
	private String mEgg;
	
	public Breakfast(double price, String name, String meat, String egg, String potato,
	String beans, String salsa, String cheese)
	{
		super(price, name);
		mMeat = meat;
		mEgg = egg;
		mPotato = potato;
		mBeans = beans;
		mSalsa = salsa;
		mCheese = cheese;
	}
	
	public String getMeat()
	{
		return mMeat;
	}
	public String getCheese()
	{
		return mCheese;
	}
	public String getPotato()
	{
		return mPotato;
	}
	public String getBeans()
	{
		return mBeans;
	}
	public String getSalsa()
	{
		return mSalsa;
	}
	public String getEgg()
	{
		return mEgg;
	}
	
	public void setMeat(String newMeat)
	{
		mMeat = newMeat;
	}
	public void setCheese(String newCheese)
	{
		mCheese = newCheese;
	}
	public void setPotato(String newPotato)
	{
		mPotato = newPotato;
	}
	public void setBeans(String newBeans)
	{
		mBeans = newBeans;
	}
	public void setSalsa(String newSalsa)
	{
		mSalsa = newSalsa;
	}
	public void setEgg(String newEgg)
	{
		mEgg = newEgg;
	}
	
	public boolean equals(Breakfast other)
	{
		if (!super.equals(other) || !mMeat.equals(other.mMeat) || 
		!mCheese.equals(other.mCheese) || !mPotato.equals(other.mPotato) || !mBeans.equals(other.mBeans) || 
		!mSalsa.equals(other.mSalsa) || !mEgg.equals(other.mEgg))
		return false;
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		String output = mName + "\nA burrito with: " + " -" + mMeat + "- " + 
		(mEgg.equalsIgnoreCase("yes") ? " -egg- " : "") +
		((mCheese.equalsIgnoreCase("yes")) ? " -cheese- " : "") + ((mPotato.equalsIgnoreCase("yes")) ? " -potato- " : "") +
		((mBeans.equalsIgnoreCase("yes")) ? " -beans- " : "") + ((mSalsa.equalsIgnoreCase("yes")) ? " -salsa- " : "") + "\tPrice: " +
		currency.format(mPrice);
		
		return output;
	}
	
	
	
}

