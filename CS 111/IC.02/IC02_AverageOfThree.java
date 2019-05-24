//Import all libraries other than String, int, double, char, and boolean
import java.util.Scanner;
public class IC02_AverageOfThree {
	
	public static void main (String args[]) {
		
		//At the top of the main method, declare ANY needed variables
		//3 ints, 1 double, 1 Scanner
		int number1, number2, number3;
		double average;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter number 1: ");
		//get user input from Scanner
		number1 = keyboard.nextInt();
		
		System.out.print("Please enter number 2: ");
		//get user input from Scanner
		number2 = keyboard.nextInt();
		
		System.out.print("Please enter number 3: ");
		//get user input from Scanner
		number3 = keyboard.nextInt();
		
		//average three numbers together then display it to the monitor
		average = (number1 + number2 + number3) / 3.0 ;
		System.out.println("\nThe average of the three numbers is: " + average);
		
		
// Main method = entry point for code (program begins)	
	
	}
}

