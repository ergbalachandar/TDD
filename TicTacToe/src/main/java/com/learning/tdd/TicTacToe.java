package com.learning.tdd;

import java.awt.SecondaryLoop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
	
	ArrayList<Integer> firstPlayerPosition = new ArrayList<Integer>();
	ArrayList<Integer> secondPlayerPosition = new ArrayList<Integer>();

	public String playGame(char[][] gameBoard, int position, String user) {
		
		placeSymbol(gameBoard, position, user);
		String gameResult = checkWinner();
		System.out.println(gameResult);
		return gameResult;
		
	
	}
	
	public char placeSymbol(char[][] gameBoard, int position, String user) {

		char symbol = ' ';
		if (user.equalsIgnoreCase("firstPlayer")) {
			symbol = 'X';
			firstPlayerPosition.add(position);
		} else if (user.equalsIgnoreCase("secondPlayer")) {
			symbol = 'O';
			secondPlayerPosition.add(position);
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
	
	private String checkWinner() {
		
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List firtColumn = Arrays.asList(1,4,7);
		List secondColumn = Arrays.asList(2,5,8);
		List thirdColumn = Arrays.asList(3,6,9);
		
		List<List> winningPatterns = new ArrayList<List>();
		winningPatterns.add(topRow);
		winningPatterns.add(midRow);
		winningPatterns.add(botRow);
		winningPatterns.add(firtColumn);
		winningPatterns.add(secondColumn);
		winningPatterns.add(thirdColumn);
		
		for(List winningPatten : winningPatterns) {
			if(firstPlayerPosition.containsAll(winningPatten)) {
				return "PlayerOne is the Winner";
			}
			else if (secondPlayerPosition.containsAll(winningPatten)) {
				return "PlayerTwo is the Winner";
			}
		}
		
		return " ";
	}

}
