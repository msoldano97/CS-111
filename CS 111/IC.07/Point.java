/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 3/29/2019
********************************************/
/*****************************************************************************
* IC07_Point
*****************************************************************************
* PROGRAM DESCRIPTION:
* Implement a class named Point that represents a two-dimensional point, with an x and y value.  
* The Point class should have the following member variables (a.k.a. fields or instance variables):
* x (the x-value of the point, as a whole number)
* y (the y-value of the point, as a whole number)
* 
* The Point class will have methods to:
* 
* Create a new Point (given an x-value and y-value) [constructor]
* Create a new Point (with no parameters) [default constructor]
* Create a new Point (from another Point) [copy constructor]
* getX
* getY
* setX
* setY
* distanceTo(Point otherPoint)
* equals [method to check if one Point is the same as another]
* toString [method to turn a Point into a string for display, 
* e.g. display as "Point[x=0,y=5]" if the x-value is 0 and y-value is 5]
* 
* The distanceTo method can be implemented with th distance equation:
*****************************************************************************
* ALGORITHM:
* 1. Declare the private info
* 2. Build a constructor
* 4. Build a copy constructor
* 5. Build a default constructor
* 6. Build getters
* 7. Build Setters
* 8. Build boolean equals operator
* 9. Build toString
* 10. Build a distance formula
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Point {

		private int mX;
		private int mY;
		
		public Point (int x, int y)
		{
			mX = x;
			mY = y;
		}
		public Point(Point other)
		{
			mX = other.mX;
			mY = other.mY;
		}
		//Default Constructor
		public Point()
		{
			mX = 0;
			mY = 0;
		}
		
		public int getX()
		{
			return mX;
		}
		public int getY()
		{
			return mY;
		}
		public void setX(int newX)
		{
			mX = newX;
		}
		public void setY(int newY)
		{
			mY = newY;
		}
		
		public boolean equals(Point other)
		{
			if (mX != other.mX)
			return false;
			if (mY != other.mY)
			return false;
			
			return true;
		}
		
		
		
		
		// distanceTo??
		public double distanceTo(Point other)
		{
			double dX2 = Math.pow(other.mX - mX, 2.0);
			double dY2 = Math.pow(other.mY - mY, 2.0);
			double distance = Math.sqrt(dX2 + dY2);
			
			
			return distance;
		}
		
		
		
		//toString
		public String toString()
		{
			String output = "Point [x=" + mX + ", y=" + mY + "]";
			return output;
		}
		
		
}

