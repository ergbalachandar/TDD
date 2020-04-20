package com.learning.tdd;

public class TicTacToeGameBoard {
	
	public static char[][] gameBoard() {
	
	char [][] gameBoard = {{' ', '|', ' ', '|', ' '},
						   {'-', '+', '-', '+', '-'},
						   {' ', '|', ' ', '|', ' '},
						   {'-', '+', '-', '+', '-'},
						   {' ', '|', ' ', '|', ' '} };
	return gameBoard; 
	}
	
	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
