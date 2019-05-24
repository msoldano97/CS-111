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
* 
*****************************************************************************
* ALGORITHM:
* 1. 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Number Format
* *****************************************************************************/
import java.text.NumberFormat;

public class Wetsuit extends SurfGear {
	
	private String mSize;
	private double mThickness;
	
	public Wetsuit(String brand, String model, int quantity, double price, String size, double thickness)
	{
		super(brand, model, quantity, price);
		mSize = size;
		mThickness = thickness;
		
	}
	
	public String getSize()
	{
		return mSize;
	}
	
	public double getThickness()
	{
		return mThickness;
	}
	
	public void setSize(String newSize)
	{
		mSize = newSize;
	}
	public void setThickness(double newThickness)
	{
		mThickness = newThickness;
	}
	
	public boolean equals(Wetsuit other)
	{
		if (!super.equals(other) || !mSize.equalsIgnoreCase(other.mSize) || mThickness != other.mThickness)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String output = "WetSuit [Id#" + mID + ", Brand:" + mBrand + ", Model:" + mModel + ", Size:" +
		mSize + ", Thickness:" + mThickness + " in., Quantity:" +
		mQuantity + ", Price:" + currency.format(mPrice);
	return output;
}
	
}

