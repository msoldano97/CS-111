/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/10/2019
********************************************/
/*****************************************************************************
*  IC13_AbstractInstrumentInheritance
*****************************************************************************
* PROGRAM DESCRIPTION:
* An abstract class to represent a musical instrument, containing abstract 
* methods which are to be defined in its (concrete) subclasses.
*****************************************************************************
* ALGORITHM:
* 1. Using the abstract modifier in its class heading, this class will be abstract
* and therefore unable to be instantiated directly.
* 2. This class contains an instance variable for its current note(int), and
* a static collection of Strings to represent the 7 notes in the C major SCALE
* (C, D, E, F, G, A, B).
* 3. Non-abstract accessor and mutator methods for the Instrument's mNote value, 
* where said value is an integer within the range 0-6 in relation to the above array 
* representing the C major SCALE.
* 4. An abstract method called play() will be provided for an Instrument to present a 
* single note or a chord (3 notes) based on its mNote value as it relates to an index 
* within the C major SCALE. Because this is an abstract method, there will be no method 
* body as it will be implemented in the following descendants.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public abstract class Instrument {
	
	protected static char[] SCALE = {'C', 'D', 'E', 'F', 'G', 'A', 'B'};
	protected int mNote;
	 // 0 6 
	 protected Instrument(int note)	{
		 mNote = note;
	 }
	 
	 //accessors and mutators
	 
	 public int getNote()
	 {
		 return mNote;
	 }
	 
	 public void setNote(int newNote)
	 {
		 mNote = newNote;
	 }
	 
	 public abstract void play();
	 
	/*
	 * Note: abstract method syntax
	 * - does not contain a method body
	 * -includes 'abstract' modifier
	 * -serves as a placeholder for future implementation
	 * -a class that contains at least one abstract method that must be abstact!
	 * - all decendants must implement all abstact methods
	 * */
	
}

