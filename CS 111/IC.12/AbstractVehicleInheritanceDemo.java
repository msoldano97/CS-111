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
* 1. Maintains an array of Vehicles (Vehicle[])
* 2. Creates 2 Boat objects (you provide the data for each object) and adds them to the array
* 3. Creates 2 Car objects (you provide the data for each object) and adds them to the array
* 4. Loop through the array and display each of the objects to the console.

*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class AbstractVehicleInheritanceDemo {
	
	public static void main (String args[]) {
		
		Vehicle[] vehicles = new Vehicle[4];
		int count = 0;
		
		vehicles[count++] = new Car("Tesla", 2019, 4);
		vehicles[count++] = new Car("Jeep", 2015, 4);
		
		vehicles[count++] = new Boat("Del Mar", 2017, 2);
		vehicles[count++] = new Boat("Arrr The Booty", 2017, 4);
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(vehicles[i]);
			System.out.println();
		}
		
		
		
	}
}

