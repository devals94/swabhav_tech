package com.game.cell;

import com.game.mark.Mark;

public class Cell {

	Mark content;

	public Cell() {
		clear();
	}

	public Mark getContent() {
		return content;
	}

	public void setContent(Mark mcontent)
			throws CellPositionUnavailableException {
		if (content == Mark.EMPTY)
			this.content = mcontent;
		else
			throw new CellPositionUnavailableException(
					"Cannot Mark The Cell Again.");
	}

	public void clear() {
		content = Mark.EMPTY;
	}
}
