import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;



public class Studying {
	
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int menu;
		
		
		System.out.println("Please pick from the following menu:");
		
		System.out.println("   Pick 1 for a for loop." +
						 "\n   Pick 2 for a nested loop." +
						 "\n   Pick 3 for reading data." +
						 "\n   Pick 4 if you want to go on break.");
		menu = keyboard.nextInt();
		
		
		
		switch (menu) {
		
		case (1):
		
		System.out.println();
		for (int i = 1; i <= 100; i++)
		{
			if (i % 5 == 0)
			{
				System.out.print("! ");
			}
			else
			{
				System.out.print(i + " ");
			}
	}
		break;
		case (2):
		System.out.println();
		
		for (int r = 1; r <= 4; r++)
		{
			for (int s = 1; s <= r; s++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		break;
		
		case (3):
		System.out.println();
		
		try
	{
		Scanner fileScanner = new Scanner(new File("VideoGameSalesGlobal.txt"));
		int count = 0;
		double sum = 0, avg, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sales;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		DecimalFormat commas = new DecimalFormat("###,###,###");
		
		
		while (fileScanner.hasNextDouble())
	{	
		sales = fileScanner.nextDouble();
		
		if (sales < min)
	{	
		min = sales;
	}
		if (sales > max)
	{
		max = sales;
	}
		sum += sales;
		count ++;
	}
	fileScanner.close();
		sum = sum * 1000000;
		max = max * 1000000;
		min = min * 1000000;
			System.out.println("****************************************" +
							 "\n*    Video Games Sales: 1980 - 2017    *" +
							 "\n****************************************");
			System.out.println("Number of video games reported: " + commas.format(count));
			System.out.println("\nTotal Global Sales: " + currency.format(sum));
			avg = (sum / count);
			System.out.println("Average Global Sales: " + currency.format(avg));
			System.out.println("Biggest Global Sales: " + currency.format(max));
			System.out.println("Worst Global Sales: " + currency.format(min));
			
			
			
	}
		
		catch (FileNotFoundException e)
	{
		System.err.println("Error, File Not Found.");
		System.exit(0);
		
	}
		
		
		break;
		
		case (4):
		System.out.println();
		System.out.println("Have a nice Spring Break!!!!!");
		System.exit(0);
		
		break;
		
		default:
		
		System.err.println("Please choose a valid number");
		System.exit(0);
	}
		
	}
}

