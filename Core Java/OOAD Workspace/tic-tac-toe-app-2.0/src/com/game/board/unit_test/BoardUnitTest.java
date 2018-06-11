package com.game.board.unit_test;

import org.junit.Assert;
import org.junit.Test;

import com.game.board.Board;
import com.game.cell.CellPositionUnavailableException;
import com.game.mark.Mark;

public class BoardUnitTest {

	@Test
	public void testToDetermineIsBoardEmpty() {
		Board board = new Board();
		Assert.assertTrue(board.isBoardEmpty());
	}

	@Test
	public void testToDetermineIsBoardFull() throws CellPositionUnavailableException {
		Board board = new Board();
		board.setLocation(0, Mark.CROSS);
		board.setLocation(1, Mark.NOUGHT);
		board.setLocation(4, Mark.CROSS);
		
		board.setLocation(8, Mark.NOUGHT);
		board.setLocation(3, Mark.CROSS);
		board.setLocation(6, Mark.NOUGHT);
		
		board.setLocation(5, Mark.CROSS);
		board.setLocation(2, Mark.NOUGHT);
		board.setLocation(7, Mark.CROSS);
		boolean expectedStatus = true;
		boolean actualStatus = board.isBoardFull();
		Assert.assertTrue(expectedStatus == actualStatus);
	}
	
	@Test(expected = CellPositionUnavailableException.class)
	public void testToDetermineIsLocationValid() throws CellPositionUnavailableException{
		Board board = new Board();
		board.setLocation(10, Mark.CROSS);
	}
}
