package com.learning.tdd;

public class TicTacToe {

	public char placeSymbol(char[][] gameBoard, int position, String user) {

		char symbol = ' ';
		if (user.equalsIgnoreCase("firstPlayer")) {
			symbol = 'X';
		} else if (user.equalsIgnoreCase("secondPlayer")) {
			symbol = 'O';
		}

		switch (position) {
		case 1:
			gameBoard[0][0] = symbol;
			return symbol;
		case 2:
			gameBoard[0][2] = symbol;
			return symbol;
		case 3:
			gameBoard[0][4] = symbol;
			return symbol;
		case 4:
			gameBoard[2][0] = symbol;
			return symbol;
		case 5:
			gameBoard[2][2] = symbol;
			return symbol;
		case 6:
			gameBoard[2][4] = symbol;
			return symbol;
		case 7:
			gameBoard[4][0] = symbol;
			return symbol;
		case 8:
			gameBoard[4][2] = symbol;
			return symbol;
		case 9:
			gameBoard[4][4] = symbol;
			return symbol;
		default:
			break;
		}

		return symbol;
	}

}
