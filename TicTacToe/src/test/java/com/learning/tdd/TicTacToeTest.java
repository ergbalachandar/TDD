package com.learning.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class TicTacToeTest {
	
	private TicTacToe ticTacToe;
	private String firstPlayer = "firstPlayer";
	private String secondPlayer = "secondPlayer";
	
	@BeforeEach
	public void setUp() throws Exception 
	{
	   ticTacToe = new TicTacToe();    		
	} 
	
	
	@Test
	public void firstPlayerShouldAssignSymbolX() {
		int firstPlayerposition = 1;
		char[][] gameBoard = TicTacToeGameBoard.gameBoard();
	    Assertions.assertEquals('X', ticTacToe.placeSymbol(gameBoard,firstPlayerposition, firstPlayer));
	}
	
	@Test
	public void secondPlayerShouldAssignSymbolO() {
		int firstPlayerPosition = 1;
		int secondPlayerPosition = 2;
		char[][] gameBoard = TicTacToeGameBoard.gameBoard();
		Assertions.assertEquals('X',ticTacToe.placeSymbol(gameBoard,firstPlayerPosition, firstPlayer));
        Assertions.assertEquals('O',ticTacToe.placeSymbol(gameBoard,secondPlayerPosition, secondPlayer));
	}

}
