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
* none
* *****************************************************************************/


public abstract class SurfGear {
	
	protected String mBrand;
	protected String mModel;
	protected double mPrice;
	protected int mQuantity;
	protected int mID;
	protected static int sNextID = 10000;
	
	protected SurfGear(String brand, String model, int quantity, double price)
	{
		mID = sNextID++;
		mBrand = brand;
		mModel = model;
		mQuantity = quantity;
		mPrice = price;
	}
	
	public String getBrand()
	{
		return mBrand;
	}
	public String getModel()
	{
		return mModel;
	}
	public double getPrice()
	{
		return mPrice;
	}
	public int getQuantity()
	{
		return mQuantity;
	}
	public int getID()
	{
		return mID;
	}
	
	public void setBrand(String newBrand)
	{
		mBrand = newBrand;
	}
	public void setModel(String newModel)
	{
		mModel = newModel;
	}
	public void setPrice(double newPrice)
	{
		mPrice = newPrice;
	}
	public void setQuantity(int newQuantity)
	{
		mQuantity = newQuantity;
	}
	public void setID(int newID)
	{
		mID = newID;
	}
	
	
	public boolean equals(SurfGear other)
	{
		if (!mBrand.equalsIgnoreCase(other.mBrand) || !mModel.equalsIgnoreCase(other.mModel) || 
		mPrice != other.mPrice || mQuantity != other.mQuantity || mID != other.mID)
		return false;
		
		return true;
	}
	
	
	
}

