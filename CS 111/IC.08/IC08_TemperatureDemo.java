/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC08
* LAST MODIFIED: 4/5/2019
********************************************/
/*****************************************************************************
	* IC08_TemperatureDemo
*****************************************************************************
* PROGRAM DESCRIPTION:
* To create a driver class (TemperatureDemo) to make two temperature objects 
* (in Celsius and Fahrenheit), two of which are the same essential temperatures, 
* but in different units.  Check the two equivalent temperatures for equality.  
* Print both temperatures to the console
*****************************************************************************
* ALGORITHM:
* 1. Create two test temperatures with the temperature and units put in
* 2. Print the temperatures to the console 
* 3. Test if the temperatures are the same
* 4. Test the mutators by changing the units and print the new temperatures out
* 5. Test if the new temperatures are the same
* 6. Make sure there are false and true statements for equality of temperature
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/



public class IC08_TemperatureDemo {
	
	public static void main (String args[]) {
		
		Temperature testTemperature1 = new Temperature(60.3, "Fahrenheit");
		Temperature testTemperature2 = new Temperature(60.3, "Celsius");
		
	System.out.println(testTemperature1);
	System.out.println(testTemperature2);
	System.out.println("Temperatures equal? " + testTemperature1.equals(testTemperature2));
	System.out.println();
	testTemperature1.setUnits("Celsius");
	System.out.println(testTemperature1);
	System.out.println(testTemperature2);
	System.out.println("Temperatures equal? " + testTemperature1.equals(testTemperature2));
	System.out.println();
	testTemperature1.setDegrees(100);
	testTemperature2.setDegrees(0);
	System.out.println(testTemperature1);
	System.out.println(testTemperature2);
	System.out.println("Temperatures equal? " + testTemperature1.equals(testTemperature2));
	
	}
}

