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
* 1. The ProfessionalAthlete class should inherit from the Athlete class and add 
* one more member variable to keep track of the salary of the athlete.
* 2. Parameterized constructor (name, age, sport, hometown, salary)
* 3. use a super constructor
* 4. getter, setter, equals, toString()
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.text.NumberFormat;
* *****************************************************************************/
import java.text.NumberFormat;

public class ProfessionalAthlete extends Athlete {
	
	private double mSalary;
	
	public ProfessionalAthlete(String name, String sport, String hometown, int age, double salary)
	{
		super(name, sport, hometown, age);
		mSalary = salary;
	}
	
	public double getSalary()
	{
		return mSalary;
	}
	public void setSalary(double newSalary)
	{
		mSalary = newSalary;
	}
	
	public boolean equals(ProfessionalAthlete other)
	{
		if (!super.equals(other) || mSalary != other.mSalary)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String output = "Professional Athlete [Name: " + mName + "; Age: " + mAge + "; Hometown: " + mHometown + "; Sport: " + mSport + 
		"; Salary: " + currency.format(mSalary) + "]";
		
		return output;
	}
	
		

}

