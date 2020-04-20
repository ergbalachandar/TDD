package com.learning.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class TicTacToeTest {
	
	private TicTacToe ticTacToe;
	
	@BeforeEach
	public void setUp() throws Exception 
	{
	   ticTacToe = new TicTacToe();    		
	} 
	
	
	@Test
	public void firstPlayerShouldAssignSymbolX() {
		int position = 1;
	    Assertions.assertEquals("X", ticTacToe.placeSymbol(position,"firstPlayer"));
	}
	
	@Test
	public void secondPlayerShouldAssignSymbolO() {
		int secondPosition = 2;
         Assertions.assertEquals("O",ticTacToe.placeSymbol(secondPosition, "SecondPlayer"));
	}

}
