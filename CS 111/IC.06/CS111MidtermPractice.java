import java.util.Scanner;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;


public class CS111MidtermPractice {
	
	public static void main (String args[]) {
		int menu;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number from the following menu");
		System.out.println("   1. For Loop" +
						 "\n   2. Nested For Loop" +
						 "\n   3. Data File Statistics" +
						 "\n   4. Leave for Break");
			menu = keyboard.nextInt();
			
			
			switch (menu)
			
			{
				case (1):
				System.out.println();
				
				for (int i = 1; i <= 100; i++)
			{	
				if (i%5 == 0)
			{	System.out.println("alive ");
				
			}
				else
			{	System.out.print(i%5 + ",");
			}
		}
				break;
				case (2):
				System.out.println();
				for (int r = 1; r <= 3; r++)
				{	
					for (int t = 1; t <= (r - 1); t++)
					{
						System.out.print("~");
					}
					for (int s = 1; s <= (7 - 2*r); s++)  
					{
						System.out.print("*");
					}
					
					for (int tTwo = 1; tTwo <= (r - 1); tTwo++)
					{
						System.out.print("~");
					}
					System.out.println();
				}
					
		
		
		
		
				break;
				case (3):
				System.out.println();
				try {
				Scanner fileScanner = new Scanner(new File("Grades.txt"));
				int count = 0;
				double sum = 0.0, max = Double.MIN_VALUE, min = Double.MAX_VALUE, avg, grades = 0;
				DecimalFormat oneD = new DecimalFormat("###,###.##");
				
				while (fileScanner.hasNextDouble())
			{
				// Read a number from file
				grades = fileScanner.nextDouble();
					if (grades < min)
			{
						min = grades;
			}
					if (grades > max)
			{
						max = grades;
			}
			sum += grades;
			count++;
		}
		fileScanner.close();
				
				System.out.println("**********************************\n" +
								   "*   Midterm Grades Spring 2019   *\n" +
								   "**********************************");
				System.out.println("Amount of Students that took the midterm: " + count);
				System.out.println("\nAll Grades Added Together (sum): " + oneD.format(sum));
				avg = sum / count;
				System.out.println("Average Grade for the Midterm: " + oneD.format(avg) + "%");
				System.out.println("Max Grade for the Midterm: " + oneD.format(max) + "%");
				System.out.println("Min Grade for the Midterm: " + oneD.format(min) + "%");
				
				
				
			}
				catch (FileNotFoundException e)
			{
					System.err.println("File Not Found");
					System.exit(0);
			}
				
				break;
				case (4):
				System.out.println();
				System.out.println("Have a Great Spring Break!!!");
				System.exit(0);
				
				
				break;
				default: 
				System.out.println();
				System.out.println("Please enter a valid number.\n\nGoodbye.");
				System.exit(0);
				
		
	}
		
		
		
	}
}

