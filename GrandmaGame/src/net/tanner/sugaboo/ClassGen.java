package net.tanner.sugaboo;

import java.util.Random;

public class ClassGen {
	static String getClassType;

	public static void startClassGen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		if (DifficultySelect.getDifficulty().equalsIgnoreCase("Easy")) {
			Random classType = new Random();
			int classTypeIs = 1 + classType.nextInt((6 - 1) + 1);
			if (classTypeIs == 1) {
				System.out.println("Your class is: Math");
				getClassType = "Math";
				MiscMethods.reRollClass();
			}
			if (classTypeIs == 2) {
				System.out.println("Your class is: English");
				getClassType = "English";
				MiscMethods.reRollClass();
			}
			if (classTypeIs == 3) {
				System.out.println("Your class is: Science");
				getClassType = "Science";
				MiscMethods.reRollClass();
			}
			if (classTypeIs == 4) {
				System.out.println("Your class is: Health");
				getClassType = "Health";
				MiscMethods.reRollClass();
			}
			if (classTypeIs == 5) {

				System.out.println("Your class is: Spanish");
				getClassType = "Spanish";
				MiscMethods.reRollClass();
			}
			if (classTypeIs == 6) {
				System.out.println("Your class is: History");
				getClassType = "History";
				MiscMethods.reRollClass();
			}
		} else {
			Random classType = new Random();
			int classTypeIs = 1 + classType.nextInt((6 - 1) + 1);
			if (classTypeIs == 1) {
				System.out.println("Your class is: Math");
				getClassType = "Math";
				System.out.println("Press 1 to continue.");
			}
			if (classTypeIs == 2) {
				System.out.println("Your class is: English");
				getClassType = "English";
				System.out.println("Press 1 to continue.");
			}
			if (classTypeIs == 3) {
				System.out.println("Your class is: Science");
				getClassType = "Science";
				System.out.println("Press 1 to continue.");
			}
			if (classTypeIs == 4) {
				System.out.println("Your class is: Health");
				getClassType = "Health";
				System.out.println("Press 1 to continue.");
			}
			if (classTypeIs == 5) {

				System.out.println("Your class is: Spanish");
				getClassType = "Spanish";
				System.out.println("Press 1 to continue.");
			}
			if (classTypeIs == 6) {
				System.out.println("Your class is: History");
				getClassType = "History";
				System.out.println("Press 1 to continue.");
			}
		}
	}

	public static String getClassType() {

		return getClassType;
	}
}
