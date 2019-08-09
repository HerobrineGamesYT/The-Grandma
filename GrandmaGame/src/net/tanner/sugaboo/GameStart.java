package net.tanner.sugaboo;

import java.util.Scanner;

public class GameStart {

	public static void startGameConfirm() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("Great! Well, best of luck to you! You're gonna need it!");
		System.out.println("");
		System.out.println("Press f to continue.");
		Scanner pressF = new Scanner(System.in);
		String character = pressF.nextLine();
		if (character.equals("f")) {
			System.out.println("Your respects have been paid. Before you can begin, you must select a difficulty.");
			DifficultySelect.startSelection();
		} else {
			MiscMethods.forceRespect();
		}
	}

	public static void startEasyMatch() {
		EasyMatch.easyMatch();
	}

	public static void startNormalMatch() {

	}

	public static void startHardMatch() {

	}

	public static void startExpertMatch() {

	}

}
