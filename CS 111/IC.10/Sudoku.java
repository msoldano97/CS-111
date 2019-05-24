/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC10
* LAST MODIFIED: 4/19/2019
********************************************/
/*****************************************************************************
*  IC10_Sudoku
*****************************************************************************
* PROGRAM DESCRIPTION:
* Build the sudoku game
*****************************************************************************
* ALGORITHM:
* 1. Declare the size of the columns and rows of the board
* 2. hard code the initial puzzle, the solved puzzle and the cheat puzzle
* 3. make a public puzzle called workingPuzzle which will store the users values
* 4. develop the puzzle board called printPuzzle
* 5. create the inteface where it prompts the user to set, reset or quit
* 6. if they choose to set, then prompt them to what they want to set and store that value
* 7. if they choose to reset, reset the board
* 8. if they choose to quit, exit the program
* 9. make a nested for loop for checking if the solved puzzle equals the wolrking puzzle
* 10.check if the game is complete and notify the user when they win and exit the program
* 11. create a cheat puzzle to check if everything works quickly
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* Scanner
* *****************************************************************************/
import java.util.Scanner;

public class Sudoku {
	
	private static final int COLS = 9;
	private static final int ROWS = 9;
	public static final int[][] INITIAL_PUZZLE = {

{9,0,0,8,0,5,0,0,6},

{1,0,3,0,0,0,5,0,4},

{0,6,0,0,2,0,0,7,0},

{0,0,7,1,0,8,6,0,0},

{4,0,0,0,0,0,0,0,9},

{0,0,9,7,0,3,1,0,0},

{0,9,0,0,1,0,0,6,0},

{3,0,2,0,0,0,4,0,7},

{5,0,0,3,0,2,0,0,1}

};
	public static final int[][] SOLVED_PUZZLE = {

{9,7,4,8,3,5,2,1,6},

{1,2,3,9,6,7,5,8,4},

{8,6,5,4,2,1,9,7,3},

{2,3,7,1,9,8,6,4,5},

{4,8,1,2,5,6,7,3,9},

{6,5,9,7,4,3,1,2,8},

{7,9,8,5,1,4,3,6,2},

{3,1,2,6,8,9,4,5,7},

{5,4,6,3,7,2,8,9,1}

};
public static final int[][] CHEAT_PUZZLE = {

{1,7,4,8,3,5,2,1,6},

{1,2,3,9,6,7,5,8,4},

{8,6,5,4,2,1,9,7,3},

{2,3,7,1,9,8,6,4,5},

{4,8,1,2,5,6,7,3,9},

{6,5,9,7,4,3,1,2,8},

{7,9,8,5,1,4,3,6,2},

{3,1,2,6,8,9,4,5,7},

{5,4,6,3,7,2,8,9,1}

};
	public static int[][] workingPuzzle = new int[ROWS][COLS];
	
	public static void resetPuzzle()
		{
		workingPuzzle = INITIAL_PUZZLE;
	}
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String toDo;
		int row = 0, col = 0;
		int number = 0;
		System.out.println("Sudoku Game:\nThe puzzle is:\n");
		resetPuzzle();
		do {
		printPuzzle();
		System.out.println("What would you like to do?\n" +
		"Set a square (S), Reset puzzle (R) or Quit (Q)");
		toDo = keyboard.nextLine();
		if (toDo.equalsIgnoreCase("S"))
		{
		System.out.println("Which row (1-9) and column (1-9) do you want to change?");
		row = keyboard.nextInt();
		col = keyboard.nextInt();
		System.out.println("What should the value (1-9) be?");
		number = keyboard.nextInt();
		workingPuzzle[row - 1][col - 1] = number;
		System.out.println();
		keyboard.nextLine();
	}
	if (toDo.equalsIgnoreCase("F"))
		{
			workingPuzzle = CHEAT_PUZZLE;
		}
		if (toDo.equalsIgnoreCase("R"))
		{
			resetPuzzle();
		}
		if (toDo.equalsIgnoreCase("Q"))
		{
			return;
		}
		if (gameIsWon() == true) {
			
			printPuzzle();
			System.out.println();
			System.out.println("C*O*N*G*R*A*T*U*L*A*T*I*O*N*S, you WON Sudoku!!!");
			return;
		}
	
		// keyboard.nextLine();
		}while (!toDo.equalsIgnoreCase("Q"));
	}	
		
	public static void printPuzzle(){
	System.out.println("  C  1  2  3  4  5  6  7  8  9\n" + 
					 "R  ---------------------------");
	for (int i = 0; i < ROWS; i++)
	{
		System.out.print(i + 1 + "  |");
		for (int j = 0; j < COLS; j++)
		{
					if (workingPuzzle[i][j] == 0)
					System.out.print(" . ");
					
					else
					System.out.print(" " + workingPuzzle[i][j] + " ");
				}
				System.out.println();
			}
					 
}

public static boolean gameIsWon()
{
	
	for (int i = 0; i < ROWS; i++)
	{
		for (int j = 0; j < COLS; j++)
		{
			if (workingPuzzle[i][j] != SOLVED_PUZZLE[i][j])
			{
				return false;
			}
		}
	}
	return true;
}

}

