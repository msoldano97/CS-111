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
* 1. Create instance variable for numberOfDoors (int).
* 2. Create accessor/mutator for numberOfDoors.
* 3. Create a constructor with 3 parameters (manufacturer, year, numberOfDoors).  
* Initialize all instance variables.
* 4. Override the equals() method to compare all instance variables for equality.
* 5. Override the toString() method that displays all fields in the following format:
* Car:  manufacturer, year, numberOfDoors
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Car extends Vehicle {
	
private int mNumberOfDoors;

public Car(String manufacturer, int year, int numberOfDoors)
{
	super(manufacturer, year);
	mNumberOfDoors = numberOfDoors;
}

public int getNumberOfDoors()
{
	return mNumberOfDoors;
}

public void setNumberOfDoors(int newNumberOfDoors)
{
	mNumberOfDoors = newNumberOfDoors;
}

public boolean equals(Car other)
{
	if (!super.equals(other) || mNumberOfDoors != other.mNumberOfDoors)
	return false;
	
	return true;
}

public String toString()
{
	String output = "Car: " + mManufacturer + ", " + mYear + ", " + mNumberOfDoors + " doors";
	
	return output;
}



}

