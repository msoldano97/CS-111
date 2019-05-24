/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 4/2/2019
********************************************/
/*****************************************************************************
* IC07_LineDemo
*****************************************************************************
* PROGRAM DESCRIPTION:
* Show that everying in the data class works
*****************************************************************************
* ALGORITHM:
* 1. create two points
* 2. make a line
* 3. test the equals operator
* 4. print the length formula
* 5. test the coordinate (x and y) setters
* 6. print the line
* 7. test the equals operator again
* 8. test the points setters
* 9. test the length again
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/



public class IC07_LineDemo {
	
	public static void main (String args[]) {
		
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(4,3);
		
		Line line = new Line (p1,p2);
		System.out.println(line);
		System.out.println("Points the same?? " + line.getP1().equals(line.getP2()));
		System.out.println("Distance formula... " + line.length());
		line.setX1(4);
		line.setY1(3);
		System.out.println("Points the same?? " + line.getP1().equals(line.getP2()));
		line.setX2(7);
		line.setY2(12);
		System.out.println("Points the same?? " + line.getP1().equals(line.getP2()));
		System.out.println("Distance formula... " + line.length());
		line.setP1(new Point(12,12));
		line.setP2(new Point(12,12));
		System.out.println("Points the same?? " + line.getP1().equals(line.getP2()));
		System.out.println("Distance formula... " + line.length());
		
		
	}
}

