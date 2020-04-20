# TIC-TAC-TOE

   Two players take turns marking an available cell in 3 X 3 Game board with their respective tokens (either "X" or "O"). When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. A draw (no winner) occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win.
   
   ## Purpose:

  This game is developed using Java programming language using TDD (Test Driven Development)
  
   ## Problem Statement/Rules
   
   X always goes first.

   Players cannot play on a played position.

   Players alternate placing X’s and O’s on the board until either:

        One player has three in a row, horizontally, vertically or diagonally

        All nine squares are filled.

   If a player is able to draw three X’s or three O’s in a row, that player wins.

   If all nine squares are filled and neither player has three in a row, the game is a draw.

   ##Use-Cases:

	- When Game starts, it assigns to first player with "X"
	
	- Game will Alternate the players, 
		 Mark the token as "O" if the previous choice is "X"
		 Mark the token as "X" if the previous choice is "O"
		
	- Game will not allow the user to choose a position outside grid size
	
	- Game will not allow the player to use an already chosen position
	
	- Game will declare first player as winner and stop,
		 If token is "X" in one of the 3 Horizontal rows.
		 If token is "X" in one of the 3 Vertical Columns.
		 If token is "X" in one of the 2 diagonals (top-left to bottom-right and top-right to bottom-left)
		
	- Game will declare second player as winner and stop,
		 If token is "O" in one of the 3 Horizontal rows.
		 If token is "O" in one of the 3 Vertical Columns.
		 If token is "O" in one of the 2 diagonals  (top-left to bottom-right and top-right to bottom-left).
		
	- Game will be  declared as draw,
		 If all nine squares are filled with no winning combination
		
	- Display game result to Players (optional)
		 Print game board in console.