package com.game.resultAnalyzer.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.game.board.Board;
import com.game.cell.CellPositionUnavailableException;
import com.game.mark.Mark;
import com.game.resultAnalyzer.ResultAnalyzer;
import com.game.state.GameState;

public class ResultAnalyzerUnitTest {

	@Test
	public void testToCheckIsFirstRowWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(0, Mark.CROSS);
		board.setLocation(1, Mark.CROSS);
		board.setLocation(2, Mark.CROSS);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsSecondRowWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(3, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(5, Mark.CROSS);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsThirdRowWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(6, Mark.CROSS);
		board.setLocation(7, Mark.CROSS);
		board.setLocation(8, Mark.CROSS);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsFirstColWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(0, Mark.NOUGHT);
		board.setLocation(3, Mark.NOUGHT);
		board.setLocation(6, Mark.NOUGHT);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsSecondColWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(1, Mark.NOUGHT);
		board.setLocation(4, Mark.NOUGHT);
		board.setLocation(7, Mark.NOUGHT);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsThirdColWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(2, Mark.NOUGHT);
		board.setLocation(5, Mark.NOUGHT);
		board.setLocation(8, Mark.NOUGHT);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsLeftDiagonalWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(0, Mark.CROSS);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(8, Mark.CROSS);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsRightDiagonalWinner()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();

		board.setLocation(2, Mark.NOUGHT);
		board.setLocation(4, Mark.NOUGHT);
		board.setLocation(6, Mark.NOUGHT);

		boolean expectedResult = true;
		boolean actualResult = result.hasWon(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckIsGameADraw()
			throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		board.setLocation(0, Mark.CROSS);
		board.setLocation(1, Mark.NOUGHT);
		board.setLocation(2, Mark.NOUGHT);

		board.setLocation(3, Mark.NOUGHT);
		board.setLocation(4, Mark.CROSS);
		board.setLocation(5, Mark.CROSS);

		board.setLocation(6, Mark.NOUGHT);
		board.setLocation(7, Mark.CROSS);
		board.setLocation(8, Mark.NOUGHT);

		boolean expectedResult = true;
		boolean actualResult = result.isDraw(board);
		assertTrue(expectedResult == actualResult);

	}

	@Test
	public void testToCheckGameState() throws CellPositionUnavailableException {

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		board.setLocation(0, Mark.CROSS);
		board.setLocation(1, Mark.NOUGHT);
		// board.setLocation(2, Mark.NOUGHT);

		board.setLocation(3, Mark.NOUGHT);
		board.setLocation(4, Mark.CROSS);
		// board.setLocation(5, Mark.CROSS);

		board.setLocation(6, Mark.NOUGHT);
		board.setLocation(7, Mark.CROSS);
		board.setLocation(8, Mark.NOUGHT);

		GameState expectedGameState = GameState.PLAYING;
		GameState actualGameState = result.gameStateAnalyzer(board);
		assertTrue(expectedGameState == actualGameState);

	}

}
