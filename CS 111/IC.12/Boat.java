/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC12
* LAST MODIFIED: 5/7/2019
********************************************/
/*****************************************************************************
*  IC12_AbstractVehicleInheritance
*****************************************************************************
* PROGRAM DESCRIPTION:
* In this assignment, you will be creating an application for Vehicle Inventory, 
* which will keep track of a company’s collection of Vehicles, which include 
* Boats and Cars.  You will be creating 3 classes to represent this data: 
* Vehicle.java, Boat.java and Car.java.  For our purposes, Vehicle will be 
* the abstract base (parent) class and Boat and Car will be the concrete
* derived (child) classes.
*****************************************************************************
* ALGORITHM:
* 1. Create instance variable for numberOfCabins (int).
* 2. Create accessor/mutator for numberOfCabins.
* 3. Create a constructor with 3 parameters (manufacturer, year, numberOfCabins).  
* Initialize all instance variables.
* 4. Override the equals() method to compare all instance variables for equality.
* 5. Override the toString() method that displays all fields in the following format:
* Boat:  manufacturer, year, numberOfCabins 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Boat extends Vehicle {
	
	private int mNumberOfCabins;
	
	public Boat(String manufacturer, int year, int numberOfCabins)
	{
		super(manufacturer, year);
		mNumberOfCabins = numberOfCabins;
	}
	
	public int getNumberOfCabins()
	{
		return mNumberOfCabins;
	}
	
	public void setNumberOfCabins(int newNumberOfCabins)
	{
		mNumberOfCabins = newNumberOfCabins;
	}
	
	public boolean equals(Boat other)
	{
		if (!super.equals(other) || mNumberOfCabins != other.mNumberOfCabins)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		String output = "Boat: " + mManufacturer + ", " + mYear + ", " + mNumberOfCabins + " cabins";
		
		return output;
	}
	
}

