import java.util.Scanner;

/**
 * Name:Cameron
 * Teacher:Mr.Hardman
 * Assignment Final Project
 * Date Last Modified: 01/18/2017
 */

public class FinalProject{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		
		//stores users values		
		Scanner userInput = new Scanner(System.in);
		int row=-1;
		int collum=-1;

		boolean player1Win = false;
		boolean player2Win = false;
		initBoard();
		displayBoard();
		
		//Gets information from users
		System.out.println("Player One what is your name?");
		String playerOne = userInput.next(); 
		
		System.out.println("Player Two what is your name?");
		String playerTwo = userInput.next(); 
		
		
		do {
			
		
			//tells player 1 to place 'x' or 'o' in a row
		
			while(row == -1){
				System.out.println(playerOne + ", Please choose a row.");
				row = userInput.nextInt();
			
				//checks if row is filled
				if(board [row][0] != ' ' && board [row][1] != ' ' && board [row][2] != ' '){
					System.out.println("That row is already filled choose another row.");
						row = -1;
				
				
			}
			
		}
		
		while(collum==-1){
			System.out.println(playerOne + ", Please choose a collum.");
			collum=userInput.nextInt();
			
			//checks if collum is filled
			if(board [row][collum] != ' ') {
				System.out.println("That row is already filled choose another collum.");
				
				board[row][collum]= 'O';
				collum=-1;
			
			}

		}
		
		
		while(row==-1){
			System.out.println(playerTwo + ", Please choose a row.");
			row=userInput.nextInt();
			
			if(board [row][collum] != ' ') {
				System.out.println("That row is already filled choose another row.");
				
				board[row][collum] = 'X';
				collum =-1;
				
				
			}
			
		}
		
		while(collum==-1){
			System.out.println(playerTwo + ", Please choose a collum.");
			collum=userInput.nextInt();
			
			if(board [row][0] != ' ' && board [row][1] != ' ' && board [collum][2] != ' '){
				System.out.println("That row is already filled choose another collum.");
				
				collum=-1;
				
				player2Win= checkPlayerTwoWin();
				
				if (player2Win == false  && (board[0][0] == ' ' || board[0][1] == ' ' || board[0][2] == ' ' || board[1][0] == ' ' || board[1][1] == ' ' || board[1][2] == ' ' || board[2][0] == ' ' || board[2][1] == ' ' || board[2][2] == ' ')); 
			}
			
		}
	
		} while (player1Win == false && player2Win == false && (board[0][0] == ' ' || board[0][1] == ' ' || board[0][2] == ' ' || board[1][0] == ' ' || board[1][1] == ' ' || board[1][2] == ' ' || board[2][0] == ' ' || board[2][1] == ' ' || board[2][2] == ' '));	 	
		

	 	
		if(player1Win == true){
			System.out.println("\nCongratulations " + playerOne + " YOU WIN!");
		}
		else if(player2Win == true){
	 		System.out.println("\nCongratulations " + playerTwo + " YOU WIN!"); 	
	 	} 

	 	else if(player2Win== false && player1Win == false){ 
	 			System.out.println("It's a tie, Play again?"); 
	 		} 
	 	
	 	}
			 
	
	public static void initBoard() {
		
	
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
			
		}


	public static void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
		
	}
	
	public static void displayBoard2() { 
		 		for (int r = 0; r < 3; r++) { 
					System.out.print("\t" + r + " "); 
		 			for (int c = 0; c < 3; c++) { 
		 				System.out.print(board[r][c] + " "); 
		 			} 
		 			System.out.println(); 
		 		} 
		 		System.out.println("\t  0 1 2 "); 
		 	} 

	public static boolean checkPlayerOneWin() {
		
		
		boolean playerOneWin =false;
		if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			playerOneWin = true;
			
		}
		return playerOneWin; 
		
	}
		
		
		public static boolean checkPlayerTwoWin() {
	 
			boolean playerTwoWin = false;
	 		if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){ 
	 			 playerTwoWin = true; 
	 		 
	 		}else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){ 
	 			 playerTwoWin = true; 
	 		 
	 		}else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){ 
	 			 playerTwoWin = true; 
	 		 
	 		}else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){ 
	 			 playerTwoWin = true; 
	 		 
	 		}else if(board[1][0] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){ 
	 			 playerTwoWin = true; 
	 		 
	 		}else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){
	 			playerTwoWin = true;
	 			
	 		}else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
	 			playerTwoWin = true;
	 			
	 		}else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){
	 			playerTwoWin = true;
	 		}
	
	 	return playerTwoWin; 
	 		
	 	}
	 		
	}