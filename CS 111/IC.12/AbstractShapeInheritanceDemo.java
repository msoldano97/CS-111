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
* 1. Maintains an array of Shape2D (Shape2D[])
* 2. Creates 1 Rectangle object (you provide the data for the object) and adds it to the array.
* 3. Creates 1 Triangle object (you provide the data for the object) and adds it to the array.
* 4. Creates 1 Parallelogram object (you provide the data for the object) and adds it to the array.
* 5. Loop through the array and display each of the objects to the console.

*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class AbstractShapeInheritanceDemo {
	
	public static void main (String args[]) {
		
		Shape2D[] shapes = new Shape2D[3];
		int count = 0;
		
		shapes[count++] = new Rectangle("black", 1, 1, 4, 6);
		
		shapes[count++] = new Triangle("black", 1, 1, 5, 5);
		
		shapes[count++] = new Parrallelogram("black", 1, 1, 40, 10);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~" +
						 "\n~~~These are my shapes~~~" +
					 	 "\n~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
						
		for (int i = 0; i < count; i++)
		{
			System.out.println(shapes[i]);
			System.out.println();
			
		}
		
	}
}

