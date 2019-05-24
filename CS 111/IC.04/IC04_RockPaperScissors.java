/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC04
* LAST MODIFIED: 2/22/2019
********************************************/
/*****************************************************************************
* IC04_RockPaperScissors
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a Java console application to play the rock-paper-scissor game.  
*  Each of two users types in either "P", "R" or "S" (without quotes).  
*  Your code will then announce the winner, as well as the basis for 
*  determining the winner: paper covers rock, rock breaks scissors, 
*  scissors cut paper, or it's a draw.  Your program should allow the 
*  user to use lowercase as well as uppercase letters.
*****************************************************************************
* ALGORITHM:
* 1. Create the rules in a stsic method to show at the beginning of every game
* for each player
* 2. Make swtich and case statements for every possible outcome
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner;
*****************************************************************************/
import java.util.Scanner;


//NOT COMPLETE
//need the invalid choice mechanism
//maybe if/else statement


public class IC04_RockPaperScissors {
	// If both p1 and p2 are "r"
	// if (p1.equals("R") && p2.equals("R"))
	// {
	// System.out.println("It's a draw...");
	
	public static void main (String args[]) {
		String p1, p2;
		Scanner keyboard = new Scanner(System.in);
		
		rules("one");
		p1 = keyboard.nextLine() .toUpperCase();
		
		rules("two");
		p2 = keyboard.nextLine().toUpperCase();
		
		switch (p1) 
		{
			case "R" :
				switch (p2)
				{
					case "R":
					{System.out.println("It's a draw! Rock befriends rock.");
				}
					break;
					case "P":
					{System.out.println("Player 2 wins! Paper covers rock.");
				}
					break;
					case "S":
					{System.out.println("Player 1 wins! Rock destroys scissors.");
				}
					break;
					default:
					{System.out.println("You have entered an invalid choice. Please enter R, P or S only. Goodbye!");
			}
		}
		break;
			case "S" :
				switch (p2)
				{
					case "R":
					{System.out.println("Player 2 wins! Rock destroys scissors.");
				}
					break;
					case "P":
					{System.out.println("Player 1 wins! Scissors cut paper.");
				}
					break;
					case "S":
					{System.out.println("It's a draw! Scissors befriends Scissors.");
				}
					break;
					default:
					{System.out.println("You have entered an invalid choice. Please enter R, P or S only. Goodbye!");
			}
					
			}
			break;
				case "P" :
				switch (p2) 
				{
					case "R":
					{System.out.println("Player 1 wins! Paper covers rock.");
				}
					break;
					case "P":
					{System.out.println("It's a draw! Paper befriends paper.");
				}
					break;
					case "S":
					{System.out.println("Player 2 wins! Scissors cut paper.");
				}
					break;
					default:
					{System.out.println("You have entered an invalid choice. Please enter R, P or S only. Goodbye!");
			}
			break;
					
			}
			break;
			default:
					{System.out.println("You have entered an invalid choice. Please enter R, P or S only. Goodbye!");
			}
			break;
		}
				
			
}
	public static void rules(String player) {
	System.out.print("Player " + player + " - Enter R for Rock, P for Paper, S for Scissors: ");
}
	
}

