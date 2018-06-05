package com.game.player;

import com.game.mark.Mark;

public class Player {
	private String playerName;
	private Mark mark;
	
	public Player(String name,Mark mark) {
		this.playerName = name;
		this.mark = mark;
	}

	public Mark getMark() {
		return mark;
	}

	public String getPlayerName() {
		return playerName;
	}
}
