/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC12
* LAST MODIFIED: 5/3/2019
********************************************/
/*****************************************************************************
*  IC12_AthleteInheritanceDemo
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
* 1. Maintains an array of Athletes (allAthletes[])
* 2. Creates 2 Athlete objects (you provide the data for each object) and adds them to the array
* 3. Creates 2 Olympic Athlete objects (you provide the data for each object) and adds them to the array
* 4. Creates 2 Professional Athlete objects (you provide the data for each object) and adds them to the array
* 5. Loop through the array and display each of the objects to the console.
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class AthleteInheritanceDemo {
	
	public static void main (String args[]) {
		/*;
		
		Athlete athlete1 = new Athlete("Alex Smith", "Football", "Carlsbad, CA", 23);
		System.out.println(athlete1.toString());
		
		System.out.println();
		
		OlympicAthlete athlete2 = new OlympicAthlete("Alex Smith", "Football", "Carlsbad, CA", 23, 0);
		System.out.println(athlete2.toString());
		
		System.out.println();
		
		ProfessionalAthlete athlete3 = new ProfessionalAthlete("Alex Smith", "Football", "Carlsbad, CA", 23, currency.format(100000));
		System.out.println(athlete3.toString());
		*/
		
		Athlete[] allAthletes = new Athlete[10];
		int count = 0; 
		
		//add two athletes to the array and add two olympians to the array
		//puts Trevor in the array and increments the count after
		
		allAthletes[count++] = new Athlete("Trevor", "Water Polo", "Oceanside", 14);
		allAthletes[count++] = new Athlete("Joey", "Basketball", "Carlsbad", 8);
		
		//add olympians
		allAthletes[count++] = new OlympicAthlete("Michael Phelps", "Swimming", "Baltimore", 33, 23);
		allAthletes[count++] = new OlympicAthlete("Usian Bolt", "Track", "Jamaica", 32, 9);
		
		//add two pro athletes to the array
		
		allAthletes[count++] = new ProfessionalAthlete("Jonathan Quick", "Ice Hockey", "Milford", 33, 7000000);
		allAthletes[count++] = new ProfessionalAthlete("Calvin Pickard", "Ice Hockey", "Milford", 27, 850500);
		
		
		//Loop through the array and print each athlete to the console
		
		for (int i = 0; i < count; i++)
			{
				System.out.println(allAthletes[i]);
				System.out.println();
			}
			
			System.out.println("Number of Athletes: " + count);
		
	}
}

