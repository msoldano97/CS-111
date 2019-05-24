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
* 1. Make Shape2D an abstract class (cannot be instantiated).
* 2. Create instance variables for x (int) and y (int) and color (String).   
* **Be sure that all instance variables can be inherited by the two child classes**
* 3. Create accessors/mutators for all instance variables.
* 4. Create an abstract method named double calculateArea() that will be implemented in each derived class.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public abstract class Shape2D {
	
	protected String mColor;
	protected int mX;
	protected int mY;
	
	protected Shape2D(String color, int x, int y)
	{
		mColor = color;
		mX = x;
		mY = y;
	}
	
	protected String getColor()
	{
		return mColor;
	}
	
	protected int getX() 
	{
		return mX;
	}
	protected int getY()
	{
		return mY;
	}
	
	protected void setColor(String newColor)
	{
		mColor = newColor;
	}
	
	protected void setX(int newX)
	{
		mX = newX;
	}
	
	protected void setY(int newY)
	{
		mY = newY;
	}
	
	public abstract int calculateArea();
	
	
	
}

