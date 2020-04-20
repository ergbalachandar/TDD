package com.learning.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class TicTacToeTest {
	

	private String firstPlayer = "firstPlayer";
	private String secondPlayer = "secondPlayer";
	char[][] gameBoard;
	private TicTacToe ticTacToe;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
	    gameBoard = TicTacToeGameBoard.gameBoard();
	    ticTacToe = new TicTacToe();
	} 
	
	
	@Test
	public void firstPlayerShouldAssignSymbolX() {
		int firstPlayerposition = 1;
	    Assertions.assertEquals('X', ticTacToe.placeSymbol(gameBoard,firstPlayerposition, firstPlayer));
	}
	
	@Test
	public void secondPlayerShouldAssignSymbolO() {
		int firstPlayerPosition = 1;
		int secondPlayerPosition = 2;
		Assertions.assertEquals('X',ticTacToe.placeSymbol(gameBoard,firstPlayerPosition, firstPlayer));
        Assertions.assertEquals('O',ticTacToe.placeSymbol(gameBoard,secondPlayerPosition, secondPlayer));
	}
	
	@Test
	public void givenWhenTopRowIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 1;
		int playerTwoFirstPosition = 4;
		int playerOneSecondPosition = 2;
		int playerTwoSecondPositon = 9;
	    int playerOneThirdPositon = 3;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	   
	  
	    Assertions.assertEquals("PlayerOne is the Winner", ticTacToe.playGame(gameBoard,playerOneThirdPositon , firstPlayer));
		
	}
	
	@Test
	public void givenWhenMidRowIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 4;
		int playerTwoFirstPosition = 2;
		int playerOneSecondPosition = 5;
		int playerTwoSecondPositon = 1;
	    int playerOneThirdPositon = 6;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    
	    Assertions.assertEquals("PlayerOne is the Winner", ticTacToe.playGame(gameBoard, playerOneThirdPositon, firstPlayer));
		
	}
	
	@Test
	public void givenWhenLastRowIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 7;
		int playerTwoFirstPosition = 2;
		int playerOneSecondPosition = 8;
		int playerTwoSecondPositon = 1;
	    int playerOneThirdPositon = 9;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    
	    Assertions.assertEquals("PlayerOne is the Winner", ticTacToe.playGame(gameBoard, playerOneThirdPositon, firstPlayer));
		
	}
	
	@Test
	public void givenWhenFirstColumnIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 1;
		int playerTwoFirstPosition = 2;
		int playerOneSecondPosition = 4;
		int playerTwoSecondPositon = 9;
	    int playerOneThirdPositon = 7;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    
	    Assertions.assertEquals("PlayerOne is the Winner", ticTacToe.playGame(gameBoard, playerOneThirdPositon, firstPlayer));
		
	}

}
