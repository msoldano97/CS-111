/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC12
* LAST MODIFIED: 5/7/2019
********************************************/
/*****************************************************************************
*  IC12_AbstractShapeInheritance
*****************************************************************************
* PROGRAM DESCRIPTION:
* For our purposes, Shape2D will be the abstract base (parent) class and
* Rectangle, Triangle and Parallelogram will be the concrete derived 
* (child) classes.
*****************************************************************************
* ALGORITHM:
* 1. Create instance variables for width (int) and height (int).
* 2. Create accessors/mutators for these instance variables.
* 3. Create a constructor with 5 parameters (x, y, color, width, height). Initialize all instance 
* variables.
* 4. Override the calculateArea() method to calculate the area of a rectangle:  area = width * height
* 5. Override the equals() method to compare all instance variables for equality
* 6. Override the toString() method that displays a pattern of asterisks (*) in the shape of 
* the rectangle, followed by its area.  The width specifies how many asterisks along the x-axis and the height specifies how many along the y-axis. 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Rectangle extends Shape2D {
	
	private int mHeight;
	private int mWidth;
	
	public Rectangle(String color, int x, int y, int width, int height)
	{
		super(color, x, y);
		mHeight = height;
		mWidth = width;
	}
	
	public int getHeight()
	{
		return mHeight;
	}
	
	public int getWidth()
	{
		return mWidth;
	}
	
	public void setHeight(int newHeight)
	{
		mHeight = newHeight;
	}
	
	public void setWidth(int newWidth)
	{
		mWidth = newWidth;
	}
	
	public boolean equals(Rectangle other)
	{
		if (!super.equals(other) || mHeight != other.mHeight || mWidth != other.mWidth)
		return false; 
		
		return true;
		
	}
	
	public int calculateArea()
	{
		int mCalculateArea = mWidth * mHeight;
		
		return mCalculateArea;
	}
	
	
	public String toString()
	{
		
		String output = "";
		 for (int i = 1; i <= mHeight; i++)
		 {
			 for (int a = 1; a <= mWidth; a++)
			 {
				 output += "*";
			 }
			 output += "\n";
		} 
		output += "\nThe area of this rectangle is " + calculateArea() + " square units.";
	
		return output;
	}
}
