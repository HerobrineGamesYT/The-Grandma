package net.tanner.sugaboo;

import java.util.Scanner;

public class TitleScreen {

	public static void returnToTitlescreenWithoutTutorial() {
		TitleScreen.titleScreen();
	}

	public static void titleScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("Do you accept?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		Scanner missionAcceptance = new Scanner(System.in);
		int choice = missionAcceptance.nextInt();
		if (choice == 1) {

			GameStart.startGameConfirm();
		} else {
			MiscMethods.forceStart();
		}

	}

	public static void returnToTitleScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		TitleScreenWithTutorial.titleScreenWithTutorial();
	}

}