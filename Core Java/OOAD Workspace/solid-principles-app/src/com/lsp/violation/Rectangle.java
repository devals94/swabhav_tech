package com.lsp.violation;

public class Rectangle {
	protected int _width;
	protected int _height;

	public Rectangle(int width, int height) {
		this._width = width;
		this._height = height;
	}

	public int get_width() {
		return _width;
	}

	public void set_width(int width) {
		this._width = width;
	}

	public int get_height() {
		return _height;
	}

	public void set_height(int height) {
		this._height = height;
	}
	
	public int calculateArea(){
		return this._width * this._height;
	}
}
