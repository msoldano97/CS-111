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
* A concrete subclass of Instrument with additional helper methods and values.
*****************************************************************************
* ALGORITHM:
* 1. Contains instance variables for the number of keys (int) and a boolean array of size 7, 
* named mChord, that is parallel to Instrument's array representing indicies of the C major 
* SCALE. Java initializes each index of this array to false.
* 2. Uses a constructor with 2 parameters (numKeys, note), and a default constructor which 
* an 88-key Piano playing note 0 ("C").
* 3. The two constructors, in addition to the overridden setNote(int note) method, calls 
* upon a private helper method named setChord().
* 4. This method will set all indices of mChord to false, except for the index that is equal 
* to the Piano's current mNote, the value of mNote + 2, and mNote + 4.
* 5. Because these index values could exceed the bounds of mChord, you must utilize the % 
* operator to "wrap around" the array for said values. This will be useful for illustration 
* in the Piano's play() method.
* 6. Overrides Object's toString() method to represent the Piano in the following format:
* [Piano: 88 keys, playing a choard with root note C]
* 7. Overrides Instrument's play() method to display a graphic (seen below) which 
* demonstrates one way to play a chord with the given root note within the C major SCALE.
* 8. With exception to the last one, each line of the ASCII art will always be assigned to a 
* String local to this method.
* 9. In a loop examining each element of mChord, each key will be concatenated to the above 
* String. If mChord[i] is true, SCALE[i] will be concatenated; "_" otherwise.
* 10. Lastly, this String will be printed to the console in addition to the Piano's overridden 
* toString().
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Piano extends Instrument {
	
	private int mNumKeys;
	private boolean[] mChord;
	
	public Piano(int note, int numKeys)	{
		super(note);
		mNumKeys = numKeys;	
		mChord = new boolean[7];
		setChord();
	}
	
	public Piano() {
		super(0);
		mNumKeys = 88;
		mChord = new boolean[7];
		setChord();
	}
	
	public int getNumKeys()
	{
		return mNumKeys;
	}
	
	public void setNumKeys(int newNumKeys)
	{
		mNumKeys = newNumKeys;
	}
	
	public void setNote(int note)
	{
		mNote = note;
		setChord();
	}
	
	private void setChord()
	{
		int third = (mNote + 2) % mChord.length;
		int fifth = (mNote + 4) % mChord.length;
		
		for (int i = 0; i < mChord.length; i++)
		{
			// if i = mNote, i = third, or i = fifth
			// set to true; else false
			//(condition) ? trueExpresssion : falseExpression
			
			mChord[i] = (i == mNote || i == third || i == fifth) ? true : false;			
	}
}
	//implement abstract method
	
	
	public void play()
	{
	
	
	String graphic =  "|  | | | |  |  | | | | | |  |\n" +
				"|  | | | |  |  | | | | | |  |\n" +
				"|  | | | |  |  | | | | | |  |\n" +
				"|  |_| |_|  |  |_| |_| |_|  |\n" +
				"|   |   |   |   |   |   |   |\n" +
				"|   |   |   |   |   |   |   |\n" +
				"|";
	
	for (int i = 0; i < mChord.length; i++)
	{
		graphic += "_";
		graphic += (mChord[i]) ? SCALE[i] : "_";
		graphic += "_|";
	}
	System.out.println(graphic + "\n");
	}
	// use mChord parrallel to instrument's CHORD array to complete the image
	
	
	public String toString()
	{
		
	String output = "Piano: " + mNumKeys + " keys, playing a chord with root note " + SCALE[mNote] + "]";
	return output;
}
	
}

