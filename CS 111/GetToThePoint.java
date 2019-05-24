/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 3/29/2019
********************************************/
/*****************************************************************************
* IC07_GetToThePointDemo
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


public class GetToThePoint {

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
		
		//toString
		public String toString()
		{
			String output = "Point [x=" + mX + ", y=" + mY + "]";
			return output;
		}
		
		
}

