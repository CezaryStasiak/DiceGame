package com.dicegame.player;

import java.util.Random;

public class PlayerComp extends Player {

	private Random dice = new Random();

	public int guess() {
		return dice.nextInt(6) + 1;
	}
}
