package com.dicegame.core;

import java.util.Random;
import java.util.Scanner;

import com.dicegame.player.*;

public class Game {

	private static Scanner sc;

	public static void main(String[] args) {

		Random dice = new Random();
		sc = new Scanner(System.in);
		Player player = new PlayerComp();

		int number, guess = 1;

		System.out.println("Podaj imie dla gracza :");

		try {
			player.setName(sc.nextLine());
		} catch (IllegalArgumentException e) {
			System.out.println("Podane imie jest nieprawidlowe!");
			System.out.println("Imie nie moze zawierac spacji i musi miec minimum 3 znaki !");
		};

		do {
			number = dice.nextInt(6) + 1;
			System.out.println("Wylosowane: " + number);

			guess = player.guess();

			System.out.println("Gracz " + player.getName() + " wylosowal :" + guess);

			if (number != guess) {
				System.out.println("ŹLE!");
			} else {
				System.out.println("DOBRZE!");
			}

		} while (number != guess);

	}

}
