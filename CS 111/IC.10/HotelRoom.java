/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC10
* LAST MODIFIED: 4/19/2019
********************************************/
/*****************************************************************************
*  IC10_HotelRoom
*****************************************************************************
* PROGRAM DESCRIPTION:
* Create a class named HotelRoom that contains information about occupancy of hotel rooms.  
* The  HotelRoom class has the following instance variables (a.k.a. fields or member variables):

Room number (int)
People in room (int)

* totalOccupancy (int) - this is a static variable that keeps track of the total occupancy 
* (number of people) for all rooms

The  HotelRoom class will have methods to:

Create a new  HotelRoom (given a room number and number of people in room) [parameterized constructor]
* addGuests(int numberOfGuests) - adds the number of people to the room and increases the 
* value of totalOccupancy by the same amount, only if the people in the room does not exceed 4. 
* removeGuests(int numberOfGuests)  - removes the number of people from the room and decrease 
* the value of totalOccupancy by the same amount, only if the people in the room does not go below zero.
* getNumberGuests - returns the number of people in the room
* getRoomNumber - returns the room number
* getTotalOccupancy - a static method that returns the total number of people in the entire hotel.
* equals - method to check if one HotelRoom is the same as another by comparing all instance variables
* toString - method to turn a HotelRoom into a string for display, for example:

*****************************************************************************
* ALGORITHM:
* 1. declare private and static variables
* 2. create the constructor
* 3. create the getters
* 4. check if other is equal 
* 5. create the add and remove guests
* 6. create the toString
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/
public class HotelRoom {
	//fields aka member variables or instance variables
	private int mNumberGuests, mRoomNumber;
	
	// static variable (aka class variable)
	private static int sTotalOccupancy = 0;
	
	//constructor
	
	public HotelRoom(int roomNumber, int numberGuests)
	{
		mRoomNumber = roomNumber;
		mNumberGuests = numberGuests;
		//add number of guests to totalOccupancy
		sTotalOccupancy += numberGuests;
	}
		public int getNumberGuests()
		{
		return mNumberGuests;
	}
		
		public int getRoomNumber()
		{
		return mRoomNumber;
	}
		public static int getTotalOccupancy()
		{
			return sTotalOccupancy;
	}
	public boolean equals(HotelRoom other)
	{
		if (mRoomNumber != other.mRoomNumber)
		return false;
		if (mNumberGuests != other.mNumberGuests)
		return false;
		return true;
	}
	
	public boolean addGuests(int numberOfGuests)
	{
		
		if (mNumberGuests + numberOfGuests <= 4)
		{
			mNumberGuests += numberOfGuests;
			sTotalOccupancy += numberOfGuests;
			
			return true;
		}
		return false;
		
	}
	public boolean removeGuests(int numberOfGuests)
	{
		String error = "error below minimum guests.";
		if (mNumberGuests - numberOfGuests >= 0)
		{
			mNumberGuests -= numberOfGuests;
			sTotalOccupancy -= numberOfGuests;
		return true;
	}
	return false;
}
	public String toString()
	{
		String output = "Hotel Room[#" + mRoomNumber + ", " + mNumberGuests + (mNumberGuests != 1 ? " guests" : " guest") + ", Hotel Occupancy = " + sTotalOccupancy + "]";
		return output;
	}
	
	
	
}






