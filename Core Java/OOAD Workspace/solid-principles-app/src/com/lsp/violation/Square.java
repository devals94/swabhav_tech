package com.lsp.violation;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void set_width(int sWidth) {
		this._width = this._height = sWidth;
	}

	@Override
	public void set_height(int sHeight) {
		this._width = this._height = sHeight;
	}
}
