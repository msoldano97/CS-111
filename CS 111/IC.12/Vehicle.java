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
* 1. Make Vehicle an abstract class (cannot be instantiated).
* 2. Create instance variables for manufacturer (String) and year (int).  
* **Be sure that all instance variables can be inherited by the two child classes**
* 3. Create accessors/mutators for all instance variables.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public abstract class Vehicle {
	
	protected String mManufacturer;
	protected int mYear;
	
	protected Vehicle(String manufacturer, int year)
	{
		mManufacturer = manufacturer;
		mYear = year;
	}
	
	protected String getManufacturer()
	{
		return mManufacturer;
	}
	
	protected int getYear()
	{
		return mYear;
	}
	
	protected void setManufacturer(String newManufacturer)
	{
		mManufacturer = newManufacturer;
	}
	
	protected void setYear(int newYear)
	{
		mYear = newYear;
	}
	
	
}

