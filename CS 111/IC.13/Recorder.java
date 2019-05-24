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
* Another concrete subclass of Instrument.
*****************************************************************************
* ALGORITHM:
* 1. Contains a constructor with a single parameter (note), and a default constructor which 
* creates a Recorder playing note 0 ("C").
* 2. Overrides Object's toString() method to represent the Recorder in the following format:
* [Recorder: playing note E]
* 3. Overrides Instrument's play() method to display a graphic (seen below) which demonstrates 
* the Recorder's fingering to play its current mNote in relation to the C major SCALE. 
* For example, "C" requires all 8 finger-holes to be covered, "D" requiring only the last 7, 
* and so on.
* 4. The String variable local to this method will be initialized to the top and beginning 
* portion of the given ASCII art recorder.
* 5. Loops may be used to print a total of 7 holes in relation to Instrument's array for the 
* C major SCALE. The number of open spaces ([ ]) is equal to the current mNote value, whereas 
* the remaining spaces are covered ([X]).
* 6. Because each note requires the rightmost space to be covered, the ending portion of the 
* ASCII art includes an additional [X].
* 7. This method will also call upon the Recorder's overridden toString() method to print 
* its information to the console.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Recorder extends Instrument {
	
	public Recorder(int note)
	{
		super(note);
	}
	
	public Recorder()
	{
		super(0);
	}
	public void play()
	{
		String graphic = "         ____,,______________________________,,_\n" +
						 "(^_^)// ()____";
						 
		for (int i = 0; i < mNote; i++)
		{
			graphic += "[" + " " + "]_";
			
		}
		for (int j = mNote; j < SCALE.length; j++)
		{
			graphic += "[" + "X" + "]_";
		}
	graphic += "_[X]__)";
	
	System.out.println(graphic);
	}
	
	public String toString()
	{
		String output = "[Recorder: playing note " + SCALE[mNote] + "]";
		
		return output;
	}
}

