/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC10
* LAST MODIFIED: 4/19/2019
********************************************/
/*****************************************************************************
*  IC10_HotelRoomDemo
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
* 1. Create two new rooms using the constructor
* 2. print the rooms
* 3. test the remove class
* 4. test the add class
* 5. test the equals class
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class IC10_HotelRoomDemo {
	
	public static void main (String args[]) {
		
		HotelRoom partyRoom = new HotelRoom(101 , 4);
		HotelRoom grandpasRoom = new HotelRoom(102, 1);
		
		System.out.println(partyRoom);
		System.out.println(grandpasRoom);
		
		partyRoom.removeGuests(4);
		grandpasRoom.addGuests(4);
		
		System.out.println("\nAfter kicking out people in party: \n");
		System.out.println(partyRoom);
		System.out.println(grandpasRoom);
		System.out.println("\nRooms the same?\n");
		System.out.println(partyRoom.equals(grandpasRoom) + "\n");
		
		
		
		
		
		
		//Remove people from party room!!
		
	}
}

