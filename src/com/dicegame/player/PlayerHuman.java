package com.dicegame.player;

import java.util.Scanner;

public class PlayerHuman extends Player {

	private Scanner scanner = new Scanner(System.in);

	public int guess() {
		System.out.print("Podaj liczbę: ");
		return scanner.nextInt();
	}
}
