package net.tanner.sugaboo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameCore {
	public static ArrayList<Boolean> watchList = new ArrayList<Boolean>();
	static int goofPoints; // Defining the goof points variable, accessible and modifiable from any class.
	static int productivityLevel; // Defining the productivity level variable, accessible and modifiable from any
									// class.
	static String grandmaStatus;
	static Random outcomeGen = new Random(); // Initializing the random outcome generator

	public static String getGrandmaStatus() {
		return grandmaStatus;
	}

	public static int getProductivityLevel() {
		return productivityLevel;
	}

	public static void grandmaAction() {
		float actionChance = outcomeGen.nextFloat();
		if (!watchList.contains(true)) {
			if (actionChance <= 0.05F) {
				System.out.println("Grandma has sent you to Mr.Lee and you have lost 50% of your goof points.");
				goofPoints = goofPoints - goofPoints / 2;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (actionChance <= .01F) {
				System.out.println(
						"Grandma has sent you to Mrs.Robinson and you have lost all of your goof points! Game Over!");
				System.out.println("Press any number key to continue.");
				Scanner continueToTitleScreen = new Scanner(System.in);
				int pleaseContinue = continueToTitleScreen.nextInt();
				if (pleaseContinue == 1) {
					TitleScreen.returnToTitleScreen();
				} else {
					TitleScreen.returnToTitleScreen();
				}
			}
			if (actionChance <= .1F) {
				System.out.println(
						"Grandma has caught you goofing off! You lose 50 goof points and are now on her watch list.");
				watchList.add(true);
				goofPoints = goofPoints - 50;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (actionChance <= .25F) {
				System.out.println("You recieved a verbal warning from Grandma. 25 goof points have been lost.");
				goofPoints = goofPoints - 25;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
		} else {
			if (actionChance <= .25F) {
				System.out.println("Grandma has sent you to Mr.Lee and you have lost 50% of your goof points.");
				goofPoints = goofPoints - goofPoints / 2;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
					System.out.println("Game over! Press any number key to continue.");
				}
			}
		}
	}

	public static void productiveAction() {
		float productiveActionChance = outcomeGen.nextFloat();
		if (productivityLevel == 1) {
			if (productiveActionChance <= .1F) {
				System.out.println("Great work sugaboo! You just lost 10 goof points.");
				goofPoints = goofPoints - 10;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .25F) {
				System.out.println("Goofing off is totally the best option here. 5 goof points have been deducted.");
				goofPoints = goofPoints - 5;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .05F) {
				System.out.println("Working... -25 goof points!");
				goofPoints = goofPoints - 25;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .01F) {
				System.out.println(
						"Hard work pays off sometimes, but other times it costs you! You lose 69 goof points. vErY fuNnY jOkE.");
				goofPoints = goofPoints - 69;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}

			}

		}
		if (productivityLevel == 2) {
			if (productiveActionChance <= .1F) {
				System.out.println("wOrKinG iS nOt aN oPtIoN! 15 goof points have been lost.");
				goofPoints = goofPoints - 15;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .25F) {
				System.out.println("Working I see. -10 goof points from Gryffindor. Wait, this isn't Harry Potter.");
				goofPoints = goofPoints - 10;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();

				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .05F) {
				System.out.println(
						"A five percent chance at productivity level two will get you -30 goof points. Start goofing off a little bit!");
				goofPoints = goofPoints - 30;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .01F) {
				System.out.println("You doing work? What are the chances of that! -35 goof points.");
				goofPoints = goofPoints - 35;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
		}
		if (productivityLevel == 3) {
			if (productiveActionChance <= .1F) {
				if (watchList.contains(true)) {
					System.out.println(
							"You do just a bit of the assignment. You lose 25 goof points and have been removed from Grandma's watchlist.");
					goofPoints = goofPoints - 25;
					System.out.println("You now have " + goofPoints + " goof points.");
					watchList.clear();
					MiscMethods.outcomeAcknowledgement();

				} else {
					System.out.println("You do just a bit of the assignment. You lose 25 goof points.");
					goofPoints = goofPoints - 25;
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .25F) {
				System.out.println("Leave the work to the muffins. -20 goof points.");
				goofPoints = goofPoints - 20;
				System.out.println("You now have " + goofPoints + " goof points.");
				MiscMethods.outcomeAcknowledgement();
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .05F) {
				if (watchList.contains(true)) {
					System.out.println(
							"So you like working huh? Great for you if you like losing, hm let's say exactly 30 goof points?");
					System.out.println(
							"Oh yeah, you were removed from Grandma's watchlist as well. I guess that's a plus.");
					goofPoints = goofPoints - 30;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				} else {
					System.out.println(
							"So you like working huh? Great for you if you like losing, hm let's say exactly 30 goof points?");
					goofPoints = goofPoints - 30;
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .01F) {
				if (watchList.contains(true)) {
					System.out.println(
							"HOW DARE YOU WORK IN MY SWUMP!?!? -35 goof points. Also, you've been removed from the watchlist.");
					goofPoints = goofPoints - 35;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				} else {
					System.out.println("HOW DARE YOU WORK IN MY SWUMP!?!? -35 goof points.");
					goofPoints = goofPoints - 35;
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
		}
		if (productivityLevel == 4) {
			if (productiveActionChance <= .1F) {
				if (watchList.contains(true)) {
					System.out.println(
							"You did a good chunk of work and you were removed from the watch list, at the cost of 30 goof points.");
					goofPoints = goofPoints - 30;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
				} else {
					System.out.println("Grandma: Great work sugaboo! *pats you on the back*");
					System.out.println("the grandma.exe: *psst*, you just lost 30 goof points.");
					goofPoints = goofPoints - 30;
					System.out.println("You now have " + goofPoints + " goof points.");
				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .25F) {
				System.out.println("the 25 percent chance you didnt do yet -- in productiveActionChance");
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .05F) {
				System.out.println("the 5 percent chance you didnt do yet -- in productiveActionChance");
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .01F) {
				System.out.println("the 1 percent chance you didnt do yet -- in productiveActionChance");
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
		}
		if (productivityLevel == 5) {
			if (productiveActionChance <= .1F) {
				if (watchList.contains(true)) {
					System.out.println(
							"You did a great chunk of work and you were removed from the watch list, at the cost of 35 goof points.");
					goofPoints = goofPoints - 35;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();

				} else {

				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance <= .25F) {
				if (watchList.contains(true)) {
					System.out.println(
							"You did a good chunk of work and you were removed from the watch list, at the cost of 30 goof points.");
					goofPoints = goofPoints - 30;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();

				} else {
					System.out
							.println("You did a good chunk of work on the assignment, at the cost of 30 goof points.");
					goofPoints = goofPoints - 30;
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance == .05F) {
				if (watchList.contains(true)) {
					System.out.println(
							"You did a excellent chunk of work and you were removed from the watch list, at the cost of 40 goof points.");
					goofPoints = goofPoints - 40;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				} else {

				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
			if (productiveActionChance == .01F) {
				if (watchList.contains(true)) {
					System.out.println(
							"You did a outstanding chunk of work and you were removed from the watch list, at the cost of 45 goof points.");
					goofPoints = goofPoints - 45;
					watchList.clear();
					System.out.println("You now have " + goofPoints + " goof points.");
					MiscMethods.outcomeAcknowledgement();
				} else {

				}
				if (goofPoints < 0) {
					System.out.println("Game over! Press any number key to continue.");
					Scanner continueToTitleScreen = new Scanner(System.in);
					int pleaseContinue = continueToTitleScreen.nextInt();
					if (pleaseContinue == 1) {
						TitleScreen.returnToTitleScreen();
					} else {
						TitleScreen.returnToTitleScreen();
					}
				}
			}
		}
	}

	public static void goofReward() {
		float rewardGen = outcomeGen.nextFloat();
		System.out.println(outcomeGen.nextFloat());
		if (rewardGen <= .10F) {
			System.out.println("You talk to your friend. Grandma didn't notice. +20 goof points.");
			goofPoints = goofPoints + 20;
			System.out.println("You now have " + goofPoints + " goof points.");
			MiscMethods.outcomeAcknowledgement();
		}
		if (rewardGen <= .05F) {
			System.out.println("Grandma didn't notice you playing games on your chromebook. +35 goof points.");
			goofPoints = goofPoints + 35;
			System.out.println("You now have " + goofPoints + " goof points.");
			MiscMethods.outcomeAcknowledgement();
		}
		if (rewardGen <= .20F) {
			System.out.println("You turn around for a little while. Grandma didn't notice. +15 goof points.");
			goofPoints = goofPoints + 15;
			System.out.println("You now have " + goofPoints + " goof points.");
			MiscMethods.outcomeAcknowledgement();
		}
		if (rewardGen <= .01F) {
			System.out.println(
					"You go off task on your chromebook at FULL BRIGHTNESS. Grandma didn't notice. +40 goof points.");
			goofPoints = goofPoints + 40;
			System.out.println("You now have " + goofPoints + " goof points.");
			MiscMethods.outcomeAcknowledgement();
		}

	}

	public static int getGoofPoints() {

		return goofPoints;
	}
}
