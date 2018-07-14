package com.game.console;

import java.util.Scanner;

import com.game.board.Board;
import com.game.cell.Cell;
import com.game.mark.Mark;
import com.game.player.Player;
import com.game.resultAnalyzer.ResultAnalyzer;
import com.game.shuffler.Game;
import com.game.state.GameState;

public class GameConsole {

	public static void main(String[] args) {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Player[] addPlayers = new Player[2];

		Game tic_Tac_Toe = new Game(addPlayers, board, result);

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Player 1 Name: ");
		String playX = scan.nextLine();

		System.out.println("Enter Player 2 Name: ");
		String playO = scan.nextLine();

		addPlayers[0] = new Player(playX, Mark.CROSS);
		addPlayers[1] = new Player(playO, Mark.NOUGHT);

		System.out.println("The cell numbers on board are: ");
		paintBoard(board);

		do {
			if (tic_Tac_Toe.getPlayerMark() == Mark.CROSS) {
				System.out.println(addPlayers[0].getPlayerName().toUpperCase()
						+ " Enter your cell number between [1-9] ");
			} else
				System.out.println(addPlayers[1].getPlayerName().toUpperCase()
						+ " Enter your cell number between [1-9] ");
			int cellNumber = scan.nextInt() - 1;

			try {
				tic_Tac_Toe.play(cellNumber);
				paintBoard(board);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		} while (tic_Tac_Toe.getState() == GameState.PLAYING);
		
		scan.close();
		
		if (tic_Tac_Toe.getState() != GameState.DRAW) {
			if (tic_Tac_Toe.getPlayerMark() == Mark.CROSS) {
				System.out.println("Congragulations!!! "
						+ addPlayers[0].getPlayerName().toUpperCase()
						+ " You WON");
			} else {
				System.out.println("Congragulations!!! "
						+ addPlayers[1].getPlayerName().toUpperCase()
						+ " You WON");
			}
		} else
			System.out.println("It's a Draw!!!");
	}

	private static void paintBoard(Board board) {
		for (int cellIndex = 0; cellIndex < 9; cellIndex++) {
			if (cellIndex == 3 || cellIndex == 6) {
				System.out.println();
				System.out.println("-------------------------------------------------------");
			}
			paintCell(cellIndex, board);
		}
		System.out.println();
	}

	private static void paintCell(int cellIndex, Board board) {
		Cell[] cell = board.getCells();
		Mark playerMark = cell[cellIndex].getContent();
		if (playerMark == Mark.EMPTY) {
			System.out.print("\t");
			System.out.print(cellIndex + 1);
			System.out.print(" |");
		}
		if (playerMark == Mark.CROSS) {
			System.out.print("\tX |\t");
		} else if (playerMark == Mark.NOUGHT) {
			System.out.print("\tO |\t");
		} else
			System.out.print("\t");
	}
}
