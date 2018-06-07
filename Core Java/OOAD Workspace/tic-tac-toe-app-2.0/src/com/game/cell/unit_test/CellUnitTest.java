package com.game.cell.unit_test;

import org.junit.Assert;
import org.junit.Test;

import com.game.cell.Cell;
import com.game.cell.CellPositionUnavailableException;
import com.game.mark.Mark;

public class CellUnitTest {

	@Test
	public void testWhetherCellIsInitiallyEmpty() {
		Cell cell = new Cell();
		String expectedValue = "EMPTY";
		String actualValue = cell.getContent().toString();
		Assert.assertTrue(expectedValue.equals(actualValue));
	}

	@Test(expected = CellPositionUnavailableException.class)
	public void testWhetherCellThrowsPositionUnavailableException()
			throws CellPositionUnavailableException {
		Cell cell = new Cell();
		cell.setContent(Mark.CROSS);
		cell.setContent(Mark.NOUGHT);
		// Assert.assertEquals("CROSS", cell.getContent().toString());
	}

	@Test
	public void testWhetherCellMarksCross()
			throws CellPositionUnavailableException {
		Cell cell = new Cell();
		cell.setContent(Mark.CROSS);
		String expectedValue = "CROSS";
		String actualValue = cell.getContent().toString();
		Assert.assertEquals(expectedValue, actualValue);
	}

	@Test
	public void testWhetherCellRetrievesMarksNought()
			throws CellPositionUnavailableException {
		Cell cell = new Cell();
		cell.setContent(Mark.NOUGHT);
		Assert.assertEquals("NOUGHT", cell.getContent().toString());
	}
}
