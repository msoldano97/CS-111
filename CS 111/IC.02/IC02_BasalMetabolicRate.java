
import java.util.Scanner;
import java.text.DecimalFormat;
public class IC02_BasalMetabolicRate {
	
	public static void main (String args[]) {
		double weight, height, age, fCalories, mCalories, fcBars, mcBars;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat fCals = new DecimalFormat ("0");
		DecimalFormat mCals = new DecimalFormat ("0");
		DecimalFormat fCalBars = new DecimalFormat ("0.0");
		DecimalFormat mCalBars = new DecimalFormat ("0.0");
		
		
		System.out.print("Please enter your own weight (lb): ");
		weight = keyboard.nextInt();
		System.out.print("Please enter your own height (in): ");
		height = keyboard.nextInt();
		System.out.print("Please enter your age: ");
		age = keyboard.nextInt();
		
		fCalories = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
		System.out.print("\n\nBMR (female): " + fCals.format(fCalories) + " calories");
		mCalories = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
		System.out.print("\nBMR (male) : " + mCals.format(mCalories) + " calories");
		
		System.out.println("\n*BMR is essentially the amount of calories a person \n burns when dormant for a day");
		
		fcBars = fCalories / 230;
		System.out.print("\n\nIf you are a female, you would need to consume " + fCalBars.format(fcBars) + " chocolate bars to maintain\n weight.");
		mcBars = mCalories / 230;
		System.out.print("\nIf you are a male, you would need to consume " + mCalBars.format(mcBars) + " chocolate bars to maintain\n weight.");
		
		System.out.println("\n*A typical chocolate bar contains about 230 calories");
	}
}

