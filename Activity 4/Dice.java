import java.util.Random;

public class Dice {

	/** instance variables */
	Random r = new Random();

	/**
	 * Instantiate the object r
	 */
	public Dice() {

	}

	/**
	 * Return a random integer between 1 and 6
	 */

	public int roll() {
		return 1 + r.nextInt(6);
	}

}
