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
* 4. Override the calculateArea() method to calculate the area of a parallelogram:  
* area = base * height.
* 5. Override the equals() method to compare all instance variables for equality
* 6. Override the toString() method that displays a pattern of asterisks (*) in the 
* shape of the parallelogram, followed by its area.  The base specifies how many asterisks 
* along the x-axis and the height specifies how many along the y-axis.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Parrallelogram extends Shape2D {
	
	private int mHeight;
	private int mPBase;
	
	public Parrallelogram(String color, int x, int y, int pBase, int height)
	{
		super(color, x, y);
		mPBase = pBase;
		mHeight = height;
	}
	
	public int getPBase()
	{
		return mPBase;
	}
	
	public int getHeight()
	{
		return mHeight;
	}
	
	public void setPBase(int newPBase)
	{
		mPBase = newPBase;
	}
	
	public void setHeight(int newHeight)
	{
		mHeight = newHeight;
	}
	
	public boolean equals(Parrallelogram other)
	{
		if (!super.equals(other) || mHeight != other.mHeight || mPBase != other.mPBase)
		return false;
		
		return true;
		
	}
	
	
	public int calculateArea()
	{
		int mCalculateArea = (mPBase * mHeight);
		
		return mCalculateArea;
	}
	
	public String toString()
	{
		String output = "";
		 for (int i = 1; i <= mHeight; i++)
		 {
			 for (int s = 3; s <= 2 * i; s++)
			 {
				 output += " ";
			 }
			 for (int a = 1; a <= mPBase; a++)
			 {
				 output += "*";
			 }
			 output += "\n";
		}
		
		 output += "\nThe area of this parrallelogram is " + calculateArea() + " square units.";
		
		return output;
	}
	
	
}

