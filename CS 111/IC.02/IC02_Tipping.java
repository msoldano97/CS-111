import java.util.Scanner;
import java.text.DecimalFormat;
public class IC02_Tipping {
	
	public static void main (String args[]) {
		double amount, percentage, taxes, tip, total;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat total2 = new DecimalFormat ("0.00");
		DecimalFormat tax = new DecimalFormat ("0.00");
		DecimalFormat tip2 = new DecimalFormat ("0.00");
		
		System.out.print("Please enter amount of restaurant bill: $ ");
		amount = keyboard.nextInt(); 
		System.out.print("Please enter the tip percentage (%): ");
		percentage = keyboard.nextInt();
		
		taxes = amount * .0775;
		System.out.print("\nThe total taxes are: " + tip2.format(taxes));
		
		tip = (amount) * (percentage / 100);
		System.out.print("\nThe tip amount is: " + tax.format(tip));
		
		total = amount + tip + taxes;
		System.out.println("\n\nThe total amount to pay is: $ " + total2.format(total));
		//decimal places
	}
}

