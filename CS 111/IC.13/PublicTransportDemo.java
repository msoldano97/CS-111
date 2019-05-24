/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC13
* LAST MODIFIED: 5/16/2019
********************************************/
/*****************************************************************************
*  IC13_PublicTransport
*****************************************************************************
* PROGRAM DESCRIPTION:
*  in this demo, write a public static void main(String[ ] args) method that performs the following:
*****************************************************************************
* ALGORITHM:
* 1. Maintain an array of public transportation options (PublicTransport[ ]), 
* which you can name transportOptions.
* 2. Add 2 Bus objects to the array
* 3. Add 2 Train objects to the array
* 4. Loop through the array and display each object to the console
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* 
* *****************************************************************************/


public class PublicTransportDemo {
	
	public static void main (String args[]) {
		
		PublicTransport[] publicTransport = new PublicTransport[4];
		
		
		publicTransport[0] = new Bus("GreyHound", 1.00, new String[]{"OSide Transit Center", 
			"OSide Blvd", "Plaza Camino Real", "MiraCosta College", "Thunder Dr.", "Vista Transit Center"},
			0, 302);
		publicTransport[1] = new Bus("NCTD Breeze", 1.50, new String[]{"OSide Transit Center", 
			"OSide Blvd", "Plaza Camino Real", "MiraCosta College", "Thunder Dr.", "Vista Transit Center"},
			5, 322);
		publicTransport[2] = new Train("Amtrak", 15.00, new String[]{"OceanSide", 
			"Carlsbad", "Encinitas", "Solana Beach", "Old Town", "Santa Fe Depot"},
			0, 726);
		publicTransport[3] = new Train("Sounder", 10.00, new String[]{"Seattle", "Kirkland", 
			"Auburn", "Maple Valley", "Kent", "West Seattle"},
			5, 1080);
			
							
			String leave = "--> It's the end of the line for you";
			String stay = "--> You may continue";
			
			for (int i = 0; i < publicTransport.length; i++)
			{
				System.out.println(publicTransport[i]);
				
				
				if (publicTransport[i].goToNextStop() == false)
				System.out.println(leave);
				else 
				System.out.println(stay);
				
				
				System.out.println();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			
		
		
		
		
	}
}

