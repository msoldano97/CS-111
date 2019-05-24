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
* 1. use protected variables for name, sport, hometown, and age
* 2. Parameterized constructor (name, age, sport, hometown)
* 3. Getters and setters and equals
* 4. toString()
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Athlete {
	
	//Fields are usually private
	
	protected String mName;
	protected String mSport;
	protected String mHometown;
	protected int mAge;
	
		public Athlete(String name, String sport, String hometown, int age)
		{
			mName = name;
			mSport = sport;
			mHometown = hometown;
			mAge = age;
		}
		
		public Athlete(Athlete other)
		{
			mName = other.mName;
			mSport = other.mSport;
			mHometown = other.mHometown;
			mAge = other.mAge;
		}
		
		public String getName()
		{
			return mName;
		}
		public String getSport()
		{
			return mSport;
		}
		public String getHometown()
		{
			return mHometown;
		}
		public int getAge()
		{
			return mAge;
		}
		
		public void setName(String newName)
		{
			mName = newName;
		}
		public void setSport(String newSport)
		{
			mSport = newSport;
		}
		public void setHometown(String newHometown)
		{
			mHometown = newHometown;
		}
		public void setAge(int newAge)
		{
			mAge = newAge;
		}
		
		public boolean equals(Athlete other)
		{
			if (!mName.equalsIgnoreCase(other.mName))
			return false;
			if (!mSport.equalsIgnoreCase(other.mSport))
			return false;
			if (!mHometown.equalsIgnoreCase(other.mHometown))
			return false;
			if (mAge != other.mAge)
			return false;
			
			return true;
		}
		
		public String toString()
		{
			String output = "Athlete [Name: " + mName + "; Age: " + mAge + "; Hometown: " + mHometown + "; Sport: " + mSport + "]";
			
			return output;
		}
		
		
}

