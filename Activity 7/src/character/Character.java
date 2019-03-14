package character;

import item.Dice;

/**
 * The Character class models a character for a roleplaying game. A character
 * has a name and 3 main stats: strength, dexterity, and intelligence, as well
 * as maximum allowed life points, magic points and the current value.
 */

public abstract class Character {

	/** static variables */

	static Dice dice = new Dice();

	/** instance variables */

	private String name;
	private int strength;
	private int dexterity;
	private int intelligence;
	protected int maxLife;
	protected int maxMagic = 20;
	protected int minMagic = 5;
	private int currentMagic;
	protected int currentLife;
	private int armor;
	private int maxStrength = 10;
	private int maxDexterity = 10;
	private int maxIntelligence = 10;

	protected boolean isWizard;
	protected boolean isNinja;
	protected boolean isSwordsman;

	public boolean isWizard() {
		return isWizard;
	}

	public boolean isNinja() {
		return isNinja;
	}

	public boolean isSwordsman() {
		return isSwordsman;
	}

	/**
	 * Constructor takes 4 parameters: n,s,d,i and assigns them to instance
	 * variables name, strength, dexterity, intelligence. Also uses the dice
	 * instance to assign a random number to maxlife. currentlife is initialized to
	 * maxlife
	 */

	public Character(String n, int s, int d, int i) {

		this.name = n;
		this.strength = s;
		this.dexterity = d;
		this.intelligence = i;
		this.armor = (s * d) % 10;

		if (this.strength > 10) {
			this.strength = maxStrength;
		}

		if (this.dexterity > 10) {
			this.dexterity = maxDexterity;
		}

		if (this.intelligence > 10) {
			this.intelligence = maxIntelligence;
		}

		if (this.strength > 5) {
			this.maxLife = dice.roll(4) * (this.getStrength() * 3);
		} else if (this.strength < 5) {
			this.maxLife = dice.roll(3) * (this.getStrength() * 2);
		}
		this.currentLife = this.getMaxLife();

	}

	/**
	 * Returns a random die roll using the roll method in the Dice.java, *modified
	 * by the character's strength
	 */

	public abstract int attack(int opponentarmor);

	/*
	 * int damage = ((dice.roll(2) * this.getStrength() * this.getDexterity() * 2) /
	 * (opponentarmor * 2)); return damage;
	 */

	/*
	 * public int magicattack(int opponentStrength) {
	 * 
	 * int magicdamage = ((dice.roll(2) * this.getStrength() * this.getDexterity() *
	 * 2) / (opponentStrength * 2)); return magicdamage;
	 * 
	 * }
	 */

	/**
	 * Decreases currentlife by the damage parameter
	 */
	public void wound(int damage) {
		this.currentLife -= damage;
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
		return this.strength;
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

	/**
	 * Returns maxlife
	 */

	public int getArmor() {
		return this.armor;
	}

	/**
	 * Returns currentmagic
	 */

	public int getCurrentMagic() {
		return this.currentMagic;
	}

	/**
	 * Sets currentmagic to the value
	 */
	public void setCurrentMagic(int currentMagic) {
		this.currentMagic = currentMagic;
	}

	/**
	 * Returns maxmagic
	 */
	public int getMaxMagic() {
		return this.getMaxMagic();
	}

	/**
	 * Increases currentlife. currentlife cannot be greater than maxlife
	 */
	public void castHeal() {
		int healAmount, lifeAfterHeal;
		if (this.getCurrentMagic() >= 3) {
			this.setCurrentMagic(this.getCurrentMagic() - 3);
			int lifeBeforeHealChar1 = this.getCurrentLife();
			healAmount = dice.roll(2) * (this.getIntelligence() * 2 % 10);
			lifeAfterHeal = this.currentLife += healAmount;

			int healedHp = this.getCurrentLife() - lifeBeforeHealChar1;

			System.out
					.println(this.getName() + " health is low and cast heal for " + healedHp + " health regeneration.");

		} else {

			// System.out.println(this.getName() + "tries to use heal but is out of Magic
			// points.");
			healAmount = 0;
		}

		lifeAfterHeal = this.currentLife += healAmount;

		if (lifeAfterHeal > this.maxLife) {
			this.currentLife = this.maxLife;
		} else {
			this.currentLife = lifeAfterHeal;
		}
	}

}
