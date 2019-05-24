/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/10/2019
********************************************/
/*****************************************************************************
*  IC13_SurfboardShop
*****************************************************************************
* PROGRAM DESCRIPTION:
* The Surfboard class will have a toString method that has the following format:
* "Surfboard [Id#" + mID + ", Brand:" + mBrand + ", Model:" + mModel +
		", Length:" + mLength + " ft., Width:" + mWidth + " in., Thickness:" + mThickness 
		* + " in., Quantity:" +
		mQuantity + ", Price:" + currency.format(mPrice);
*****************************************************************************
* ALGORITHM:
* 1. constructor
* 2. getters/setter/eqauls/toString
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* NumberFormat
* *****************************************************************************/
import java.text.NumberFormat;


public class Surfboard extends SurfGear {
	
	private double mLength;
	private double mThickness;
	private double mWidth;
	
	public Surfboard(String brand, String model, int quantity, double price, double length, double width, double thickness)
	{
		super(brand, model, quantity, price);
		mLength = length;
		mWidth = width;
		mThickness = thickness;
	}
	
	public double getLength()
	{
		return mLength;
	}
	public double getWidth()
	{
		return mWidth;
	}
	public double getThickness()
	{
		return mThickness;
	}
	
	public void setLength(double newLength)
	{
		mLength = newLength;
	}
	public void setWidth(double newWidth)
	{
		mWidth = newWidth;
	}
	public void setThickness(double newThickness)
	{
		mThickness = newThickness;
	}
	
	public boolean equals(Surfboard other)
	{
		if (!super.equals(other) || mWidth != other.mWidth || mLength != other.mLength || mThickness != other.mThickness)
		return false;
		
		return true;
		
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		String output = "Surfboard [Id#" + mID + ", Brand:" + mBrand + ", Model:" + mModel +
		", Length:" + mLength + " ft., Width:" + mWidth + " in., Thickness:" + mThickness + " in., Quantity:" +
		mQuantity + ", Price:" + currency.format(mPrice);
		
		return output;
	}
	
	
}

