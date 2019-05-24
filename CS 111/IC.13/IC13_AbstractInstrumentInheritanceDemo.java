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
* In this driver program, you will create a rather unorthodox octet comprised of only 
* Pianos and Recorders.
*****************************************************************************
* ALGORITHM:
* 1. Create an array of Instruments, instantiating 4 Pianos and 4 Recorders.
* 2. Loop through this array, calling the play method for each Instrument. 
* Observe the behavior of each Instrument as it invokes this method at run-time. 
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class IC13_AbstractInstrumentInheritanceDemo {
	
	public static void main (String args[]) {
		Instrument[] band = new Instrument[8];
		
		band[0] = new Piano();
		band[1] = new Piano(0, 88);
		band[2] = new Piano(4, 46);
		band[3] = new Piano(6, 128);
		band[4] = new Recorder();
		band[5] = new Recorder(3);
		band[6] = new Recorder(2);
		band[7] = new Recorder(6);
		
		
		for (int i = 0; i < band.length; i++)
		{
			System.out.println(band[i]);
			band[i].play();
			
		}
		System.out.println();
		
		//System.out.println("Is band[0] and band[1] equal?");
		
	}
}

