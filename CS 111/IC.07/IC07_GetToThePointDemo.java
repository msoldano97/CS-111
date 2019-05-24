/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 3/29/2019
********************************************/
/*****************************************************************************
* IC07_GetToThePoint
*****************************************************************************
* PROGRAM DESCRIPTION:
* Show that everying in the data class works
*****************************************************************************
* ALGORITHM:
* 1. set two different points
* 2. set an origin point
* 3. test the equals operator
* 4. test the setters
* 5. test the distance formula
* 6. print to the screen the origin and the points
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/



public class IC07_GetToThePointDemo {
	
	public static void main (String args[]) {
		// Let's make 3 points using 3 constructors
		Point p1 = new Point(3,4);
		
		// Default constructor has empty parentheses
		Point origin = new Point();
		
		//copy constructor
		Point p2 = new Point(p1);
		
		System.out.println("Points the Same? " + p1.equals(p2));
		p2.setX(2);
		System.out.println("Points the Same? " + p1.equals(p2));
		System.out.println("Distance Between Points: " + p1.distanceTo(p2));
		System.out.println(origin);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}

