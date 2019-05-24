/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC12
* LAST MODIFIED: 5/3/2019
********************************************/
/*****************************************************************************
*  IC12_ComicInheritance
*****************************************************************************
* PROGRAM DESCRIPTION:
* Define a base (parent) class named Comic, which will store information 
* about a series, including information about the name (e.g. Spider Man), 
* the publisher (e.g. Marvel), the serialized date (e.g. 1962) and the sales 
* (e.g. $378,000,000). Then create a class named Manga, to represent a Japanese 
* comic that inherits the properties from the Comic class and adds information 
* about the media type (e.g. Magazine or Paperback).  Finally, create a class 
* named Anime (animated comics, as an art form) that also inherits from Comic, 
* and includes information about the running time (e.g. 75 minutes).
*****************************************************************************
* ALGORITHM:
* 1. create protected variables for name, publisher, sales, and date
* 2. Parameterized constructor (name, publisher, serialized, sales)
* 3. getters and setters
* 4. equals and toString()
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.text.NumberFormat;
* *****************************************************************************/
import java.text.NumberFormat;

public class Comic {
	
	protected String mName;
	protected String mPublisher;
	protected double mSales;
	protected int mDate;
	
	
	public Comic(String name, String publisher, double sales, int date)
	{
		mName = name;
		mPublisher = publisher;
		mSales = sales;
		mDate = date;	
	}
	
	public Comic(Comic other)
	{
		mName = other.mName;
		mPublisher = other.mPublisher;
		mSales = other.mSales;
		mDate = other.mDate;
	}
	
	public String getName()
	{
		return mName;
	}
	public String getPublisher()
	{
		return mPublisher;
	}
	public double getSales()
	{
		return mSales;
	}
	public int getDate()
	{
		return mDate;
	}
	
	public void setName(String newName)
	{
		mName = newName;
	}
	public void setPublisher(String newPublisher)
	{
		mPublisher = newPublisher;
	}
	public void setSales(double newSales)
	{
		mSales = newSales;
	}
	public void setDate(int newDate)
	{
		mDate = newDate;
	}
	
	public boolean equals(Comic other)
	{
		if (!mName.equalsIgnoreCase(other.mName) || !mPublisher.equalsIgnoreCase(other.mPublisher) ||
		mSales != other.mSales || mDate != other.mDate)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String output = "Comic [Name: " + mName + "; Publisher: " + mPublisher +
		"; Sales: " + currency.format(mSales) + "; Date: " + mDate + "]";
		
		return output;
		
	}
	
	
	
}

