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
* 
*****************************************************************************
* ALGORITHM:
* 1. 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/

import java.text.NumberFormat;

public class Wetsuit extends SurfGear {

	private String mSize;
	private String mThickness;
	
	public Wetsuit() {
		mId = 0;
		mBrand = "";
		mModel = "";
		mQuantity = 0;
		mPrice = 0.0;
		mSize = "";
		mThickness = "";
	}
	
	public Wetsuit(String brand, String model, String size, String thickness, int quantity, double price) {
		mId = sNextId++;
		mBrand = brand;
		mModel = model;
		mQuantity = quantity;
		mPrice = price;
		mSize = size;
		mThickness = thickness;
	}
	
	public String getSize() {
		return mSize;
	}
	
	public void setSize(String size) {
		mSize = size;
	}
	
	public String getThickness() {
		return mThickness;
	}
	
	public void setThickness(String thickness) {
		mThickness = thickness;
	}

	public boolean equals(Object o) {
		
		if (!(o instanceof Wetsuit)) 
			return false;
		
		Wetsuit other = (Wetsuit) o;
		return super.equals(other) &&
				mSize.equals(other.mSize) &&
				mThickness.equals(other.mThickness);
	}
	
	public String toString() {

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return "Wetsuit [Id#" + mId + ", Brand=" + mBrand + ", Model=" + mModel + ", Size=" + mSize + ", Thickness=" + mThickness
				+ " mm, Quantity=" + mQuantity + ", Price=" + currency.format(mPrice) +  "]";
	}
	
	
	
	
	
}
