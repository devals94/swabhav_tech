package com.game.shuffler;

import com.game.board.Board;
import com.game.cell.CellPositionUnavailableException;
import com.game.mark.Mark;
import com.game.player.Player;
import com.game.resultAnalyzer.ResultAnalyzer;
import com.game.state.GameState;

public class Game {
	private Board board;
	private GameState currentState;
	private Mark playerMark;
	private Player[] playMate;
	private ResultAnalyzer result;

	public Game(Player[] player, Board board, ResultAnalyzer result) {
		initGame();
		playMate = player;
		this.board = board;
		this.result = result;
	}

	private void initGame() {
		playerMark = Mark.CROSS;
		currentState = GameState.PLAYING;
	}

	public Player getCurrentPlayer() {
		if (playerMark == Mark.CROSS)
			return playMate[0];
		else
			return playMate[1];
	}

	public Board getBoard() {
		return board;
	}

	public ResultAnalyzer getResult() {
		return result;
	}

	public GameState getState() {
		return currentState;
	}

	public void setState(GameState state) {
		this.currentState = state;
	}

	public GameState updateGameStatus() {
		return result.gameStateAnalyzer(board);
	}

	private Mark changeTurn() {
		return playerMark = (playerMark == Mark.CROSS) ? Mark.NOUGHT
				: Mark.CROSS;
	}

	public Mark getPlayerMark() {
		return playerMark;
	}

	public void setPlayerMark(Mark playerMark) {
		this.playerMark = playerMark;
	}

	public void play(int cellNumber) throws CellPositionUnavailableException {
		board.setLocation(cellNumber, playerMark);
		board.setCurrentRow(cellNumber);
		setPlayerMark(getPlayerMark());
		GameState gameStatus = updateGameStatus();
		setState(gameStatus);
		if (gameStatus != GameState.WON) {
			changeTurn();
		}
	}
}
