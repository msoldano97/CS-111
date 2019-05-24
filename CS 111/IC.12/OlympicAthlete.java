/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC12
* LAST MODIFIED: 5/3/2019
********************************************/
/*****************************************************************************
*  IC12_AthleteInheritance
*****************************************************************************
* PROGRAM DESCRIPTION:
* Define a base (parent) class named Athlete, which will store information 
* about a person who plays sports, including information abou their name, 
* age, sport and hometown.  Then create a derived (child) class named OlympicAthlete, 
* that inherits the properties from Athlete and adds information about how many
* medals that olympian has won.  Finally, create a second child class named 
* ProfessionalAthlete that also inherits from Athlete, but includes information 
* about their salary.
*****************************************************************************
* ALGORITHM:
* 1. The OlympicAthlete class should inherit from the Athlete class and add one more
* member variable to keep track of how many medals the olympian has won.
* 2. Parameterized constructor (name, age, sport, hometown, medals won)
* 3. use a super constructor
* 4. getter, setter, equals, toString()
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class OlympicAthlete extends Athlete{
	
	private int mMedalsWon;
	
	public OlympicAthlete(String name, String sport, String hometown, int age, int medalsWon)
	{
		//send all parent data to the super class
		// key word in java: super = refers to parent class
		// super(...) makes a call to the parent constructor
		super(name, sport, hometown, age);
		mMedalsWon = medalsWon;
	}
	
	public int getMedalsWon()
	{
		return mMedalsWon;
	}
	
	public void setMedalsWon(int newMedalsWon)
	{
		mMedalsWon = newMedalsWon;
	}
	
	public boolean equals(OlympicAthlete other)
	{
		if (!super.equals(other) || mMedalsWon != other.mMedalsWon)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		String output = "Olympic Athlete [Name: " + mName + "; Age: " + mAge + "; Hometown: " + mHometown + "; Sport: " + mSport + 
		"; Medals Won: " + mMedalsWon + "]";
		
		return output;
		
	}
	
}

