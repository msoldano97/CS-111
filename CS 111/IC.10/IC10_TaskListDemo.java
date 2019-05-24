/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC10
* LAST MODIFIED: 4/19/2019
********************************************/
/*****************************************************************************
*  IC10_TaskListDemo
*****************************************************************************
* PROGRAM DESCRIPTION:
* 
*****************************************************************************
* ALGORITHM:
* 1. import and initialize the scanner
* 2. create the do while group
* 3. create an array
* 4. prompt the user to enter everything in the array
* 5. convert the int priority into the enum Priority format
* 6. do previous task with a switch statement
* 7. use a for loop to go through the array
* 8. print everything in the array where there is information
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner;
* *****************************************************************************/
import java.util.Scanner;

public class IC10_TaskListDemo {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String name, dueDate, dueTime;
		int priority, count = 0;
		//array of tasks
		
		Task[] taskList = new Task[10];
		
		
		
		
		do 
		{
			System.out.print("Enter task name(or \"quit\" to exit): ");
			 name = keyboard.nextLine();
			if (name.equalsIgnoreCase("quit"))
			break;
			
			 System.out.print("Enter due date (in form MM/DD/YYYY): ");
			 dueDate = keyboard.nextLine();
			 System.out.print("Enter due time(with AM/PM): ");
			 dueTime = keyboard.nextLine();
			 System.out.print("Enter priority(1, 2 or 3): ");
			 priority = keyboard.nextInt();
			 //make a new task object and add it to the array
			 //make a decision on the priority
			 keyboard.nextLine();
			 System.out.println();
			 switch (priority)
			 {
			 case 1:
			 taskList[Task.getTotalTasks()] = new Task(name, dueDate, dueTime, Priority.HIGH);
			 break;
			 case 2:
			 taskList[Task.getTotalTasks()] = new Task(name, dueDate, dueTime, Priority.MEDIUM);
			 break;
			 case 3:
			 taskList[Task.getTotalTasks()] = new Task(name, dueDate, dueTime, Priority.LOW);
			 break;
		}
	}
		while (!name.equalsIgnoreCase("quit"));
		System.out.println();
		System.out.println("~~~Below are the " + Task.getTotalTasks() + " Tasks to Complete~~~");
		//after loop, print out all the tasks
		for (int i = 0; i < Task.getTotalTasks(); i++)
		System.out.println(taskList[i]);
		
		//check with nested for loops if any of the tasks are equal?
		//System.out.println("are their equal tasks?" + 
		
		/* 
		 * Dumby task:
		 * Task aceFinal = new Task("Ace CS 111!", "05/24/2019", "10:50am", Priority.HIGH);
		 * System.out.println(aceFinal);
		 * */
		//~~~Below are the " + sTotalTasks + " Tasks to Complete~~~"
	}
}

