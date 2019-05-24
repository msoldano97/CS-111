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
* 1. Create instance variables for base (int) and height (int).
* 2. Create accessors/mutators for these instance variables.
* 3. Create a constructor with 5 parameters (x, y, color, base, height).  
* Initialize all instance variables.
* 4. Override the calculateArea() method to calculate the area of a triangle:  
* area = 0.5 * base * height.
* 5. Override the equals() method to compare all instance variables for equality
* 6. Override the toString() method that displays a pattern of asterisks (*) in the 
* shape of the triangle, followed by its area.  The base specifies how many asterisks along 
* the x-axis and the height specifies how many along the y-axis
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Triangle extends Shape2D {
	
	private int mTBase;
	private int mHeight;
	
	public Triangle(String color, int x, int y, int tBase, int height)
	{
		super(color, x, y);
		mTBase = tBase;
		mHeight = height;
	}
	
	public int getTBase()
	{
		return mTBase;
	}
	
	public int getHeight()
	{
		return mHeight;
	}
	
	public void setTBase(int newTBase)
	{
		mTBase = newTBase;
	}
	
	public void setHeight(int newHeight)
	{
		mHeight = newHeight;
	}
	
	public boolean equals(Triangle other)
	{
		if (!super.equals(other) || mTBase != other.mTBase || mHeight != other.mHeight)
		return false;
		
		return true;
	}
	
	public int calculateArea()
	{
		int mCalculateArea = (mTBase * mHeight) / 2;
		
		return mCalculateArea;
	}
	
	public String toString()
	{
		String output = "";
		 for (int i = 1; i <= mHeight; i++)
		 {
			  for (int s = 1; s <= i; s++)
			 {
				 output += "*";
			 }
			 output += "\n";
		 }
			 output += "\nThe area of this triangle is " + calculateArea() + " square units.";
		
		return output;
	}
	
}

