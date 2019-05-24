/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC10
* LAST MODIFIED: 4/19/2019
********************************************/
/*****************************************************************************
*  IC10_TaskList
*****************************************************************************
* PROGRAM DESCRIPTION:
* In this assignment, we will be creating a Task List to keep track of things we need to do, 
* a due date, deadline time and priority (HIGH=1, MEDIUM=2, LOW=3).  For example, one Task 
* might be "Ace CS 111 Final Exam", "05/24/2019", "10:50 AM", HIGH
*****************************************************************************
* ALGORITHM:
* 1. create the private and static variables
* 2. create the constructor
* 3. create all getters and setters
* 4. use the enum class created in a seperate file
* 5. check the equality
* 6. print the toString
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class Task{
	
	private String mDueDate, mName, mDueTime;
	private Priority mPriority;
	private static int sTotalTasks = 0;
	
	public Task(String name, String dueDate, String dueTime, Priority priority)
	{
		mName = name;
		mDueDate = dueDate;
		mDueTime = dueTime;
		mPriority = priority;
		sTotalTasks++;
	}
	public Task(Task other)
	{
		mName = other.mName;
		mDueDate = other.mDueDate;
		mDueTime = other.mDueTime;
		mPriority = other.mPriority;
		sTotalTasks++;
	}
	public String getName()
	{
		return mName;
	}
	public String getDueDate()
	{
		return mDueDate;
	}
	public String getDueTime()
	{
		return mDueTime;
	}
	public Priority getPriority()
	{
		return mPriority;
	}
	public static int getTotalTasks()
	{
		return sTotalTasks;
	}
	public void setDueDate(String newDueDate)
	{
		mDueDate = newDueDate;
	}
	public void setName(String newName)
	{
		mName = newName;
	}
	public void setDueTime(String newDueTime)
	{
		mDueTime = newDueTime;
	}
	public void setPriority(Priority newPriority)
	{
		mPriority = newPriority;
	}
	public boolean equals(Task other)
	{
		if (!mName.equalsIgnoreCase(other.mName))
		return false;
		if (!mDueDate.equalsIgnoreCase(other.mDueDate))
		return false;
		if (!mDueTime.equalsIgnoreCase(other.mDueTime))
		return false;
		if (mPriority != other.mPriority)
		return false;
		
		return true;
	}
	
	public String toString()
	{
		String output = "Task [Name=" + mName + ", Due Date=" + mDueDate + ", Due Time=" + mDueTime + ", Priority=" +
		mPriority + "]";
		return output;
	}

}

