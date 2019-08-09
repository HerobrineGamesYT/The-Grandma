package net.tanner.sugaboo;

import java.util.Scanner;

public class Tutorial {

	public static void howToPlay() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("At the start of the game, you are given a class subject.");
		System.out.println("During the game, you have different decisions you can make.");
		System.out.println(
				"These decisions are labled with numbers, which you will type in and press enter to submit your decision.");
		System.out.println("Of course, some decisions are good, and others bad.");
		System.out.println("Your misson is to goof off as much as possible, but Grandma doesn't want you to do that!");
		System.out.println("You will be awarded 'goof points' for goofing off.");
		System.out.println("Be careful though, goof points can be taken from you for certain actions! :)");
		System.out.println(
				"Once you reach a certain amount of goof points, you can win the game depending on the difficulty you selected.");
		System.out.println("The difficulties are: Easy, Normal, Hard, and Expert.");
		System.out.println("With easy mode, you need 300 goof points.");
		System.out.println("With normal mode, you need 500 goof points.");
		System.out.println("With hard mode, you need 750 goof points.");
		System.out.println("Finally, with expert mode, you need 1000 goof points.");
		System.out.println(
				"Please be aware of grandma! She takes away the most goof points, and in some cases, she can take all of them, and then you'll lose!!");
		System.out.println("Now that you know what to do, good luck sugaboo!");
		System.out.println("");
		System.out.println("Press 1 to continue.");
		Scanner letsGoMan = new Scanner(System.in);
		int letsContinue = letsGoMan.nextInt();
		if (letsContinue == 1) {

			TitleScreen.returnToTitlescreenWithoutTutorial();
		} else {
			MiscMethods.forceOnePress();
		}

	}

	public static void difficultyDetailList() {
		System.out.print("\033[H\033[2J");
		System.out.flush();

		System.out.println("The difficulties are: Easy, Normal, Hard, and Expert.");
		System.out.println("With easy mode, you need 300 goof points.");
		System.out.println("With normal mode, you need 500 goof points.");
		System.out.println("With hard mode, you need 750 goof points.");
		System.out.println("Finally, with expert mode, you need 1000 goof points.");
		System.out.println("");
		System.out.println("Press 1 to return to difficulty selection.");
		Scanner returnToSelection = new Scanner(System.in);
		int returnToDifficultySelection = returnToSelection.nextInt();
		if (returnToDifficultySelection == 1) {
			DifficultySelect.startSelection();
		} else {
			MiscMethods.forceOnePressOther();
		}
	}

}
