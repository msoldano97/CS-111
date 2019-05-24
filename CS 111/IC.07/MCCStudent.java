/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 4/4/2019
********************************************/
/*****************************************************************************
* IC07_MCCStudent
*****************************************************************************
* PROGRAM DESCRIPTION:
* Give a complete definition of a class called MCCStudent that has the following fields 
* (aka: member (or instance) variables):
* surfId
* fullName
* gpa
* age
* Include accessor methods for each instance variable and mutator methods for each 
* (except the student's SURF ID, as this can not be changed once assigned).
* Add methods for the MCCStudent to:
* 
* Instantiate a new MCCStudent (constructor method)
* Create a String representation of a MCCStudent (toString method)
* 
* Write a demo (a.k.a. driver or test) program, which is another Java class in the same project. 
* In this demo, prompt the user to enter their SURF id, full name, GPA and age, then use the
* toString method to display the MCCStudent to the console.  Finally, use mutator (setter
* methods to convert the student into another by changing their name, GPA and age.  
* 
* Please name the demo (MCCStudentDemo).
*****************************************************************************
* ALGORITHM:
* 1. Declare the private info
* 2. Build a constructor
* 3. Build a copy constructor
* 4. Build getters
* 5. Build Setters
* 6. Build boolean equals operator
* 7. Build toString
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class MCCStudent {
	private int mAge;
	private double mGPA;
	private String mSurfId, mFullName;
	
	public MCCStudent(int age, double GPA, String surfId, String fullName)
	{
		mAge = age;
		mGPA = GPA;
		mSurfId = surfId;
		mFullName = fullName;
		
	}
	public MCCStudent(MCCStudent other)
	{
		mAge = other.mAge;
		mGPA = other.mGPA;
		mSurfId = other.mSurfId;
		mFullName = other.mFullName;
	}
	//getters/
	public int getAge()
	{
		return mAge;
	}
	public double getGPA()
	{
		return mGPA;
	}
	public String getSurfId()
	{
		return mSurfId;
	}
	public String getFullName()
	{
		return mFullName;
	}
	//setters/mutators
	public void setAge(int newage)
	{
		mAge = newage;
	}
	public void setFullName(String newFullName)
	{
		mFullName = newFullName;
	}
	public void setGPA(double newGPA)
	{
		mGPA = newGPA;
	}
	public boolean equals(MCCStudent other)
	{
		if  (mSurfId.equals(other.mSurfId) && mFullName.equals(other.mFullName))
		{
		//System.out.println("inside first case");
		return true;
	}
		else if (mSurfId.equals(other.mSurfId))
		{
		//System.out.println("inside 2nd case");
		return true;
	}
		else if (mFullName.equals(other.mFullName))
		{
		//System.out.println("inside 3rd case");
		return true;
	}
		else
		return false;
	}
	
	public String toString() {
		String output = "\n" + mSurfId + "\nName: " + mFullName + "\nAge: " + mAge + "\nGPA: " + mGPA;
		return output;
	}
		
	
}

