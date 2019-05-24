/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC11
* LAST MODIFIED: 4/26/2019
********************************************/
/*****************************************************************************
*  IC11_SearchingAndSorting
*****************************************************************************
* PROGRAM DESCRIPTION:
* In this program, you will be writing Java code to search and sort an array using an 
* algorithm known as Selection Sort. We will be constructing a class named ArrayUtils 
* that will provide static utility methods to search and sort arrays.
*****************************************************************************
* ALGORITHM:
* 1) We will create a static method to find the index of the minimum element in an array, 
* starting from a specific index.  This method can be defined as: 
* public static int indexOfMin(int[ ] array, int startIndex)
* 
* This method will loop through the array and return the index of the minimum element,
* beginning from the start index (ignores all earlier indices)
* For example, if we have an array:
* 
* int[] numbers = {42, 16, 84, 12, 77, 26, 53};
* 
* and we call the method:
* 
* indexOf(numbers, 0)
* 
* the index of 3 should be returned (since element 12 is the min, starting at index 0)
* 
* However, if we call:
* 
* indexOf(numbers, 4)
* 
* the index of 5 should be returned (since element 26 is the min, when starting at index 4)
* 
* 2) Next, we will create a method to sort the array in ascending order, using the Selection Sort 
* algorithm pictured above.  In selection sort, the minimum element of the array is located and 
* then moved to the beginning of the array (index 0).  Whatever element was in that index is than 
* swapped with the minimum element.  Then, the next smallest element is located and swapped with 
* index 1, then index 2, etc, etc.
* 
* The method can be defined as:
* 
* public static void selectionSort(int[ ] array)
* 
* It does not have a return value (e.g. void) because the method just sorts the array, 
* but does not return any specific value.
* 
* 3) Finally, we will create a method to reverse the order of the array, so we can provide 
* a utility to sort the array in descending order (after using selection sort).
* 
* The method can be defined as:
* 
* public static void reverse(int[ ] array)
* 
* It does not have a return value (e.g. void) because the method just reverses the order of the 
* array, but does not return any specific value.
* 
* For example, after sorting, the numbers array  [12, 16, 26, 42, 53, 77, 84]
* 
* If we call:
* 
* reverse(numbers)
* 
* and then print the array, we should see the elements
* 
* [84, 77, 53, 42, 26, 16, 12]
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* none
* *****************************************************************************/


public class ArrayUtils {
	

	public static int indexOfMin(int[] array, int startIndex)
	{
		int min = Integer.MAX_VALUE;
		
		for (int i = startIndex; i < array.length; i++)
		{
			if (array[i] < min)
			min = array[i];
		}
		return min;
	}
	
	public static void selectionSort(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			int index = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int low = array[index];
			array[index] = array[i];
			array[i] = low;
		}
	}		
	
	public static void reverse(int[] array)
	{		
		for (int i = 0; i < array.length; i++)
		{
			int index = i;
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[j] > array[index]) {
					index = j;
				}
			}
			int high = array[index];
			array[index] = array[i];
			array[i] = high;
		}
		
	}
}

