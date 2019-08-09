package net.tanner.sugaboo;

import java.util.Scanner;

public class MiscMethods {

	public static void forceOnePress() {
		Tutorial.howToPlay();

	}

	public static void forceStart() {
		TitleScreen.returnToTitlescreenWithoutTutorial();
	}

	public static void forceRespect() {
		GameStart.startGameConfirm();
		System.out.println("");
		System.out.println("C'mon, just press f to pay your respect.");
	}

	public static void forceOnePressOther() {
		Tutorial.difficultyDetailList();
	}

	public static void reRollClass() {
		System.out.println("");
		System.out.println("Press 1 to continue, or press 2 to re-roll your class.");
		System.out.println(
				"NOTE: Class re-rolls are only available on easy mode. Any other number key press is considered a re-roll request. Entering any other key causes the game to run into an error and shut-down.");
		Scanner classReRollListener = new Scanner(System.in);
		int reRollDecision = classReRollListener.nextInt();
		if (reRollDecision == 1) {
			EasyMatch.easyMatch();
		} else {
			ClassGen.startClassGen();
		}

	}

	public static void outcomeAcknowledgement() {
		System.out.println("");
		System.out.println("Press any key to continue.");
		Scanner continueAfterOutcome = new Scanner(System.in);
		int numberEntrance = continueAfterOutcome.nextInt();
		String letterEntrance = continueAfterOutcome.nextLine();
		if (continueAfterOutcome.hasNextInt()) {
			// TODO Continue the match.
		} else {
			// TODO Continue the match.
		}
	}
}
