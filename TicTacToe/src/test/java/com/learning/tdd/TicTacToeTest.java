package com.learning.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class TicTacToeTest {
	

	private String firstPlayer = "firstPlayer";
	private String secondPlayer = "secondPlayer";
	char[][] gameBoard;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
	    gameBoard = TicTacToeGameBoard.gameBoard();
	} 
	
	
	@Test
	public void firstPlayerShouldAssignSymbolX() {
		int firstPlayerposition = 1;
	    Assertions.assertEquals('X', TicTacToe.placeSymbol(gameBoard,firstPlayerposition, firstPlayer));
	}
	
	@Test
	public void secondPlayerShouldAssignSymbolO() {
		int firstPlayerPosition = 1;
		int secondPlayerPosition = 2;
		Assertions.assertEquals('X',TicTacToe.placeSymbol(gameBoard,firstPlayerPosition, firstPlayer));
        Assertions.assertEquals('O',TicTacToe.placeSymbol(gameBoard,secondPlayerPosition, secondPlayer));
	}
	
	@Test
	public void givenWhenTopRowIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 1;
		int playerTwoFirstPosition = 4;
		int playerOneSecondPosition = 2;
		int playerTwoSecondPositon = 9;
	    int playerOneThirdPositon = 3;
	    TicTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    TicTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    TicTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    TicTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	   
	  
	    Assertions.assertEquals("X is the Winner", TicTacToe.playGame(gameBoard,playerOneThirdPositon , firstPlayer));
		
	}

}
