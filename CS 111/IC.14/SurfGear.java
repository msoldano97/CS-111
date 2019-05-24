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
* This assignment is designed to get us closer to success for the final capstone project.  
* In this code, we will be implementing the 3 classes below (1 abstract parent, 2 concrete 
* children).
*****************************************************************************
* ALGORITHM:
* 1. protected variables
* 2. protected constructor
* 3. getters/setters/equals
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/

public abstract class SurfGear {

	protected int mId;
	protected String mBrand;
	protected String mModel;
	protected int mQuantity;
	protected double mPrice;
	
	protected static int sNextId = 10000;

	public int getId() {
		return mId;
	}
	
	public String getBrand() {
		return mBrand;
	}

	public void setBrand(String brand) {
		mBrand = brand;
	}

	public String getModel() {
		return mModel;
	}

	public void setModel(String model) {
		mModel = model;
	}

	public int getQuantity() {
		return mQuantity;
	}

	public void setQuantity(int quantity) {
		mQuantity = quantity;
	}

	public double getPrice() {
		return mPrice;
	}

	public void setPrice(double price) {
		mPrice = price;
	}

	public boolean equals(Object o) {
		
		if (!(o instanceof SurfGear)) 
			return false;		
		
		SurfGear other = (SurfGear) o;
		return mId == other.mId &&
				mBrand.equals(other.mBrand) &&
				mModel.equals(other.mModel) &&
				mQuantity == other.mQuantity &&
				mPrice == other.mPrice;
	}
	
}
