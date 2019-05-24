/********************************************
* AUTHOR: Matt Soldano
* COURSE: CS 111 Intro to CS I - Java
* SECTION: Friday 9am
* IC (PROJECT)#: IC09
* LAST MODIFIED: 4/5/2019
********************************************/
/*****************************************************************************
*  IC09_TicTacToe
*****************************************************************************
* PROGRAM DESCRIPTION:
* Write a program that allows two players to play a game of tic-tac-toe. 
* Use a two-dimensional character array with three rows and three columns 
* as the game board. At the start of each game, every element of the array 
* should be initialized with an asterisk (*).

The program should run a loop that:  

•  Displays the contents of the board array  
•  Allows player 1 to select a location on the board for an X. The program 
* should ask the user to enter the row and column number.  
•  Allows player 2 to select a location on the board for an O. The program 
* should ask the user to enter the row and column number.  
•  Determines whether a player has won, or a tie has occurred. If a player 
* has won, the program should declare that player the winner and end.  If
* a tie has occurred, the program should say so and end.  

Player 1 wins when there are three Xs in a row on the game board. The Xs  
* can appear in a row, in a column, or diagonally across the board.  The 
* same conditions hold for player 2, except that it's three Os in a row.
* A tie occurs when all of the locations on the board are full, but there
* is no winner. 
*****************************************************************************
* ALGORITHM:
* 1. Create the constants for the rows and the columns
* 2. create a 2D char array for the board
* 3. make a for loop to put stars in all the spaces
* 4. make all the exceptions for a winner
* 5. make a method for when the game is a draw
* 6. have the game end after 9 moves
*****************************************************************************
* ALL IMPORTED PACKAGES NEEDED AND PURPOSE:
* import java.util.Scanner
* *****************************************************************************/
import java.util.Scanner;

public class IC09_TicTacToe {
	//put constants above main so that they can be used anywhere
	
	public static final int ROWS = 3;
		public static final int COLS = 3;
		
	public static void main (String args[]) {
		
		int row, col, moves = 0;
		Scanner keyboard = new Scanner(System.in);
		char[][] board = new char[ROWS][COLS];
		
		for (int i = 0; i < ROWS; i++)
		{
			for (int j = 0; j < COLS; j++)
			{
				board[i][j] = '*';
			}
		}
		
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println();
			do {
				
		printBoard(board);
		System.out.print("Please enter row: ");
		row = keyboard.nextInt() - 1;
		System.out.print("Please enter column: ");
		col = keyboard.nextInt() - 1;
		System.out.println();
		
		board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
		
		
		if (board[0][0] != '*' && board[0][0] == board[0][1] && board[0][1] == board[0][2])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		//finish the other 7 conditions
		else if (board[0][0] != '*' && board[0][0] == board[1][0] && board[1][0] == board[2][0])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		else if (board[1][0] != '*' && board[1][0] == board[1][1] && board[1][1] == board[1][2])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		else if (board[2][0] != '*' && board[2][0] == board[2][1] && board[2][1] == board[2][2])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		else if (board[0][1] != '*' && board[0][1] == board[1][1] && board[1][1] == board[2][1])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		else if (board[0][2] != '*' && board[0][2] == board[1][2] && board[1][2] == board[2][2])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		//diagonal
		else if (board[0][0] != '*' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		else if (board[0][2] != '*' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
			System.out.println();
			System.out.println("Player " + ((moves % 2 == 0) ? 'X' : 'O')  + " WINS!!!");
			moves = 9;
		}
		else if (moves == 9)
		{
			board[row][col] = ((moves % 2 == 0) ? 'X' : 'O');
			printBoard(board);
		System.out.println();
		System.out.println("It's a stale mate!");
		}
		
		
		moves++;
	} while (moves <= 9);
		
			
		
	}
	public static void printBoard(char[][] board)
	{
		for (int i = 0; i < ROWS; i++)
		{
			System.out.println("-------------");
			//Start of each row
			for (int j = 0; j < COLS; j++)
			{
				//Start of each column
				
				System.out.print("| " + board[i][j] + " ");
				
			}
			//end of reach row
			System.out.println("|");
		}
		//end of the object
		System.out.println("-------------");
	}
}


