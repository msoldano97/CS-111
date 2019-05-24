/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 4/2/2019
********************************************/
/*****************************************************************************
* IC07_Line
*****************************************************************************
* PROGRAM DESCRIPTION:
* Now, implement a class named Line that represents a two-dimensional line, 
* consisting of two points.  The Line class should have the following instance 
* variables (a.k.a. fields or data):
* 
* p1 (the first Point of the line)
* p2 (the last Point of the line)
* 
* The Line class will have methods to:
* 
* Create a new Line (from two x-values and two y-values) [constructor]
* Create a new Line (from two Points) [constructor]
* Create a new Line (from another Line) [copy constructor] 
* getP1
* getP2
* getX1
* getY1
* getX2
* getY2
* setP1
* setP2
* setX1
* setY1
* setX2
* setY2
*
* length() [method that calculates the length of the Line]
* equals [method to check if one Line is the same as another]
* toString [method to turn a Line into a string for display, e.g. display as "Line[(x1=0,y1=5), 
* (x2=0,y2=10)]"
*****************************************************************************
* ALGORITHM:
* 1. Declare the private info
* 2. Build a constructor from two x values and two y values
* 3. Build a constructor from two points
* 4. Build a copy constructor
* 5. Build getters
* 6. Build Setters
* 7. Build boolean equals operator
* 8. Build toString
* 9. Build a length formula
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Line {
	private Point mP1;
	private Point mP2;
	
	public Line(int xP1, int yP1, int xP2, int yP2)
	{
		mP1 = new Point(xP1, yP1);
		mP2 = new Point(xP2, yP2);
	}
	public Line (Point p1, Point p2)
	{
		mP1 = p1;
		mP2 = p2;
	}
	public Line (Line other)
	{
		mP1 = other.mP1;
		mP2 = other.mP2;
	}
	public Point getP1()
	{
		return mP1;
	}
	public Point getP2()
	{
		return mP2;
	}
	public int getX1()
	{
		return mP1.getX();
	}
	public int getY1()
	{
		return mP1.getY();
	}
	public int getX2()
	{
		return mP2.getX();
	}
	public int getY2()
	{
		return mP2.getY();
	}
	public void setX1(int newX1)
	{
		mP1.setX(newX1);
	}
	public void setY1(int newY1)
	{
		mP1.setY(newY1);
	}
	public void setX2(int newX2)
	{
		mP2.setX(newX2);
	}
	public void setY2(int newY2)
	{
		mP2.setY(newY2);
	}
	public void setP1(Point newP1)
	{
		mP1 = newP1;
	}
	public void setP2(Point newP2)
	{
		mP2 = newP2;
	}
	// look at shallow vs. deep copy?
	public double length()
	{
		double deltaX = Math.pow(mP1.getX() - mP2.getX(), (2));
		double deltaY = Math.pow(mP1.getY() - mP2.getY(), (2));
		double length = Math.sqrt(deltaX + deltaY);
		return length;
		
	}	
	public boolean equals(Line other)
	{
		if (!mP1.equals(other.getP1()))
		return false;
		if (!mP2.equals(other.getP2()))
		return false;
		else
		return true;
	}
	public String toString()
	{
		String output = ("Line [p1=" + mP1 + ", p2=" + mP2);
		return output;
	}
	
}

