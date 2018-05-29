package com.game;

public class Main {

	public static void main(String[] args) {
		TBoard game = new TBoard();
		game.placeMark(2, 0);
		game.changePlayer();
		game.placeMark(2, 1);
		game.changePlayer();
		game.placeMark(1, 0);
		game.changePlayer();
		game.placeMark(1, 1);
		game.changePlayer();
		game.placeMark(0, 0);
		game.printBoard();

		if (game.checkForWin()) {
			System.out.println("We have a winner! Congrats!");
			System.exit(0);
		}

		else if (game.isBoardFull()) {
			System.out.println("Appears we have a draw!");
			System.exit(0);
		}

	}
}
