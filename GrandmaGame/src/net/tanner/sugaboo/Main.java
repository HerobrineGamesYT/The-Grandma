package net.tanner.sugaboo;

public class Main {
	public static void main(String[] args) {
		// This is going to be a game titled "The Grandma".
		// In this game you are a student who has a strict substitute teacher
		// called grandma. Your mission is to make it through the class
		// period while goofing off as much as possible.
		// Ready to play? Click "Run" near the top to begin!
		// You can play the game similarly to the Oregon Trail with the console on the
		// right. Type the number of your decision, and hit enter to submit.
		// Do not mess with any of the files, or change anything in this box. This is
		// the game's source code, which is how it runs.
		// Without it, it won't work, and if you change how i've done it, unless you
		// know what you're doing, it won't work.
		// So don't mess with it!
		// Have fun!

		TitleScreenWithTutorial.titleScreenWithTutorial();
		public static int chance(float... vals) {
	        float total = 0.0f;
	        List<Float> prev_vals_list = new ArrayList<>();
	        List<Float> vals_list = new ArrayList<>();
	        for (float v : vals) {
	            prev_vals_list.add(v);
	            for (int i = 0; i < v; i++) {
	                vals_list.add(v);
	            }
	            total += v;
	        }
	        System.out.println(total);
	        if (100.0f > total) {
	            for (int i = 0; i < 100.0f - total; i++) {
	                vals_list.add(100.0f - total);
	            }
	            total += 100.0f - total;
	        }
	        System.out.println(total);
	        System.out.println(vals_list);
	        Random rand = new Random();
	        int chance = rand.nextInt(vals_list.size());
	        float temp = vals_list.get(chance);

	        for (int i = 0; i < prev_vals_list.size(); i++) {
	            if (prev_vals_list.get(i) == temp) {
	                return i + 1;
	            }
	        }

	        return 0;
	    }
	}
}
