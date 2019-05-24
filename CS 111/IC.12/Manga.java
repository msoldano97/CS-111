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
* 1. he Manga class should inherit from the Comic class and add one more member 
* variable to maintain its media type (e.g. Magazine or Paperback).
* 2. Parameterized constructor (name, publisher, serialized, sales, media type)
* 3. getter, setter, equals, toString()

*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.text.NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;

public class Manga extends Comic {
	
	protected String mMediaType;
	
	public Manga(String name, String publisher, double sales, int date, String mediaType)
	{
		super(name, publisher, sales, date);
		mMediaType = mediaType;
	}
	
	public String getMediaType()
	{
		return mMediaType;
	}
	
	public void setMediaType(String newMediaType)
	{
		mMediaType = newMediaType;
	}
	
	public boolean equals(Manga other)
	{
		if (!super.equals(other) || !mMediaType.equalsIgnoreCase(other.mMediaType))
		return false;
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String output = "Manga [Name: " + mName + "; Publisher: " + mPublisher +
		"; Sales: " + currency.format(mSales) + "; Date: " + mDate + "; Media Type: " + mMediaType + "]";
		
		return output;
	
	}
}

