package com.game.shuffler.unit_test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.game.board.Board;
import com.game.cell.CellPositionUnavailableException;
import com.game.mark.Mark;
import com.game.player.Player;
import com.game.resultAnalyzer.ResultAnalyzer;
import com.game.shuffler.Game;
import com.game.state.GameState;

public class GameUnitTest {

	@Test
	public void shouldChangeTurnAfterEachPlayerPlaysOnce()
			throws CellPositionUnavailableException {
		Player[] play = new Player[2];
		play[0] = new Player("David", Mark.CROSS);
		play[1] = new Player("Roger", Mark.NOUGHT);

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Game round = new Game(play, board, result);

		round.play(1);
		Mark expectedMark1 = Mark.NOUGHT;
		Mark actualMark1 = round.getPlayerMark();
		assertTrue(expectedMark1 == actualMark1);

		round.play(2);
		Mark expectedMark2 = Mark.CROSS;
		Mark actualMark2 = round.getPlayerMark();
		assertTrue(expectedMark2 == actualMark2);
	}

	@Test(expected = CellPositionUnavailableException.class)
	public void testPlayWithInvalidInput()
			throws CellPositionUnavailableException {
		Player[] play = new Player[2];
		play[0] = new Player("David", Mark.CROSS);
		play[1] = new Player("Roger", Mark.NOUGHT);
		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Game round = new Game(play, board, result);
		round.play(10);
	}

	@Test
	public void shouldSetCurrentStateToWin()
			throws CellPositionUnavailableException {
		Player[] play = new Player[2];
		play[0] = new Player("David", Mark.CROSS);
		play[1] = new Player("Roger", Mark.NOUGHT);

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Game round = new Game(play, board, result);

		round.play(0);
		round.play(1);
		round.play(2);
		round.play(3);
		round.play(4);
		round.play(5);
		round.play(6);
		round.play(7);
		round.play(8);

		GameState expectedState = GameState.WON;
		GameState actualState = round.getState();

		String expectedWinner = "David";
		String actualWinner = round.getCurrentPlayer().getPlayerName();

		assertTrue(expectedState == actualState);
		assertEquals(expectedWinner, actualWinner);
	}

	@Test
	public void shouldSetCurrentStateToDraw()
			throws CellPositionUnavailableException {
		Player[] play = new Player[2];
		play[0] = new Player("David", Mark.CROSS);
		play[1] = new Player("Roger", Mark.NOUGHT);

		Board board = new Board();
		ResultAnalyzer result = new ResultAnalyzer();
		Game round = new Game(play, board, result);

		round.play(0);
		round.play(1);

		round.play(4);
		round.play(2);

		round.play(5);
		round.play(3);

		round.play(6);
		round.play(8);

		round.play(7);

		GameState expectedState = GameState.DRAW;
		GameState actualState = round.getState();
		assertTrue(expectedState == actualState);
	}

}
