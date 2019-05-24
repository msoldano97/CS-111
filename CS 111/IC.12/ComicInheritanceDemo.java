/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC12
* LAST MODIFIED: 5/3/2019
********************************************/
/*****************************************************************************
*  IC12_ComicInheritance
*****************************************************************************
* PROGRAM DESCRIPTION:
* Define a base (parent) class named Comic, which will store information 
* about a series, including information about the name (e.g. Spider Man), 
* the publisher (e.g. Marvel), the serialized date (e.g. 1962) and the sales 
* (e.g. $378,000,000). Then create a class named Manga, to represent a Japanese 
* comic that inherits the properties from the Comic class and adds information 
* about the media type (e.g. Magazine or Paperback).  Finally, create a class 
* named Anime (animated comics, as an art form) that also inherits from Comic, 
* and includes information about the running time (e.g. 75 minutes).
*****************************************************************************
* ALGORITHM:
* 1. Maintains an array of Comics (allComics[])
* 2. Creates 2 Comic objects (you provide the data for each object) and adds them to the array
* 3. Creates 2 Manga objects (you provide the data for each object) and adds them to the array
* 4. Creates 2 Anime objects (you provide the data for each object) and adds them to the array
* 5. Loop through the array and display each of the objects to the console.

*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class ComicInheritanceDemo {
	
	public static void main (String args[]) {
		
		Comic[] allComics = new Comic[10];
		int count = 0;
		
		allComics[count++] = new Comic("Deadpool", "Marvel", 783000000, 2016);
		allComics[count++] = new Comic("Green Lantern", "Marvel", 7, 2014);
		
		allComics[count++] = new Manga("A-Club", "Lam Caa-Lei", 12542, 2001, "Magazine");
		allComics[count++] = new Manga("AnimaniA", "Animagine GmbH", 9850, 1994, "Magazine");
	
		allComics[count++] = new Anime("Dragon Ball", "Viz Media", 540000, 2018, "Tv Show", 30);
		allComics[count++] = new Anime("Pokemon", "Parsons and Co.", 2300000, 1997, "Tv Show", 30);
		
		for (int i = 0; i < count; i++)
		{
			System.out.println(allComics[i]);
			System.out.println();
		}
	
	}
}

