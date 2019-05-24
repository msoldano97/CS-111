/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC07
* LAST MODIFIED: 3/29/2019
********************************************/
/*****************************************************************************
* IC07_DogDemo
*****************************************************************************
*  PROGRAM DESCRIPTION:
* Once your Dog class is finished, please create a driver class named IC07_DogDemo with a main() 
* method that does the following:
* Creates a new Dog object named "scooby" with the following information:
* name = "Scooby"
* breed = "Great Dane"
* age = 7
* Creates another Dog object named "myDog" by copying scooby.  
* Print both objects to the console.
* Compare the two Dogs using the equals method. If the Dogs are equal, 
* print the message "Both dogs are the same."  Otherwise print the message "The dogs are different."
* Now, change each of the fields for "myDog" with mutators (set...) to the following values 
* (if you have a dog, feel free to use your pet's info below instead):
* name = "Toby" 
* breed = "Terrier"
* age = 2
* Print both objects to the console
* Once more, compare the two Dogs using the equals method.  If the Dogs are equal, 
* print the message "Both dogs are the same."  Otherwise print the message "The dogs are different."
*****************************************************************************
* ALGORITHM:
* 1. Create a new dog
* 2. Create my dog
* 3. Test setters
* 4. Test equals operator
* 5. Print to console the two dogs information
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/

public class IC07_DogDemo {
	
	public static void main (String args[]) {
		// Let's create a dog Scooby.
		// Parameterized constructor:
		Dog scooby = new Dog("Scooby", "Great Dane", 7.0);
		
		// Copy constructor
		// Copies all values from Scooby into myDog
		Dog myDog = new Dog(scooby);
		//Change the dog's name
		myDog.setName("Laika");
		myDog.setBreed("Sammoid");
		myDog.setAge(16.0);
		System.out.println("Dog's same? " + scooby.equals(myDog));
		// Let's display both dogs to console
		System.out.println(scooby);
		System.out.println(myDog);
		
	}
}

