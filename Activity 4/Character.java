/**
 * The Character class models a character for a roleplaying game. A character
 * has a name and 3 stats: strength, dexterity, and intelligence, as well as
 * maximum allowed life points and the current value.
 */

public class Character {

	/** static variables */

	static Dice dice = new Dice();

	/** instance variables */

	private String name;
	private int stength;
	private int dexterity;
	private int intelligence;
	private int maxLife;
	private int currentLife;

	/**
	 * Constructor takes 4 parameters: n,s,d,i and assigns them to instance
	 * variables name, strength, dexterity, intelligence. Also uses the dice
	 * instance to assign a random number to maxlife. currentlife is initialized to
	 * maxlife
	 */

	public Character(String n, int s, int d, int i) {

		this.name = n;
		this.stength = s;
		this.dexterity = d;
		this.intelligence = i;
		this.maxLife = dice.roll() * (this.getStrength() * 3);
		this.currentLife = this.getMaxLife();

	}

	/**
	 * Returns a random die roll using the roll method in the Dice.java, *modified
	 * by the character's strength
	 */
	public int attack(int opponentIntelligence) {

		int damage = (dice.roll() * this.getStrength() * this.getDexterity() / opponentIntelligence * 2);
		return damage;

	}

	/**
	 * Decreases currentlife by the damage parameter
	 */
	public void wound(int damage) {
		this.currentLife -= damage;
	}

	/**
	 * Increases currentlife by the heal parameter. currentlife cannot be greater
	 * than maxlife
	 */
	public void heal(int heal) {
		int lifeAfterHeal = this.currentLife += heal * this.getIntelligence();

		if (lifeAfterHeal > this.maxLife) {
			this.currentLife = this.maxLife;
		} else {
			this.currentLife = lifeAfterHeal;
		}
	}

	/**
	 * Returns name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns strength
	 */
	public int getStrength() {
		return this.stength;
	}

	/**
	 * Returns dexterity
	 */
	public int getDexterity() {
		return this.dexterity;
	}

	/**
	 * Returns intelligence
	 */
	public int getIntelligence() {
		return this.intelligence;
	}

	/**
	 * Returns currentlife
	 */
	public int getCurrentLife() {
		return this.currentLife;
	}

	/**
	 * Returns maxlife
	 */
	public int getMaxLife() {
		return this.maxLife;
	}
}
