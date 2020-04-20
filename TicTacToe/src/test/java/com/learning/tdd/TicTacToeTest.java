package com.learning.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
	@Order(1)
	public void firstPlayerShouldAssignSymbolX() {
		int firstPlayerposition = 1;
	    Assertions.assertEquals('X', ticTacToe.placeSymbol(gameBoard,firstPlayerposition, firstPlayer));
	}
	
	@Test
	@Order(2)
	public void secondPlayerShouldAssignSymbolO() {
		int firstPlayerPosition = 1;
		int secondPlayerPosition = 2;
		Assertions.assertEquals('X',ticTacToe.placeSymbol(gameBoard,firstPlayerPosition, firstPlayer));
        Assertions.assertEquals('O',ticTacToe.placeSymbol(gameBoard,secondPlayerPosition, secondPlayer));
	}
	
	@Test
	@Order(3)
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
	@Order(4)
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
	@Order(5)
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
	@Order(6)
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
	
	@Test
	@Order(7)
	public void givenWhenSecondColumnIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 2;
		int playerTwoFirstPosition = 1;
		int playerOneSecondPosition = 5;
		int playerTwoSecondPositon = 9;
	    int playerOneThirdPositon = 8;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    
	    Assertions.assertEquals("PlayerOne is the Winner", ticTacToe.playGame(gameBoard, playerOneThirdPositon, firstPlayer));
		
	}
	
	@Test
	@Order(8)
	public void givenWhenThirdColumnIsOccupiedWithXThenDeclarePlayerOneAsWinner() {
		int playerOneFirstPostion = 3;
		int playerTwoFirstPosition = 1;
		int playerOneSecondPosition = 6;
		int playerTwoSecondPositon = 5;
	    int playerOneThirdPositon = 9;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    
	    Assertions.assertEquals("PlayerOne is the Winner", ticTacToe.playGame(gameBoard, playerOneThirdPositon, firstPlayer));
		
	}
	
	@Test
	@Order(9)
	public void givenWhenTopRowIsOccupiedWithOThenDeclarePlayerTwoAsWinner() {
		int playerOneFirstPostion = 4;
		int playerTwoFirstPosition = 1;
		int playerOneSecondPosition = 8;
		int playerTwoSecondPositon = 2;
	    int playerOneThirdPositon = 5;
	    int playerTwoThirdPosition = 3;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    ticTacToe.playGame(gameBoard,playerOneThirdPositon , firstPlayer);
	   
	  
	    Assertions.assertEquals("PlayerTwo is the Winner", ticTacToe.playGame(gameBoard,playerTwoThirdPosition , secondPlayer));
		
	}
	
	@Test
	@Order(10)
	public void givenWhenMidRowIsOccupiedWithOThenDeclarePlayerTwoAsWinner() {
		int playerOneFirstPostion = 1;
		int playerTwoFirstPosition = 4;
		int playerOneSecondPosition = 8;
		int playerTwoSecondPositon = 5;
	    int playerOneThirdPositon = 9;
	    int playerTwoThirdPosition = 6;
	    ticTacToe.playGame(gameBoard, playerOneFirstPostion, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoFirstPosition, secondPlayer);
	    ticTacToe.playGame(gameBoard, playerOneSecondPosition, firstPlayer);
	    ticTacToe.playGame(gameBoard, playerTwoSecondPositon, secondPlayer);
	    ticTacToe.playGame(gameBoard,playerOneThirdPositon , firstPlayer);
	   
	  
	    Assertions.assertEquals("PlayerTwo is the Winner", ticTacToe.playGame(gameBoard,playerTwoThirdPosition , secondPlayer));
		
	}
	


}
