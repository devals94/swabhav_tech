package com.game.resultAnalyzer;

import com.game.board.Board;
import com.game.mark.Mark;
import com.game.state.GameState;

public class ResultAnalyzer {

	private boolean isFirstRowWinner(Board board) {
		if (board.getCells()[0].getContent() != Mark.EMPTY)
			if ((board.getCells()[0].getContent() == board.getCells()[1]
					.getContent())
					&& (board.getCells()[0].getContent() == board.getCells()[2]
							.getContent()))
				return true;
		return false;
	}

	private boolean isSecondRowWinner(Board board) {
		if (board.getCells()[3].getContent() != Mark.EMPTY) {
			if ((board.getCells()[3].getContent() == board.getCells()[4]
					.getContent())
					&& (board.getCells()[3].getContent() == board.getCells()[5]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	private boolean isThirdRowWinner(Board board) {
		if (board.getCells()[6].getContent() != Mark.EMPTY) {
			if ((board.getCells()[6].getContent() == board.getCells()[7]
					.getContent())
					&& (board.getCells()[6].getContent() == board.getCells()[8]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	private boolean isFirstColWinner(Board board) {
		if (board.getCells()[0].getContent() != Mark.EMPTY) {
			if ((board.getCells()[0].getContent() == board.getCells()[3]
					.getContent())
					&& (board.getCells()[0].getContent() == board.getCells()[6]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	private boolean isSecondColWinner(Board board) {
		if (board.getCells()[1].getContent() != Mark.EMPTY) {
			if ((board.getCells()[1].getContent() == board.getCells()[4]
					.getContent())
					&& (board.getCells()[1].getContent() == board.getCells()[7]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	private boolean isThirdColWinner(Board board) {
		if (board.getCells()[2].getContent() != Mark.EMPTY) {
			if ((board.getCells()[2].getContent() == board.getCells()[5]
					.getContent())
					&& (board.getCells()[2].getContent() == board.getCells()[8]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	private boolean isLeftDiagonalWinner(Board board) {
		if (board.getCells()[0].getContent() != Mark.EMPTY) {
			if ((board.getCells()[0].getContent() == board.getCells()[4]
					.getContent())
					&& (board.getCells()[0].getContent() == board.getCells()[8]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	private boolean isRightDiagonalWinner(Board board) {
		if (board.getCells()[2].getContent() != Mark.EMPTY) {
			if ((board.getCells()[2].getContent() == board.getCells()[4]
					.getContent())
					&& (board.getCells()[2].getContent() == board.getCells()[6]
							.getContent())) {
				return true;
			}
		}
		return false;
	}

	public boolean isDraw(Board board) {
		if (board.isBoardFull())
			return true;
		else
			return false;
	}

	public boolean hasWon(Board board) {
		if (isFirstRowWinner(board))
			return true;
		if (isSecondRowWinner(board))
			return true;
		if (isThirdRowWinner(board))
			return true;
		if (isFirstColWinner(board))
			return true;
		if (isSecondColWinner(board))
			return true;
		if (isThirdColWinner(board))
			return true;
		if (isLeftDiagonalWinner(board))
			return true;
		if (isRightDiagonalWinner(board))
			return true;
		return false;
	}

	public GameState gameStateAnalyzer(Board board) {
		if (hasWon(board))
			return GameState.WON;
		else if (isDraw(board))
			return GameState.DRAW;
		else
			return GameState.PLAYING;
	}
}
