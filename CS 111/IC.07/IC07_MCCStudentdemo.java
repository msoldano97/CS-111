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
* 1. Test the equals operator (next time use copy constructor to test as well)
*  (also comment out test)
* 2. Prompt the user to enter all their info
* 3. Display their info
* 4. Ask if they would like to change their info
* 5. Display their info again
* 6. Create a second student
* 7. Have the new student follow the same process
* 8. Check and see if the students are the same
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* *****************************************************************************/
import java.util.Scanner;

public class IC07_MCCStudentdemo {
	
	public static void main (String args[]) {

	String surfID, fullName, newAge, newGPA, newName, createNewName;
	int age,createNewAge;
	double GPA, createNewGPA;
	String surfID2, fullName2, newAge2, newGPA2, newName2, createNewName2;
	int age2,createNewAge2;
	double GPA2, createNewGPA2;
	
	//testing purposes
	/*MCCStudent testStudent1 = new MCCStudent(15, 3.5, "1", "Bob");
	MCCStudent testStudent2 = new MCCStudent(23, 1.4, "1", "Charlie");
	System.out.println("Students the same? " + testStudent1.equals(testStudent2));
	*/
	

	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter your Surf ID: ");
	surfID = keyboard.nextLine();
	System.out.print("Please enter your full name: ");
	fullName = keyboard.nextLine();
	System.out.print("Please enter your age: ");
	age = keyboard.nextInt();
	System.out.print("Please enter your gpa: ");
	GPA = keyboard.nextDouble();
	keyboard.nextLine();
	
	MCCStudent newStudent = new MCCStudent(age, GPA, surfID, fullName);
	System.out.println(newStudent);
	
	System.out.println("\nWould you like to change your name? (yes or no): ");
	newName = keyboard.nextLine();
	if (newName.toLowerCase().equals("yes"))
	{
		System.out.println("Your new name is: ");
		createNewName = keyboard.nextLine();
		fullName = createNewName;
		newStudent = new MCCStudent(age, GPA, surfID, fullName);
	}
	else
	{
		createNewName = fullName;
	}
	System.out.println("Would you like to change your age? (yes or no): ");
	newGPA = keyboard.nextLine();
	if (newGPA.toLowerCase().equals("yes"))
	{
		System.out.println("Your new age is: ");
		createNewAge = keyboard.nextInt();
		keyboard.nextLine();
		age = createNewAge;
		newStudent = new MCCStudent(age, GPA, surfID, fullName);
		
	}
	else
	{
		createNewAge = age;
	}
	System.out.println("Would you like to change your GPA? (yes or no): ");
	newAge = keyboard.nextLine();
	if (newAge.toLowerCase().equals("yes"))
	{
		System.out.println("Your new GPA is: ");
		createNewGPA = keyboard.nextDouble();
		keyboard.nextLine();
		GPA = createNewGPA;
		newStudent = new MCCStudent(age, GPA, surfID, fullName);
		
		
	}
	else
	{
		createNewGPA = GPA;
	}
		
	System.out.println(newStudent);
	
	
	// second student to compare
	System.out.println("\nNext Student:");
	
	
	System.out.print("\nPlease enter your Surf ID: ");
	surfID2 = keyboard.nextLine();
	System.out.print("Please enter your full name: ");
	fullName2 = keyboard.nextLine();
	System.out.print("Please enter your age: ");
	age2 = keyboard.nextInt();
	System.out.print("Please enter your gpa: ");
	GPA2 = keyboard.nextDouble();
	keyboard.nextLine();
	
	MCCStudent newStudent2 = new MCCStudent(age2, GPA2, surfID2, fullName2);
	System.out.println(newStudent2);
	
	System.out.println("\nWould you like to change your name? (yes or no): ");
	newName2 = keyboard.nextLine();
	if (newName2.toLowerCase().equals("yes"))
	{
		System.out.println("Your new name is: ");
		createNewName2 = keyboard.nextLine();
		fullName2 = createNewName2;
		newStudent2 = new MCCStudent(age2, GPA2, surfID2, fullName2);
	}
	else
	{
		createNewName2 = fullName2;
	}
	System.out.println("Would you like to change your age? (yes or no): ");
	newGPA2 = keyboard.nextLine();
	if (newGPA2.toLowerCase().equals("yes"))
	{
		System.out.println("Your new age is: ");
		createNewAge2 = keyboard.nextInt();
		keyboard.nextLine();
		age2 = createNewAge2;
		newStudent2 = new MCCStudent(age2, GPA2, surfID2, fullName2);
		
	}
	else
	{
		createNewAge2 = age2;
	}
	System.out.println("Would you like to change your GPA? (yes or no): ");
	newAge2 = keyboard.nextLine();
	if (newAge2.toLowerCase().equals("yes"))
	{
		System.out.println("Your new GPA is: ");
		createNewGPA2 = keyboard.nextDouble();
		keyboard.nextLine();
		GPA2 = createNewGPA2;
		newStudent2 = new MCCStudent(age2, GPA2, surfID2, fullName2);
		
		
	}
	else
	{
		createNewGPA2 = GPA2;
	}
	System.out.println(newStudent2);
	
	
	//equals check
	
	System.out.println("\nStudents the same? " + newStudent.equals(newStudent2));
	
	}
}

