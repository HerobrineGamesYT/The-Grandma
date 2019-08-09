package net.tanner.sugaboo;

import java.util.Scanner;

public class TitleScreenWithTutorial {

	public static void titleScreenWithTutorial() {
		System.out.println("Welcome to 'The Grandma!'");
		System.out.println(
				"In this game, you are just a casual high school student in a class where your main teacher is absent, and you have a substitute.");
		System.out.println("This is by far the most feared and strict substitute in the entire school.");
		System.out.println(
				"Your mission, if you choose to accept it, is to survive the class period while goofing off as much as possible.");

		System.out.println("Do you accept?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		System.out.println("3. How do I play?");
		Scanner choice = new Scanner(System.in);
		int decision = choice.nextInt();
		if (decision == 1) {

			GameStart.startGameConfirm();
		} else if (decision == 2) {
			TitleScreen.returnToTitleScreen();
		} else if (decision == 3) {
			Tutorial.howToPlay();
		}

	}

}