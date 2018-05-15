package com.dicegame.player;

public abstract class Player {

	private String name = "No_Name";

	public abstract int guess();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3 | name.contains(" "))
			throw (new IllegalArgumentException());
		else
			this.name = name;
	}
}
