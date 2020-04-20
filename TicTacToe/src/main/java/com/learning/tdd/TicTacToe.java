package com.learning.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
	
	static ArrayList<Integer> firstPlayerPosition = new ArrayList<Integer>();

	public static String playGame(char[][] gameBoard, int position, String user) {
		
		placeSymbol(gameBoard, position, user);
		String gameResult = checkWinner();
		System.out.println(gameResult);
		return gameResult;
		
	
	}
	
	public static char placeSymbol(char[][] gameBoard, int position, String user) {

		char symbol = ' ';
		if (user.equalsIgnoreCase("firstPlayer")) {
			symbol = 'X';
			firstPlayerPosition.add(position);
		} else if (user.equalsIgnoreCase("secondPlayer")) {
			symbol = 'O';
		}
		
		symbol = getSymbol(gameBoard, position, symbol);
	    TicTacToeGameBoard.printGameBoard(gameBoard);
     
		return symbol;
	}
	
	private static char getSymbol (char[][] gameBoard, int position, char symbol){
		
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
		return ' ';
		
	}
	
	private static String checkWinner() {
		
		List topRow = Arrays.asList(1,2,3);
		if (firstPlayerPosition.containsAll(topRow)) {
			return "PlayerOne is the Winner";
			
		}
		return "";
	}

}
