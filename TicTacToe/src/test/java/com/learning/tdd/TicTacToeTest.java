package com.learning.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TicTacToeTest {
	@Test
	public void firstPlayerShouldAssignSymbolX() {
		TicTacToe ticTacToe = new TicTacToe();
		int position = 1;
	    Assertions.assertEquals("X", ticTacToe.placeSymbol(position));
	}

}
