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
* 
* *****************************************************************************/

import java.text.NumberFormat;

public class Surfboard extends SurfGear {

	private double mLength;
	private double mWidth;
	private double mThickness;
	
	public Surfboard()
	{
		mId = 0;
		mBrand = "";
		mModel = "";
		mQuantity = 0;
		mPrice = 0.0;
		mLength = 0.0;
		mWidth = 0.0;
		mThickness = 0.0;
	}
	
	public Surfboard(String brand, String model, double length, double width, double thickness, int quantity, double price) {		
		mId = sNextId++;
		mBrand = brand;
		mModel = model;
		mQuantity = quantity;
		mPrice = price;
		mLength = length;
		mWidth = width;
		mThickness = thickness;
	}

	public double getLength() {
		return mLength;
	}

	public void setLength(double length) {
		mLength = length;
	}

	public double getWidth() {
		return mWidth;
	}

	public void setWidth(double width) {
		mWidth = width;
	}

	public double getThickness() {
		return mThickness;
	}

	public void setThickness(double thickness) {
		mThickness = thickness;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Surfboard)) 
			return false;		
		
		Surfboard other = (Surfboard) o;
		return super.equals(other) &&
				mLength == other.mLength &&
				mWidth == other.mWidth &&
				mThickness == other.mThickness;
	}

	public String toString() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return "Surfboard [Id#" + mId + ", Brand=" + mBrand + ", Model=" + mModel + ", Length=" + mLength + " ft, Width=" + mWidth + " in, Thickness=" + mThickness
				+ " in, Quantity=" + mQuantity + ", Price=" + currency.format(mPrice) +  "]";
	}
	
}
