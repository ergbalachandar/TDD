package com.learning.tdd;

public class TicTacToe {
	
	public String placeSymbol(int position,String user) {
		String symbol = " ";
		if(user.equalsIgnoreCase("firstPlayer")) {
		symbol =  "X";
		}
		else if(user.equalsIgnoreCase("secondPlayer")) {
			symbol =  "O";
		}
		return symbol;
	}
	

}
