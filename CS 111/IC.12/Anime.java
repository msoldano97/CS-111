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
* 1. The Anime class should inherit from the Comic class and add one more member 
* variable to keep track of the running time of the animation (e.g. 20 minutes)
* 2. Build a parameterized constructor (name, publisher, serialized, sales, runningTime)

*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.text.DecimalFormat;
* import java.text.NumberFormat;
* *****************************************************************************/
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Anime extends Manga {
	
	protected double mRunningTime;
	
	public Anime(String name, String publisher, double sales, int date, String mediaType, double runningTime)
	{
		super(name, publisher, sales, date, mediaType);
		mRunningTime = runningTime;
	}
	
	public double getRunnningTime()
	{
		return mRunningTime;
	}
	public void setRunningTime(double newRunningTime)
	{
		mRunningTime = newRunningTime;
	}
	
	public boolean equals(Anime other)
	{
		if (!super.equals(other) || mRunningTime != other.mRunningTime)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		DecimalFormat twoDs = new DecimalFormat("###.##");
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = "Anime [Name: " + mName + "; Publisher: " + mPublisher +
		"; Sales: " + currency.format(mSales) + "; Date: " + mDate + "; Media Type: " + mMediaType + 
		"; Running Time: " + twoDs.format(mRunningTime) + "mins]";
		
		return output;
	}
	
}

