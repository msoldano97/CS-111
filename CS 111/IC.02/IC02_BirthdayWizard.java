import java.util.Scanner;
public class IC02_BirthdayWizard {

	public static void main (String args[]) {
		int birthyear, age, futureAge, year;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your birth year...\n");
		birthyear = keyboard.nextInt();
		age = 2019 - birthyear;
		System.out.print("You are roughly " + age + " years old.\n");
		
		System.out.print("Please enter a future age...\n");
		futureAge = keyboard.nextInt();
		year = futureAge + birthyear;
		System.out.println("You will be " + futureAge + " in the year " + year + '.');
		
		
		
		
	}
}

