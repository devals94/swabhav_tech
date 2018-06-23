package com.game.board;

import com.game.cell.Cell;
import com.game.cell.CellPositionUnavailableException;
import com.game.mark.Mark;

public class Board {
	public static final int TOTAL_CELLS = 9;

	private Cell[] cells;
	private int currentRow;
	private int currentCol;

	public Board() {
		initializeEmptyBoard();
	}

	public void initializeEmptyBoard() {
		cells = new Cell[TOTAL_CELLS];
		for (int row = 0; row < TOTAL_CELLS; row++) {
			cells[row] = new Cell();
		}
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentCol() {
		return currentCol;
	}

	public void setCurrentCol(int currentCol) {
		this.currentCol = currentCol;
	}

	public void setCells(Cell[] cells) {
		this.cells = cells;
	}

	public Cell[] getCells() {
		return cells;
	}

	public boolean isBoardEmpty() {
		boolean isEmpty = false;
		for (int row = 0; row < TOTAL_CELLS; row++) {
			if (cells[row].getContent() == Mark.EMPTY) {
				isEmpty = true;
			}
		}
		return isEmpty;
	}

	public boolean isBoardFull() {
		boolean isBoardFull = true;
		for (int row = 0; row < TOTAL_CELLS; row++) {
			if (cells[row].getContent() == Mark.EMPTY) {
				return false;
			}
		}
		return isBoardFull;
	}

	public void setLocation(int cellNumber, Mark mark)
			throws CellPositionUnavailableException {
		if (isLocationValid(cellNumber)) {
			cells[cellNumber].setContent(mark);
		}
	}

	public boolean isLocationValid(int cellNumber)
			throws CellPositionUnavailableException {
		if (cellNumber >= 0 && cellNumber < TOTAL_CELLS)
			return true;
		else
			throw new CellPositionUnavailableException(
					"Cannot Mark The Cell , Invalid Location");
	}
}
