package net.tanner.sugaboo;

import java.util.Scanner;

public class EasyMatch {
	static String getClassType;
	static String getDifficulty;

	public static void easyMatch() {
		GameCore.grandmaStatus = "In Room";
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("Goof Points: " + GameCore.getGoofPoints() + "                     Where's Grandma?: "
				+ GameCore.getGrandmaStatus());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("You may:");
		System.out.println("  1. test option 1 - goof -- reward");
		System.out.println("  2. test option 2 - work prod level 1");
		System.out.println("  3. test option 3 - goof1 -- grandma penalty");
		System.out.println("  4. test option 4 - work at prod level 3");
		Scanner getChoice = new Scanner(System.in);
		int decisionNumber = getChoice.nextInt();
		if (decisionNumber == 1) {
			GameCore.goofReward();
		} else if (decisionNumber == 2) {
			GameCore.productivityLevel = 1;
			GameCore.productiveAction();
		} else if (decisionNumber == 3) {
			GameCore.grandmaAction();
		} else if (decisionNumber == 4) {
			GameCore.productivityLevel = 3;
			GameCore.productiveAction();
		}

	}

}
