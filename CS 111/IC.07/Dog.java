/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 3/29/2019
********************************************/
/*****************************************************************************
* IC07_Dog
*****************************************************************************
* PROGRAM DESCRIPTION:
* Implement a class named Dog that contains information about a dog.  The Dog 
* class has the following member variables (a.k.a. fields or instance variables):
* The dog's name
* The breed
* The age of the dog
* 
* The Dog class will have methods to:
* 
* Create a new Dog (given a dog's name, breed and age) [constructor]
* Create a new Dog (from another Dog) [copy constructor - like cloning a dog 
* (Links to an external site.)Links to an external site.]
* getName
* getBreed
* getAge
* setName
* setBreed
* setAge
* ageInHumanYears - calculates and returns the dog's age in human years, 
* which is generally estimated as: 
* (if the dog is <= 2 years old, multiply its age * 11, else, subtract the age - 2, 
* multiply by 5 and add 22)
* equals - method to check if one Dog is the same as another by comparing all instance variables
* toString - method to turn a Dog into a string for display, 
* e.g. display as "Dog [Name=Scooby, Breed=Great Dane, Age=7, Human Age=47]"
*****************************************************************************
* ALGORITHM:
* 1. Declare the private info
* 2. Build a constructor
* 3. Build a copy constructor
* 4. Build getters
* 5. Build Setters
* 6. Build boolean equals operator
* 7. Build toString
* 8. Build an age in human years constructor
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Dog {
//start with the fields
//Fields: attributes/characteriestics of each object
//Secure the fields by making them private
	private String mName, mBreed;
	private double mAge;
	
	// Constructor = instantiates (creates) a brand new object
	// ^ Parameterized Constructor: takes in all the information needed 
	// to create an object
	// Constructors are public and must hace the same name as the class
	public  Dog(String name, String breed, double age)
	{
		//Assgin fields equal to the parameters
		//to store object in "database"
		mName = name;
		mBreed = breed;
		mAge = age;
		
	}
		// Copy Constructor = creates a new object by copying values of an
		//existing object. Basically allows to copy/paste objects
		// Copy the fields of the "other" dog into a new one

		public Dog(Dog other)
	{
		// Assign fields = other dog's
		// New dog's name = other dog's name
		mName = other.mName;
		mBreed = other.mBreed;
		mAge = other.mAge;
		
	}
	// Getters/Setters
	// Getter = method to retrieve one field (from database)
	// Setter = method to modify one field (in database)
	public String getName()
	{
		return mName;
	}
	public String getBreed()
	{
		return mBreed;
	}
	public Double getAge()
	{
		return mAge;
	}
	public void setName(String newName)
	{
		mName = newName;
	}
	public void setBreed(String newBreed)
	{
		mBreed = newBreed;
	}
	public void setAge(Double newAge)
	{
		mAge = newAge;
	}
	
	//equals method = compares two objects to determine if ALL fields are the same
	// returns true if ALL same
	// returns false if ANY differ
	
	public boolean equals(Dog other)
	{
		//compare ALL fields
		// Start with name
		// if NOT the same, return false
		if (!mName.equals(other.mName))
			return false;
		if (!mBreed.equals(other.mBreed))
			return false;
		if (mAge != other.mAge)
			return false;
		// Made it through all checks!
		// Objects are the same
		return true;
		
	}
	
	public double ageInHumanYears()
	{
	// If dog is <= 2, multiply by 11
	
	// else (age - 2) * 5 + 22
	double humanAge;
	if (mAge <= 2)
		humanAge = mAge * 11;
	else 
		humanAge = (mAge - 2) * 5 + 22;
		
		return humanAge;
		
		
	}
	
	
	
	
	public String toString()
	{
		// call from the method ageInHumanYears() to put into the output
		String output = "Dog [Name=" + mName + ",Breed=" + mBreed + ",Age=" + mAge + ",HumanAge=" + ageInHumanYears() + "]";
	
	//toString = method that converts an object into a String for display	
	return output;
	}
}

