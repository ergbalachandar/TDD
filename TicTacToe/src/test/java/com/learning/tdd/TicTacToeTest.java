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
	    Assertions.assertEquals("X", ticTacToe.placeSymbol(firstPlayerposition, firstPlayer));
	}
	
	@Test
	public void secondPlayerShouldAssignSymbolO() {
		int firstPlayerPosition = 1;
		int secondPlayerPosition = 2;
		Assertions.assertEquals("X",ticTacToe.placeSymbol(firstPlayerPosition, firstPlayer));
        Assertions.assertEquals("O",ticTacToe.placeSymbol(secondPlayerPosition, secondPlayer));
	}

}
