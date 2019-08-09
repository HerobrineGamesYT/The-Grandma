package net.tanner.sugaboo;

import java.util.Scanner;

public class DifficultySelect {
	static String getDifficulty;

	public static void startSelection() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("");
		System.out.println("Difficulty Selection:");
		System.out.println("1. Easy");
		System.out.println("2. Normal");
		System.out.println("3. Hard");
		System.out.println("4. Expert");
		System.out.println("5. What do these mean?");
		Scanner choice = new Scanner(System.in);

		int difficulty = choice.nextInt();
		if (difficulty == 1) {
			getDifficulty = "Easy";
			ClassGen.startClassGen();
		}

		else if (difficulty == 2) {
			getDifficulty = "Normal";
			ClassGen.startClassGen();
		} else if (difficulty == 3) {
			getDifficulty = "Hard";
			ClassGen.startClassGen();
		}

		else if (difficulty == 4) {
			getDifficulty = "Expert";
			ClassGen.startClassGen();
		} else if (difficulty == 5) {
			Tutorial.difficultyDetailList();
		} else {
			Tutorial.difficultyDetailList();
		}
	}

	public static String getDifficulty() {
		return getDifficulty;
	}
}
